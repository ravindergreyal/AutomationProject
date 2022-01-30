package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageObjects.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexPageTestCase extends BaseClass {

    IndexPage indexPage;

    @BeforeMethod
    public void setUp(){
        launchApp();
    }


    @Test
    public void verifyLogo(){
         indexPage=new IndexPage();
        boolean result=indexPage.validateLogo();
        Assert.assertTrue(result);
    }
    @Test
    public void verifyTitle(){
        String title1=indexPage.getTitle();
        Assert.assertEquals(title1,"Automation Practice Site");
        if(title1.equals("Automation Practice Site")){
            System.out.println("same itle");
        }
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
