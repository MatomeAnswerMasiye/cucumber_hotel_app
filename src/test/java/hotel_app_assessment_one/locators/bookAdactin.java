package hotel_app_assessment_one.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class bookAdactin {

    protected WebDriver driver;

    //Constructor
    public bookAdactin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    //Webelements for the booking page
    @FindBy(xpath = "//*[@id=\"first_name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"address\"]")
    public WebElement billingAddress;

    @FindBy(xpath = "//*[@id=\"cc_num\"]")
    public WebElement creditCardNo;

    @FindBy(xpath = "//*[@id=\"cc_type\"]")
    public WebElement creditCardType;

    @FindBy(xpath = "//*[@id=\"cc_exp_month\"]")
    public WebElement ccExpiryMonth;
    @FindBy(xpath = "//*[@id=\"cc_exp_year\"]")
    public WebElement ccExpiryYear;
    @FindBy(xpath = "//*[@id=\"cc_cvv\"]")
    public WebElement cvvNumber;
    @FindBy(xpath = "//*[@id=\"order_no\"]")
    public WebElement orderNumber;
    @FindBy(xpath = "//*[@id=\"book_now\"]")
    public WebElement bookNowButton;

}
