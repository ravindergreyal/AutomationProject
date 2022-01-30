package com.mystore.pageObjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary extends BaseClass {

@FindBy(xpath = "//*[@id=\"page-35\"]/div/div[1]/p[1]")
    WebElement confirmmsg;

    public OrderSummary(){
        PageFactory.initElements(driver,this);
    }

    public String validateConfirm(){
        String mmsg=confirmmsg.getText();
        return mmsg;
    }



}
