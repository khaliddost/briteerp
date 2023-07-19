package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.ProductsPage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Products_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    ProductsPage productsPage=new ProductsPage();


    @Given("the User logged in as {string}")
    public void the_user_logged_in_as(String userType)
    {
        loginPage.loginDynamic(userType);
    }
    @Then("User clicks Inventory module")
    public void user_clicks_inventory_module() {
        productsPage.Inventory.click();

    }
    @Then("User clicks Products page")
    public void user_clicks_products_page() {
        productsPage.Products.click();
        BrowserUtils.sleep(5);

    }
    @When("User clicks Create button")
    public void user_clicks_create_button() {
        productsPage.CreateButton.click();
        BrowserUtils.sleep(5);

    }
    @When("User adds only {string}")
    public void user_adds_only(String productName) {

        productsPage.ProductNameField.sendKeys(productName);
        BrowserUtils.sleep(2);


    }
    @When("User clicks Save button")
    public void user_clicks_save_button() {
     productsPage.SaveButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("User sees {string} is displayed")
    public void user_sees_is_displayed(String expectedName) {
        String actualName=productsPage.OrderedList.getText();
        BrowserUtils.sleep(2);

        Assert.assertEquals(actualName,expectedName);
    }

}
