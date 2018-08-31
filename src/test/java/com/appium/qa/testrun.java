package com.appium.qa;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html", "json:output/report.json"},
        glue = "src/test/java/com/appium/qa",
        tags = {"@telegraphweblogin"}
        //to run locally in console type: mvn clean install test -Dtest=testrun

)
public class testrun {

}
