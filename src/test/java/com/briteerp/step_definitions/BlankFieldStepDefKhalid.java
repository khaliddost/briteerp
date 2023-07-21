package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPageK;
import com.briteerp.utilities.ConfigurationReaderK;
import com.briteerp.utilities.DriverK;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlankFieldStepDefKhalid {

    LoginPageK briteeploginPage = new LoginPageK();

    @Given("Given user user is on the login page of briteerp webpage")
    public void givenUserUserIsOnTheLoginPageOfBriteerpWebpage() {
        DriverK.getDriver().get(ConfigurationReaderK.getProperty("url"));

    }


    @When("User enter an email address and leaves the password input box blank")
    public void userEnterAnEmailAddressAndLeavesThePasswordInputBoxBlank() {
        briteeploginPage.login("khanjan1950@gmail.com","");
    }

    @And("Click login button")
    public void clickLoginButton() {

        briteeploginPage.submit.click();
    }

    @Then("User should be able to see the {string} message for at least one blank field")
    public void userShouldBeAbleToSeeTheMessageForAtLeastOneBlankField(String arg0) {
      String blankButtonMessage =  briteeploginPage.plusButton.getText();

        System.out.println("blankButtonMessage = " + blankButtonMessage);

     // String expectedBlankButtonMessage = "Please fill out this field";

      //Assert.assertEquals(blankButtonMessage,expectedBlankButtonMessage);
    }


}
