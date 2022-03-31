package hotel_app_assessment_one.stepDefinition;


import hotel_app_assessment_one.data.connectAndRetrieveData;
import hotel_app_assessment_one.features.HotelRunner;
import hotel_app_assessment_one.fileHandler.readFromProps;
import hotel_app_assessment_one.validations.validations;
import hotel_app_assessment_one.webFunctions.webFunctions;
import hotel_app_assessment_one.webUtilities.webActions;
import hotel_app_assessment_one.webUtilities.webUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class MyStepdefs extends webActions {

    webFunctions functions = new webFunctions();
    webUtilities web = new webUtilities();
    validations validate = new validations();
    connectAndRetrieveData retrieve = new connectAndRetrieveData();
    readFromProps read = new readFromProps();
    ResultSet loginData;
    ResultSet hotelData;

    //Runs before each scenario
    @Before
    public void setUp(){

        //key-value data structures that store data/details
        HashMap<String,String> dataFromProps = read.readConfigData();
        HashMap<String,ResultSet> databaseData = retrieve.initializeConnection();

        //Pass data into the loginData and hotelData ResultSet variables from the hashmaps
        loginData = databaseData.get("loginData");
        hotelData = databaseData.get("hotelData");

        //launch browser and navigate to url
        web.setWebDriver(web.initializeWebDriver(dataFromProps.get("browser")));
        web.navigateToUrl(dataFromProps.get("adactinUrl"));

        //Database connection

    }

    @Given("^a user is on the login page$")
    public void a_user_is_on_the_login_page() {
        System.out.println("A user is on the login page");
    }

    @When("^the user enters a username and password clicks login$")
    public void the_user_enters_a_username_and_password_clicks_login() throws SQLException {
        
        try{

            while (loginData.next()){
                functions.login(web.getWebDriver(), loginData.getString("username"), loginData.getString("password"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @And("^the user populates fields in the search page and clicks search$")
    public void the_user_populates_fields_in_the_search_page_and_clicks_search() throws SQLException {


        try{

            while (hotelData.next()){
                functions.search(web.getWebDriver(), hotelData.getString("location"), hotelData.getString("hotels"),
                        hotelData.getString("numberOfRooms"), hotelData.getString("checkInDate"), hotelData.getString("checkOutDate"), hotelData.getString("adultsPerRoom"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @And("^the user selects a hotel from hotel selection page and clicks continue$")
    public void the_user_selects_a_hotel_from_hotel_selection_page_and_clicks_continue() {
        functions.select(web.getWebDriver());
    }

    @And("^the user populates fields in the book hotel page and clicks book now$")
    public void the_user_populates_fields_in_the_book_hotel_page_and_clicks_book_now(){

        try{

            hotelData.beforeFirst();

            while (hotelData.next()){
                functions.book(web.getWebDriver(), hotelData.getString("firstName"), hotelData.getString("lastName"), hotelData.getString("billingAddress"),
                        hotelData.getString("creditCardNumber"), hotelData.getString("creditCardType"), hotelData.getString("expiryDateMonth"),
                        hotelData.getString("expiryDateYear"), hotelData.getString("cvvNumber"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Then("^an order number is generated and the booking was successful$")
    public void an_order_number_is_generated_and_the_booking_was_successful() {
        validate.confirmBookHotel(web.getWebDriver());
    }

    //Step definitions for scenario 2 start here
    @And("^the user navigates to the booked itinerary page by clicking on the Booked Itinerary link$")
    public void the_user_navigates_to_the_booked_itinerary_page_by_clicking_on_the_Booked_Itinerary_link() {
        functions.navigateToBookedItinerary(web.getWebDriver());
    }

    @And("^the user enters an order number into the search box and clicks on the go button$")
    public void the_user_enters_an_order_number_into_the_search_box_and_clicks_on_the_go_button() {
        functions.searchForItinerary(web.getWebDriver());
    }

    @And("^the user deletes the itinerary by clicking on the checkbox and then clicking on the cancel selected button and confirm on the popup alert box$")
    public void the_user_deletes_the_itinerary_by_clicking_on_the_checkbox_and_then_clicking_on_the_cancel_selected_button_and_confirm_on_the_popup_alert_box() throws InterruptedException {
        functions.deleteSearched(web.getWebDriver());
    }

    @And("^the user searches for the order number again$")
    public void the_user_searches_for_the_order_number_again() {
        functions.searchForItinerary(web.getWebDriver());
    }

    @Then("^The itinerary is not found$")
    public void the_itinerary_is_not_found() {
        validate.confirmDelete(web.getWebDriver());
    }

    //Runs after each scenario
    @After
    public void cleanUp() throws InterruptedException {

        try {

            functions.logout(web.getWebDriver());
            retrieve.closeDbConnections(loginData,hotelData);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Thread.sleep(2000);
            web.getWebDriver().quit();
        }

    }

}
