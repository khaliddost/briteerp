package com.briteerp.pages;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SalesModulePage {

    public SalesModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']") // //a[@data-menu='447']
    public WebElement customersButton;

    @FindBy(xpath = "//button[normalize-space(text())=\"Create\"]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[2]") // //div[@class='o_content']//span[1]
    public WebElement customerInfo;

 //  @FindBy(xpath = "//div/strong/span")  //div[@class='o_content']//div[2]//strong[1]//span
  //  public List <WebElement> customerNameList;

   @FindBy(xpath = "//span[normalize-space(text())='AA BB']")
   public WebElement AABBName;



    /*
    public void clickOnName(List<String> listOfNames) {
        List <String>NameList = new ArrayList<>();
        Actions actions = new Actions(Driver.getDriver());

        for (WebElement eachName : customerNameList) {

        }



 }

*/
    @FindBy(xpath = "//button[normalize-space(text())=\"Edit\"]")  // btn btn-primary btn-sm o_form_button_edit // //button[normalize-space(text())="Edit"]
    public WebElement editButton;

    @FindBy(name = "name" )
    public WebElement customerName;

  /*  //-------------------------------------------------------------------------------------------
    //Customer's info card

    @FindBy(id = "o_field_input_38")
    public WebElement name;

    @FindBy(id = "o_field_input_39")
    public WebElement companyDropdown;

    @FindBy(id = "o_field_input_42")
    public WebElement streetInput_1;

    @FindBy(id = "o_field_input_43")
    public WebElement streetInput_2;

    @FindBy(id = "o_field_input_44")
    public WebElement cityInput;

    @FindBy(id = "o_field_input_45")
    public WebElement stateDropdown;

    @FindBy(id = "o_field_input_46")
    public WebElement zipInput;


    @FindBy(id = "o_field_input_47")
    public WebElement countryDropdown;


    @FindBy(id = "o_field_input_48")
    public WebElement tinInput;

    @FindBy(id = "o_field_input_49")
    public WebElement tagInput;

    @FindBy(id = "o_field_input_50")
    public WebElement jobPositionInput;


    @FindBy(id = "o_field_input_51")
    public WebElement PhoneNumberInput;

    @FindBy(id = "o_field_input_52")
    public WebElement mobileInput;

    @FindBy(id = "o_field_input_54")
    public WebElement emailInput;


    @FindBy(id = "o_field_input_55")
    public WebElement websiteInput;


    @FindBy(id = "o_field_input_56")
    public WebElement titleDropdown;


    @FindBy(id = "o_field_input_57")
    public WebElement languageDropdown;
*/

    @FindBy(xpath = "input[contains(@id, 'o_field_input')]" )
    public List <WebElement> inputFieldList;


}














