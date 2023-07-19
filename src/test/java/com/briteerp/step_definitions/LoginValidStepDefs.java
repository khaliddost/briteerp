package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginValidStepDefs {
    LoginPage briteeploginPage = new LoginPage();

    @Given("Given user user is on the login page of briteerp application")
    public void givenUserUserIsOnTheLoginPageOfBriteerpApplication() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enter a valid POS email address")
    public void userEnterAValidPOSEmailAddress() {
        briteeploginPage.userName.sendKeys(ConfigurationReader.getProperty("POS_manager_username"));


    }

    @And("User type a valid POS password")
    public void userTypeAValidPOSPassword() {
        briteeploginPage.password.sendKeys(ConfigurationReader.getProperty("POS_manager_password"));
        briteeploginPage.submit.click();
    }

    @Then("user should be able to see #Inbox - Odoo")
    public void userShouldBeAbleToSeeInboxOdoo() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));



    }
}
