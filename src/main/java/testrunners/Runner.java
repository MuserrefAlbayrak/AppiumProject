package testrunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.DriverFactory;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions","util"},
        tags = "@n11",
        dryRun = false,
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)


public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();
}
