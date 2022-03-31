package hotel_app_assessment_one.webFunctions;

import hotel_app_assessment_one.fileHandler.fileHandler;
import hotel_app_assessment_one.locators.*;
import hotel_app_assessment_one.webUtilities.webActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class webFunctions extends webActions {

    loginAdactin loginObj;
    searchAdactin searchObj;
    selectAdactin selectObj;
    bookAdactin bookObj;
    logoutAdactin logoutObj;
    deleteAdactin deleteObj;
    searchForExisitingItinerary itineraryObj;
    fileHandler fileObj;

    //Login
    public void login(WebDriver driver,String username,String password){

        loginObj  = new loginAdactin(driver);

        try{

            passData(loginObj.txtUsername,driver,username);
            passData(loginObj.txtPassword,driver,password);
            clickObject(loginObj.btnLogin,driver);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    //Search for hotel from search page
    public void search(WebDriver driver,String loc,String hotel,String noOfRooms,String cInDate,String cOutDate,String adultsPerRoom){

        searchObj = new searchAdactin(driver);

        try{

            dropdownHandler(searchObj.location,driver,"visibletext",loc);
            dropdownHandler(searchObj.hotels,driver,"visibletext",hotel);
            dropdownHandler(searchObj.noOfRooms,driver,"visibletext",noOfRooms);
            passData(searchObj.checkInDate,driver,cInDate);
            passData(searchObj.checkOutDate,driver,cOutDate);
            dropdownHandler(searchObj.adultsPerRoom,driver,"visibletext",adultsPerRoom);

            clickObject(searchObj.searchButton,driver);

        }catch(Exception e){
          e.printStackTrace();
        }

    }

    //Select hotel from hotel selection page
    public void select(WebDriver driver){

        selectObj = new selectAdactin(driver);

        try{

            clickObject(selectObj.radioButton,driver);
            clickObject(selectObj.continueButton,driver);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    //Book hotel
    public void book(WebDriver driver,String fname,String lname,String bAddress,String ccNum,String ccType,String expMonth,String expYear,String cvv){

        bookObj = new bookAdactin(driver);

        try{

            passData(bookObj.firstName,driver,fname);
            passData(bookObj.lastName,driver,lname);
            passData(bookObj.billingAddress,driver,bAddress);
            passData(bookObj.creditCardNo,driver,ccNum);
            dropdownHandler(bookObj.creditCardType,driver,"visibletext",ccType);
            dropdownHandler(bookObj.ccExpiryMonth,driver,"visibletext",expMonth);
            dropdownHandler(bookObj.ccExpiryYear,driver,"visibletext",expYear);
            passData(bookObj.cvvNumber,driver,cvv);
            clickObject(bookObj.bookNowButton,driver);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    //Navigate to booked itinerary
    public void navigateToBookedItinerary(WebDriver driver){
        deleteObj = new deleteAdactin(driver);

        try{

            clickObject(deleteObj.bookedItineraryLink,driver);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Search for booked itinerary
    public void searchForItinerary(WebDriver driver){

        itineraryObj = new searchForExisitingItinerary(driver);
        fileObj = new fileHandler();
        String orderNum = null;

        try{

            orderNum = fileObj.readFromTxt();

            passData(itineraryObj.orderNumberSearchBox,driver,orderNum);
            clickObject(itineraryObj.goButton,driver);


        }catch (Exception e){
            e.printStackTrace();
        }


    }

    //Delete searched itinerary
    public void deleteSearched(WebDriver driver){

        itineraryObj = new searchForExisitingItinerary(driver);

        try{

            clickObject(itineraryObj.checkBox,driver);
            clickObject(itineraryObj.cancelSelectedButton,driver);

            Thread.sleep(3000);
            driver.switchTo().alert().accept();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    //Logout
    public void logout(WebDriver driver){
        logoutObj = new logoutAdactin(driver);

        try{
            Thread.sleep(5000);
            clickObject(logoutObj.logoutButton,driver);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
