package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPageK;
import com.briteerp.utilities.ConfigurationReaderK;
import com.briteerp.utilities.DriverK;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginInvalidStepDefsKhalid {
    LoginPageK briteeploginPage = new LoginPageK();
        @When("user enter a valid eventCRM manager address")
    public void userEnterAValidEventCRMManagerAddress() {
        DriverK.getDriver().get(ConfigurationReaderK.getProperty("url"));

    }

    
    @And("User type a valid eventCRM manager password")
    public void userTypeAValidEventCRMManagerPassword() {
        briteeploginPage.login("Khalid2023@hotmail.com","12345678");

         
    }


    @Then("user should be able to see Wrong login\\/password message")
    public void userShouldBeAbleToSeeWrongLoginPasswordMessage() {

       String wrongMessage= briteeploginPage.wrongMessageDisplay.getText();

        Assert.assertEquals("Wrong login/password",wrongMessage);

        DriverK.getDriver().quit();



    }
}



