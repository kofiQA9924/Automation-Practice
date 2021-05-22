package com.AutomationPractice.Pages;

import com.AutomationPractice.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.WindowAdapter;

/**
 * Created by RUTHERFORD on 3/31/2021.
 */
public class AccountRegistrationPage extends BaseClass {
    public AccountRegistrationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='id_gender1']")
    @CacheLookup
    WebElement Title;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    @CacheLookup
    WebElement firstname;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    @CacheLookup
    WebElement lastname;

    @FindBy(xpath = "//*[@id='passwd']")
    @CacheLookup
    WebElement password;// Hint: Five characters minimum

    @FindBy(xpath = "//*[@id=\"days\"]")
    @CacheLookup
    WebElement DoBDay;

    @FindBy(xpath = "//*[@id=\"months\"]")
    @CacheLookup
    WebElement DoBMonth;

    @FindBy(xpath = "//*[@id=\"years\"]")
    @CacheLookup
    WebElement DoBYear;

    @FindBy(xpath = "//*[@id='firstname']")
    @CacheLookup
    WebElement addressfirstname;

    @FindBy(xpath = "//*[@id='lastname']")
    @CacheLookup
    WebElement addresslastname;

    @FindBy(xpath = "//*[@id='company']")
    @CacheLookup
    WebElement company;

    @FindBy(xpath = "//*[@id='address1']")
    @CacheLookup
    WebElement address;

    @FindBy(xpath = "//*[@id='address2']")
    @CacheLookup
    WebElement addressLine2;

    @FindBy(xpath = "//*[@id='city']")
    @CacheLookup
    WebElement city;

    @FindBy(xpath = "//*[@id='id_state']")
    @CacheLookup
    WebElement state;

    @FindBy(xpath = "//*[@id='postcode']")
    @CacheLookup
    WebElement zipcode;

    @FindBy(xpath = "//*[@id='other']")
    @CacheLookup
    WebElement addinfo;

    @FindBy(xpath = "//*[@id='phone']")
    @CacheLookup
    WebElement homephone;

    @FindBy(xpath = "//*[@id='phone_mobile']")
    @CacheLookup
    WebElement mobilephone;

    @FindBy(xpath = "//*[@id='alias']")
    @CacheLookup
    WebElement alias;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    @CacheLookup
    WebElement register;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    @CacheLookup
    WebElement info_account;

    public void setTitle(){
        Title.click();
    }
    public void setFirstname(String fname){
        firstname.sendKeys(fname);
    }
    public void setLastname(String lname){
        lastname.sendKeys(lname);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void setDoB(){
        Select day=new Select(DoBDay);
        day.selectByIndex(2);

        Select month=new Select(DoBMonth);
        month.selectByIndex(3);

        Select year=new Select(DoBYear);
        year.selectByIndex(4);
    }
    public void setAddressfirstname(String afname){
        addressfirstname.sendKeys(afname);
    }
    public void setAddresslastname(String alfname){
        addresslastname.sendKeys(alfname);
    }
    public void setCompany(String cmpny){
        company.sendKeys(cmpny);
    }
    public void setAddress(String adres){
        address.sendKeys(adres);
    }
    public void setAddressLine2(String addr){
        addressLine2.sendKeys(addr);
    }
    public void setCity(String cCity){
        city.sendKeys(cCity);
    }
    public void setState(String cState){
        state.sendKeys(cState);
    }
    public void setZipcode(String czip){
        zipcode.sendKeys(czip);
    }
    public void setAddinfo(String cinfo){
        addinfo.sendKeys(cinfo);
    }
    public void setHomephone(String chome){
        homephone.sendKeys(chome);
    }
    public void setMobilephone(String cmobile){
        mobilephone.sendKeys(cmobile);
    }
    public void setAlias(String calias){
        alias.sendKeys(calias);
    }
    public void setRegister(){
        register.click();
    }
    public boolean accountMsg(){
        info_account.isDisplayed();
        return true;
    }
}
