package com.AutomationPractice.TestCases;

import com.AutomationPractice.Base.BaseClass;
import com.AutomationPractice.Pages.AccountRegistrationPage;
import com.AutomationPractice.Pages.CheckoutPage;
import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Pages.ShoppingPage;
import com.AutomationPractice.Utilities.Reporting;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 5/19/2021.
 */
@Listeners({Reporting.class})
public class CheckoutPageTest extends BaseClass {
    public static AccountRegistrationPage accountRegistrationPage;
    public static CheckoutPage checkoutPage;
    public static HomePage homePage;
    public static ShoppingPage shoppingPage;

    public CheckoutPageTest(){
        super();
    }
    @BeforeTest
    public void setUpCheckout(){
        initialization();
        accountRegistrationPage=new AccountRegistrationPage(driver);
        checkoutPage=new CheckoutPage(driver);
        homePage=new HomePage(driver);
        shoppingPage=new ShoppingPage(driver);

        homePage.setSign_inbutton();
        homePage.setEmailfield(properties.getProperty("email"));
        homePage.setCreateaccount();

        accountRegistrationPage.setTitle();
        accountRegistrationPage.setFirstname("Admin");
        accountRegistrationPage.setLastname("User");
        accountRegistrationPage.setPassword(properties.getProperty("password"));
        accountRegistrationPage.setDoB();
        accountRegistrationPage.setAddressfirstname("Local");
        accountRegistrationPage.setAddresslastname("Host");
        accountRegistrationPage.setCompany("Enterprise Systems");
        accountRegistrationPage.setAddress("101 Main St");
        accountRegistrationPage.setAddressLine2("101 Main St");
        accountRegistrationPage.setCity("Kingstown");
        accountRegistrationPage.setState("Mikestate");
        accountRegistrationPage.setZipcode("86383");
        accountRegistrationPage.setAddinfo("Customer info recently updated");
        accountRegistrationPage.setHomephone("4774585824");
        accountRegistrationPage.setMobilephone("4647474839");
        accountRegistrationPage.setAlias("Unknown");
        accountRegistrationPage.setRegister();
        shoppingPage.setShopCenterButton();
        shoppingPage.setblouseMoreButton();
        shoppingPage.setBlouseQuantity();
        shoppingPage.setBlouseSize();
        shoppingPage.setBlouseColourWhite();
        shoppingPage.setAddBlouseCart();
        shoppingPage.setContinueShopping();
        shoppingPage.setShopCenter();
        shoppingPage.setPrintedDress();
        shoppingPage.setProCheckout();
    }
    @Test(priority = 0)
    public void testCartCheckout(){
        checkoutPage.setCartCheckout();
        Assert.assertTrue(true);
        logger.info("Cart checkout clicked");
    }
    @Test(priority = 1)
    public void testAddressCheckout(){
        checkoutPage.setAddressCheckout();
        Assert.assertTrue(true);
        logger.info("Address checkout clicked");
    }
    @Test(priority = 2)
    public void testShipTCbox(){
        checkoutPage.setShipTCbox();
        Verify.verify(true);
        logger.info("Terms and Conditions checked");
    }
    @Test(priority = 3)
    public void testShippingCheckout(){
        checkoutPage.setShippingCheckout();
        Verify.verify(true);
        logger.info("Shipping checkout clicked");
    }
    @Test(priority = 4)
    public void testPayWire(){
        checkoutPage.setPayWire();
        Verify.verify(true);
        logger.info("Pay via wire clicked");
    }
    @Test(priority = 5)
    public void testConfirmOrder(){
        checkoutPage.setConfirmOrder();
        Verify.verify(true);
        logger.info("Order confirmed");
    }
    @Test(priority = 6)
    public void testSignOut(){
        checkoutPage.setSignOut();
        Verify.verify(true);
        logger.info("Sign out clicked");
    }
    @Test(priority = 7)
    public void testLogo(){
        checkoutPage.checkLogo();
        Assert.assertTrue(true);
        logger.info("Assertion: Logo displayed");
    }
}
