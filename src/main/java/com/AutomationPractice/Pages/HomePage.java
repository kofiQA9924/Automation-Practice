package com.AutomationPractice.Pages;

import com.AutomationPractice.Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RUTHERFORD on 3/30/2021.
 */
public class HomePage extends BaseClass {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    @CacheLookup
    WebElement Sign_inbutton;

    @FindBy(xpath = "//input[@id='email_create']")
    @CacheLookup
    WebElement emailfield;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    @CacheLookup
    WebElement createaccount;

    @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/h3")
    @CacheLookup
    WebElement successMsg;

    public void setSign_inbutton(){
        Sign_inbutton.click();
    }
    public void setEmailfield(String uemail){
        emailfield.sendKeys(uemail);
    }
    public void setCreateaccount(){
        createaccount.click();
    }
    public boolean setSuccessMsg(){
        successMsg.isDisplayed();
        return true;
    }
}
