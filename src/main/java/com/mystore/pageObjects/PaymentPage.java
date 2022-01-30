package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {

    @FindBy(xpath = "//input[@id='place_order']")
    WebElement placeOrderbtn;

    public PaymentPage(){
        PageFactory.initElements(driver,this);
    }
    public OrderSummary clickOnPlaceOrder(){
        Action.click(driver,placeOrderbtn);
        return new OrderSummary();
    }

}
