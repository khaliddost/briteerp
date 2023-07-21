package com.briteerp.pages;


import com.briteerp.utilities.DriverK;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageK {

    public LoginPageK(){
        PageFactory.initElements(DriverK.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath ="//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/p")
    public WebElement wrongMessageDisplay;


    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/input[1]")
    public WebElement blankMessageDisplay;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
