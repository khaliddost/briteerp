package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space(text())=\"Inventory\"]")
    public WebElement Inventory;


    @FindBy(xpath = "//a[@data-action-id='521']")
    public WebElement Products;


    @FindBy(xpath = "//button[normalize-space(text())=\"Create\"]")
    public WebElement CreateButton;



    @FindBy(id= "o_field_input_479")
    public WebElement ProductNameField;



    @FindBy(xpath="//div[@class='o_form_buttons_edit']//button[1]")
    public WebElement SaveButton;



    @FindBy(xpath="//ol[@class='breadcrumb']//li[2]")
    public WebElement OrderedList;




}
