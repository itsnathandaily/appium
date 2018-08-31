package com.appium.qa.StepDefs;

import com.appium.qa.driver.androidDependency;
import cucumber.api.java.en.Given;


public class websiteStepDefs extends androidDependency {
    @Given("^I open the telegraph website$")
    public void i_open_the_telegraph_website() throws Throwable {
        androidWebCapabilities();
        driver.get("http://www.telegraph.co.uk");

    }

    @Given("^I log into the website$")
    public void i_log_into_the_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
