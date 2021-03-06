package hotel_app_assessment_one.webUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class webUtilities {

    protected static WebDriver driver;

    public static WebDriver getWebDriver(){
        return driver;
    }

    public void setWebDriver(WebDriver theWebDriver){
        this.driver = theWebDriver;
    }

    public WebDriver initializeWebDriver(String sBrowser){
        switch (sBrowser.toUpperCase()){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "IE":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

        }

        driver.manage().window().maximize();
        return driver;
    }



    public void navigateToUrl(String url){

        driver.get(url);

    }
}
