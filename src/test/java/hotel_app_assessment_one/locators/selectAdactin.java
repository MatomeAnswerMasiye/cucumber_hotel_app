package hotel_app_assessment_one.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class selectAdactin {

    protected WebDriver driver;

    public selectAdactin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//*[@id=\"radiobutton_1\"]")
    public WebElement radioButton;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebElement continueButton;

}
