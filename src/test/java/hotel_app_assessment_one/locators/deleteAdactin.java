package hotel_app_assessment_one.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class deleteAdactin {

    protected WebDriver driver;

    public deleteAdactin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()[contains(.,'Booked Itinerary')]]")
    public WebElement bookedItineraryLink;

    @FindBy(xpath = "//*[@id=\"search_result_error\"]")
    public WebElement search_result_error;

}
