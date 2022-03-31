package hotel_app_assessment_one.webUtilities;

import hotel_app_assessment_one.locators.loginAdactin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class webActions{

    //Click web action
    public static void clickObject(WebElement element, WebDriver driver)
    {
        try
        {
            if (element.isDisplayed())
            {
                Wait<WebDriver> wait = new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(1000))
                        .ignoring(WebDriverException.class);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //SendKeys web action
    public static void passData(WebElement element,WebDriver driver,String data){

        try{

            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(1000))
                    .ignoring(WebDriverException.class);
            wait.until(ExpectedConditions.elementToBeClickable(element));

            element.clear();
            element.sendKeys(data);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Dropdown web action
    public static void dropdownHandler(WebElement element,WebDriver driver,String selectBy,Object selectValue){

        Select sel = new Select(element);

        try{

            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(1000))
                    .ignoring(WebDriverException.class);
            wait.until(ExpectedConditions.elementToBeClickable(element));

            switch (selectBy.toUpperCase()){
                case "INDEX":
                    sel.selectByIndex((Integer) selectValue);
                    break;
                case "VISIBLETEXT":
                    sel.selectByVisibleText((String) selectValue);
                    break;
                case "VALUE":
                    sel.selectByValue((String) selectValue);
                    break;
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
