package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy (linkText ="Orders")
    WebElement orderHistory;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void validateOrderHistory(){
        Action.isDisplayed(driver,orderHistory);
    }
    public String getCurrentURL(){
        String homePageUrl=driver.getCurrentUrl();
        return homePageUrl;
    }

}
