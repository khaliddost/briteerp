package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.SalesModulePage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

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
        BrowserUtils.sleep(15);


    }

    @When("User clicks on {string} field")
    public void user_clicks_on_field(String field) {

        salesModulePage.customersButton.click();
        BrowserUtils.sleep(10);

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
        String actualName = salesModulePage.customerInfo.getText();
        BrowserUtils.sleep(5);

        Assert.assertEquals(expectedName, actualName);

    }

    //-------------------------------------------------------------------------------


    @When("User click on AA BB name")
    public void userClickOnName() {
        salesModulePage.AABBName.click();

    }

/*
    @When("User click on {string} name")
    public void userClickOnName(String name) {
        List<String> NameList = new ArrayList<>();

        for (WebElement eachName : salesModulePage.customerNameList) {
            if (eachName.getText().equals(name)) {
                eachName.click();
                BrowserUtils.sleep(5);
            }
        }
    }
*/

    @When("User clicks on edit button")
        public void user_clicks_on_edit_button () {

        salesModulePage.editButton.click();
    }


        @Then("User should see that all the fields with entered information are editable")
        public void user_should_see_that_all_the_fields_with_entered_information_are_editable () {



            for (WebElement eachField : salesModulePage.inputFieldList){

               Assert.assertTrue("The input field should be editable", eachField.isEnabled());
            }

 /*   String newName= "A2 B2";

            salesModulePage.customerName.clear();
            salesModulePage.customerName.sendKeys(newName);
            salesModulePage.saveButton.click();
            BrowserUtils.sleep(10);

            Assert.assertEquals(newName,salesModulePage.customerName.getText());
*/

    }



}





