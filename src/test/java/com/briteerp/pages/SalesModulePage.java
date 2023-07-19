package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesModulePage {

    public SalesModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement customersButton;

    @FindBy(xpath = "//button[normalize-space(text())=\"Create\"]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[2]") // //div[@class='o_content']//span[1]
    public WebElement customersList;












}
