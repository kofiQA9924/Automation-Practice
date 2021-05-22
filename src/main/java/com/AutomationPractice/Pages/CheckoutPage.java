package com.AutomationPractice.Pages;

import com.AutomationPractice.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RUTHERFORD on 5/19/2021.
 */
public class CheckoutPage extends BaseClass {
    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    @CacheLookup
    WebElement CartCheckout;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    @CacheLookup
    WebElement AddressCheckout;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    @CacheLookup
    WebElement shipTCbox;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    @CacheLookup
    WebElement shippingCheckout;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    @CacheLookup
    WebElement payWire;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    @CacheLookup
    WebElement confirmOrder;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    @CacheLookup
    WebElement signOut;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    @CacheLookup
    WebElement logoDisplayed;

    public void setCartCheckout(){
        CartCheckout.click();
    }
    public void setAddressCheckout(){
        AddressCheckout.click();
    }
    public void setShipTCbox(){
        shipTCbox.click();
    }
    public void setShippingCheckout(){
        shippingCheckout.click();
    }
    public void setPayWire(){
        payWire.click();
    }
    public void setConfirmOrder(){
        confirmOrder.click();
    }
    public void setSignOut(){
        signOut.click();
    }
    public boolean checkLogo(){
        boolean LogoImage=logoDisplayed.isDisplayed();
        if (LogoImage==true){
            System.out.println("Image is perfectly displayed");
        }
        else{
            System.out.println("Image is not displayed");
        }
        return true;
    }
}
