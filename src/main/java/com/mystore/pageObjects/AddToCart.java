package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends BaseClass {

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//div[@id=\"content\"]/div[1]/text()")
    WebElement addtoCartMsg;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    WebElement viewbasket;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    WebElement proceedtoCheckout;

    public AddToCart(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddToCart(){
        Action.click(driver,addToCartBtn);
    }
    public boolean validateAddToCart(){
       return Action.isDisplayed(driver,addtoCartMsg);
    }
    public void clickonBasket(){
        Action.click(driver,viewbasket);
    }
    public PaymentPage clickonCheckout(){
        Action.click(driver,proceedtoCheckout);
        return new PaymentPage();
    }



}
