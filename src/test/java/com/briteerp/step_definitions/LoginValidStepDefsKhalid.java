package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPageK;
import com.briteerp.utilities.ConfigurationReaderK;
import com.briteerp.utilities.DriverK;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginValidStepDefsKhalid {
    LoginPageK briteeploginPage = new LoginPageK();

    @Given("Given user user is on the login page of briteerp application")
    public void givenUserUserIsOnTheLoginPageOfBriteerpApplication() {
        DriverK.getDriver().get(ConfigurationReaderK.getProperty("url"));
    }


    @When("user enter a valid POS email address")
    public void userEnterAValidPOSEmailAddress() {
        briteeploginPage.userName.sendKeys(ConfigurationReaderK.getProperty("POS_manager_username"));


    }

    @And("User type a valid POS password")
    public void userTypeAValidPOSPassword() {
        briteeploginPage.password.sendKeys(ConfigurationReaderK.getProperty("POS_manager_password"));
        briteeploginPage.submit.click();
    }

    @Then("user should be able to see #Inbox - Odoo")
    public void userShouldBeAbleToSeeInboxOdoo() {
        Assert.assertTrue(DriverK.getDriver().getTitle().contains("Odoo"));



    }
}
