package hotel_app_assessment_one.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class searchForExisitingItinerary {

    protected WebDriver driver;

    public searchForExisitingItinerary(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//*[@id=\"order_id_text\"]")
    public WebElement orderNumberSearchBox;

    @FindBy(xpath = "//*[@id=\"search_hotel_id\"]")
    public WebElement goButton;

    @FindBy(xpath = "//*[@id=\"check_all\"]")
    public WebElement checkBox;

    @FindBy(name = "cancelall")
    public WebElement cancelSelectedButton;

}
