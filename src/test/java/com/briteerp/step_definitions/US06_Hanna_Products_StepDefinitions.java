package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.US06_Hanna_ProductsPage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class US06_Hanna_Products_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    US06_Hanna_ProductsPage productsPage = new US06_Hanna_ProductsPage();


    @Given("the User logged in as {string}")
    public void the_user_logged_in_as(String userType) {
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
        String actualName = productsPage.OrderedList.getText();
        BrowserUtils.sleep(2);

        Assert.assertEquals(actualName, expectedName);
    }

    ///////////////////////////////////////////////////////////////
    @When("User clicks {string}")
    public void user_clicks(String string) {
        productsPage.BookProduct.click();
    }

    @When("User clicks Edit button")
    public void user_clicks_edit_button() {
        productsPage.EditButton.click();

    }

    @Then("User enters {string}")
    public void user_enters(String New_name) {

        productsPage.BookNameField.clear();

        productsPage.BookNameField.sendKeys(New_name);


    }


    @And("User enters the {string}")
    public void userEntersThe(String newReference) {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

        productsPage.InternalReference.sendKeys(newReference);


    }

    @And("User enters new {string}")
    public void userEntersNew(String newBarcode) {
        BrowserUtils.sleep(5);
        productsPage.Barcode.sendKeys(newBarcode);

    }


    @And("User selects Product Type {string}")
    public void userSelectsProductType(String arg0) {

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='type']")));
        select.selectByVisibleText(arg0);


    }

    @And("User selects Category Type {string}")
    public void userSelectsCategoryType(String arg0) {
        productsPage.Category.click();
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ARROW_DOWN).perform();
        BrowserUtils.sleep(3);
        actions.sendKeys(Keys.RETURN).perform();
        BrowserUtils.sleep(3);


    }


    @And("User fills {string}")
    public void userFields(String arg0) {
        productsPage.NewPrice.clear();
        productsPage.NewPrice.sendKeys(arg0);

    }

    @And("User adds {string}")
    public void userAdds(String newCost) {
        productsPage.Cost.clear();
        productsPage.Cost.sendKeys(newCost);

    }


}


