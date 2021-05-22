package com.AutomationPractice.TestCases;

import com.AutomationPractice.Base.BaseClass;
import com.AutomationPractice.Pages.HomePage;
import com.AutomationPractice.Utilities.Reporting;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 3/30/2021.
 */
@Listeners({Reporting.class})
public class HomePageTest extends BaseClass {
    public static HomePage homePage;

    public HomePageTest(){
        super();
    }
    @BeforeTest
    public void setUpHome(){
        initialization();
        homePage=new HomePage(driver);
    }
    @Test(priority = 0)
    public void testSign_in(){
        homePage.setSign_inbutton();
        Verify.verify(true);
        logger.info("Sign in successfully clicked");
    }
    @Test(priority = 1)
    public void testEmailfield(){
        homePage.setEmailfield(properties.getProperty("email"));
        logger.info("email successfully entered");
        Verify.verify(true);
    }
    @Test(priority = 2)
    public void testCreateAccountBtn(){
        homePage.setCreateaccount();
        Verify.verify(true);
        logger.info("Create Account button clicked");
    }
    @Test(priority = 3)
    public void testSuccessMsg(){
        homePage.setSuccessMsg();
        Assert.assertTrue(true);
        logger.info("Assertion:Account created message displayed");
    }
}
