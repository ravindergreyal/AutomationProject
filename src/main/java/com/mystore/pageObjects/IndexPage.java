package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccounBbn;

    @FindBy(xpath = "//img[@title='Automation Practice Site']")
    WebElement logoElement;

    public IndexPage(){
        PageFactory.initElements(driver,this);
    }

    public LoginPage clickOnMyAccount(){
        Action.click(driver,myAccounBbn);
        return new  LoginPage();
    }
    public boolean validateLogo(){
        return Action.isDisplayed(driver,logoElement);
    }
    public String getTitle(){
       String title= driver.getTitle();
       return title;
    }
}
