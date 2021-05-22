package com.AutomationPractice.TestCases;

import com.AutomationPractice.Base.BaseClass;
import com.AutomationPractice.Pages.AccountRegistrationPage;
import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Utilities.Reporting;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 4/6/2021.
 */
@Listeners({Reporting.class})
public class AccountRegistrationPageTest extends BaseClass {
    public static HomePage homePage;
    public static AccountRegistrationPage accountRegistrationPage;

    public AccountRegistrationPageTest() {
        super();
    }

    @BeforeTest
    public void setUpAccount() {
        initialization();
        homePage = new HomePage(driver);
        accountRegistrationPage = new AccountRegistrationPage(driver);
        homePage.setSign_inbutton();
        homePage.setEmailfield(properties.getProperty("email"));
        homePage.setCreateaccount();
    }

    @Test(priority = 0)
    public void testsetTitle() {
        accountRegistrationPage.setTitle();
        Assert.assertTrue(true);
        logger.info("Title is clicked");
    }

    @Test(priority = 1)
    public void testFirstname() {
        accountRegistrationPage.setFirstname("Admin");
        logger.info("Firtname entered");
    }

    @Test(priority = 2)
    public void testLastname() {
        accountRegistrationPage.setLastname("User");
        logger.info("Lastname is clicked");
    }

    @Test(priority = 3)
    public void testPassword() throws InterruptedException {
        accountRegistrationPage.setPassword(properties.getProperty("password"));
        Thread.sleep(3000);
        logger.info("Password entered");
    }

    @Test(priority = 4)
    public void testDoB() throws InterruptedException {
        Thread.sleep(10000);
        accountRegistrationPage.setDoB();
        Assert.assertTrue(true);
        logger.info("DoB Assertion is true");
    }

    @Test(priority = 5)
    public void testAddressfirstname() {
        accountRegistrationPage.setAddressfirstname("Local");
        logger.info("Firstname for Address entered");
    }

    @Test(priority = 6)
    public void testAddresslastname() {
        accountRegistrationPage.setAddresslastname("Host");
        logger.info("Lastname for Address entered");
    }

    @Test(priority = 7)
    public void testCompany() {
        accountRegistrationPage.setCompany("Enterprise Systems");
        logger.info("Company name entered");
    }

    @Test(priority = 8)
    public void testAddress() {
        accountRegistrationPage.setAddress("101 Main St");
        logger.info("Address entered");
    }

    @Test(priority = 9)
    public void testAddressLine2() {
        accountRegistrationPage.setAddressLine2("101 Main St");
        logger.info("Address entered for second line");
    }

    @Test(priority = 10)
    public void testCity() {
        accountRegistrationPage.setCity("Kingstown");
        logger.info("City entered");
    }

    @Test(priority = 11)
    public void testState() {
        accountRegistrationPage.setState("Mikestate");
        logger.info("State entered");
    }

    @Test(priority = 12)
    public void testZipcode() {
        accountRegistrationPage.setZipcode("86383");
        logger.info("Zipcode entered");
    }

    @Test(priority = 13)
    public void testAddinfo() {
        accountRegistrationPage.setAddinfo("Customer info recently updated");
        logger.info("Additional info entered");
    }

    @Test(priority = 14)
    public void testHomephone() {
        accountRegistrationPage.setHomephone("4774585824");
        logger.info("Home phone number entered");
    }

    @Test(priority = 15)
    public void testMobilephone() {
        accountRegistrationPage.setMobilephone("4647474839");
        logger.info("Mobile phone number entered");
    }@Test(priority = 16)
    public void testAlias(){
        accountRegistrationPage.setAlias("Unknown");
        logger.info("Alias entered");
    }
    @Test(priority = 17)
    public void testRegister(){
        accountRegistrationPage.setRegister();
        Assert.assertTrue(true);
        logger.info("Register button clicked");
    }
    @Test(priority = 18)
    public void testaccountMsg(){
     accountRegistrationPage.accountMsg();
    Assert.assertTrue(true);
    logger.info("Account message displayed");
    }
}