package com.AutomationPractice.Pages;

import com.AutomationPractice.Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by RUTHERFORD on 5/18/2021.
 */
public class ShoppingPage extends BaseClass {
    public ShoppingPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    //*[@id="header_logo"]/a/img
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    @CacheLookup
    WebElement shopCenterButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")
    @CacheLookup
    WebElement blouseMoreButton;

    @FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
    @CacheLookup
    WebElement BlouseQuantity;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    @CacheLookup
    WebElement BlouseSize;

    @FindBy(xpath = "//*[@id=\"color_8\"]")
    @CacheLookup
    WebElement blouseColourWhite;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    @CacheLookup
    WebElement addBlouseCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    @CacheLookup
    WebElement ContinueShopping;

    // Apply Shopping center element.
    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a[2]")
    @CacheLookup
    WebElement womenList;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")
    @CacheLookup
    WebElement PrintedDress;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    @CacheLookup
    WebElement ProCheckout;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    @CacheLookup
    WebElement ShoppingCart;

    public void setShopCenterButton(){
        shopCenterButton.click();
    }
    public boolean setcheck() {
        boolean productDisplayed=ShoppingCart.isDisplayed();
        if (productDisplayed = true) {
            System.out.println("Your shopping cart");
        } else {
            System.out.println("Verification not available");
        }
        return true;
    }
    public void setblouseMoreButton(){
            blouseMoreButton.click();
    }
    public void setBlouseQuantity(){
        BlouseQuantity.click();
    }
    public void setBlouseSize(){
        Select Medium=new Select(BlouseSize);
        Medium.selectByIndex(1);
    }
    public void setBlouseColourWhite(){
        blouseColourWhite.click();
    }
    public void setAddBlouseCart(){
        addBlouseCart.click();
    }
    public void setContinueShopping(){
        ContinueShopping.click();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("scrollBy(0,-250)");
    }
    public void setShopCenter(){
        womenList.click();
    }
    public void setPrintedDress(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,1500)");
        PrintedDress.click();
    }
    public void setProCheckout(){
        ProCheckout.click();
    }
}
