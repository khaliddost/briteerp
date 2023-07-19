package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.SalesModulePage;
import com.briteerp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_Zina_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    SalesModulePage salesModulePage = new SalesModulePage();

    @Given("User is logged in as Sales Manager")
    public void user_is_logged_in_as_sales_manager() {
        loginPage.loginDynamic("sales manager");

    }


    @When("User click on {string} module")
    public void user_click_on_module(String module) {
        salesModulePage.salesButton.click();

    }

    @When("User clicks on {string} field")
    public void user_clicks_on_field(String field) {
        salesModulePage.customersButton.click();
        BrowserUtils.sleep(15);

    }



    @Then("User sees {string} as briteerp title")
    public void userSeesAsBriteerpTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);

    }



    @When("User click on Create button")
    public void userClickOnCreateButton() {
        salesModulePage.createButton.click();

    }

    @And("User enters new customers {string} into input box")
    public void userEntersNewCustomersIntoInputBox(String customerName) {
        salesModulePage.nameField.sendKeys(customerName);

    }


    @And("User click Save button")
    public void userClickSaveButton() {
        salesModulePage.saveButton.click();
        BrowserUtils.sleep(15);
    }

    @Then("User should see customer's {string} displayed")
    public void userShouldSeeCustomerSDisplayed(String expectedName) {
        String actualName = salesModulePage.customersList.getText();
        BrowserUtils.sleep(5);

        Assert.assertEquals(expectedName, actualName);


    }

}
