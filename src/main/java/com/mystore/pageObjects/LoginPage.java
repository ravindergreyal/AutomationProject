package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage login(String uname,String pswd){
        Action.type(username,uname);
        Action.type(password,pswd);
        Action.click(driver,loginBtn);
        return new HomePage();
    }
}
