package com.mystore.pageObjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends BaseClass {


    @FindBy(xpath = "//img[@title='Android Quick Start Guide']")
    WebElement product;

    public ShopPage(){
        PageFactory.initElements(driver,this);
    }
    public boolean  isProductAvailiable(){
       return Action.isDisplayed(driver,product);
    }
    public AddToCart clickOnproduct(){
        Action.click(driver,product);
        return new AddToCart();
    }

}
