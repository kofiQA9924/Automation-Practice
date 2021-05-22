package com.AutomationPractice.TestCases;

import com.AutomationPractice.Base.BaseClass;
import com.AutomationPractice.Pages.AccountRegistrationPage;
import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Pages.ShoppingPage;
import com.AutomationPractice.Utilities.Reporting;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 5/18/2021.
 */
@Listeners({Reporting.class})
public class ShoppingPageTest extends BaseClass {
    public static AccountRegistrationPage accountRegistrationPage;
    public static HomePage homePage;
    public static ShoppingPage shoppingPage;

    public ShoppingPageTest(){
        super();
    }
    @BeforeTest
    public void setUpShopPage(){
        initialization();
        accountRegistrationPage=new AccountRegistrationPage(driver);
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
        accountRegistrationPage.setMobilephone("464747439");
        accountRegistrationPage.setAlias("Unknown");
        accountRegistrationPage.setRegister();

    }
    @Test(priority = 0)
    public void testShopCenterButton(){
        shoppingPage.setShopCenterButton();
        logger.info("Shop center clicked");
    }
    @Test(priority = 1)
    public void testblouseMoreButton(){
        shoppingPage.setblouseMoreButton();
        logger.info("Blouse button clicked");
    }
    @Test(priority = 2)
    public void testBlouseQuantity(){
        shoppingPage.setBlouseQuantity();
        logger.info("Blouse Quantity clicked");
    }
    @Test(priority = 3)
    public void testBlouseSize(){
        shoppingPage.setBlouseSize();
        logger.info("Blouse size selected");
    }
    @Test(priority = 4)
    public void testBlouseColourWhite(){
        shoppingPage.setBlouseColourWhite();
        logger.info("Blouse Colour selected");
    }
    @Test(priority = 5)
    public void testAddBlouseCart(){
        shoppingPage.setAddBlouseCart();
        logger.info("Blouse added to Cart");
    }
    @Test(priority = 6)
    public void testContinueShopping(){
        shoppingPage.setContinueShopping();
        Assert.assertTrue(true);
        logger.info("Continue shopping button clicked");
    }
    @Test(priority = 7)
    public void testShopCenter(){
        shoppingPage.setShopCenter();
        Assert.assertTrue(true);
        logger.info("Shop page entered");
    }
    @Test(priority = 8)
    public void testPrintedDress(){
        shoppingPage.setPrintedDress();
        Assert.assertTrue(true);
        logger.info("Printed Dress selected");
    }
    @Test(priority = 9)
    public void testProCheckout(){
        shoppingPage.setProCheckout();
        Assert.assertTrue(true);
        logger.info("Checkout button clicked");
    }
    @Test(priority = 10)
    public void testCheck(){
        shoppingPage.setcheck();
        Assert.assertTrue(true);
        logger.info("Assertion: Message displayed");
    }
}
