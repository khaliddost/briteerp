package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlankFieldStepDefKhalid {

    LoginPage briteeploginPage = new LoginPage();

    @Given("Given user user is on the login page of briteerp webpage")
    public void givenUserUserIsOnTheLoginPageOfBriteerpWebpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

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
