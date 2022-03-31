package hotel_app_assessment_one.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/hotel_app_assessment_one/features",
        tags = "@BookSuccessfully or @DeleteItinerary",
        glue = {"hotel_app_assessment_one.stepDefinition"},
        plugin = {"pretty", "html:target/cucumber.html"},
        monochrome = true
)


public class HotelRunner{


}