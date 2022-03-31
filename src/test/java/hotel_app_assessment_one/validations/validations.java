package hotel_app_assessment_one.validations;

import hotel_app_assessment_one.fileHandler.fileHandler;
import hotel_app_assessment_one.locators.bookAdactin;
import hotel_app_assessment_one.locators.deleteAdactin;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class validations {

    bookAdactin bookObj;
    fileHandler fileObj;
    deleteAdactin deleteObj;

    //book hotel confirmation
    public void confirmBookHotel(WebDriver driver){
        bookObj = new bookAdactin(driver);
        fileObj = new fileHandler();

        String orderNum;

        try{

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            if(bookObj.orderNumber.isDisplayed()){

                orderNum = bookObj.orderNumber.getAttribute("value");

                fileObj.writeToTxt(orderNum);

            }else{
                System.out.println("Hotel was not booked successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Delete itinerary validation
    public void confirmDelete(WebDriver driver){

        deleteObj = new deleteAdactin(driver);

        try{
            if(deleteObj.search_result_error.isDisplayed()){
                System.out.println("Itinerary successfully deleted");
            }else{
                System.out.println("Itinerary was not successfully deleted");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
