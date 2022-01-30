package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageObjects.HomePage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod
    public void setup(){
        launchApp();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginTest(){
        indexPage=new IndexPage();
        loginPage= indexPage.clickOnMyAccount();
        homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        String actualURL= homePage.getCurrentURL();
        String expectedURL="http://practice.automationtesting.in/my-account/";
        Assert.assertEquals(actualURL,expectedURL);


    }
}
