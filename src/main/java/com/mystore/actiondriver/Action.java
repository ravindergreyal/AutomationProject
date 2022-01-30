package com.mystore.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action {

    public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",ele);
    }
    public static void click(WebDriver ldriver,WebElement locatorname){
        Actions act =new Actions(ldriver);
        act.moveToElement(locatorname).click().build().perform();
    }
    public static boolean findElement(WebDriver ldriver, WebElement ele){
        boolean flag=false;
        try {
            ele.isDisplayed();
            flag=true;
        }
        catch (Exception e){
            flag=false;
        }
        finally {
            if (flag){
                System.out.println("Sucessfully find element at");
            }
            else {
                System.out.println("unable to locate element at ");
            }
        }
        return flag;
    }
    public static boolean isDisplayed(WebDriver ldriver, WebElement ele){
        boolean flag=false;
        flag=findElement(ldriver,ele);
        if (flag) {
            flag = ele.isDisplayed();
            if (flag) {
                System.out.println("The element is displayed");
            } else {
                System.out.println("The element is not displayed");
            }
        }
        else {
            System.out.println("Not displayed");
        }
        return flag;


    }
    public static boolean isSelected(WebDriver ldriver, WebElement ele){
        boolean flag=false;
        flag=findElement(ldriver,ele);
        if (flag) {
            flag = ele.isSelected();
            if (flag) {
                System.out.println("The element is selected");
            } else {
                System.out.println("The element is not selected");
            }
        }
        else {
            System.out.println("Not selected");
        }
        return flag;
    }
    public static boolean isEnabled(WebDriver ldriver, WebElement ele){
        boolean flag=false;
        flag=findElement(ldriver,ele);
        if (flag) {
            flag = ele.isEnabled();
            if (flag) {
                System.out.println("The element is enabled");
            } else {
                System.out.println("The element is not enabled");
            }
        }
        else {
            System.out.println("Not enabled");
        }
        return flag;
    }
    public static boolean type(WebElement ele, String text){
        boolean flag=false;
        try {
            flag=ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
            //logger info("enter text = text")
            flag=true;
        }
        catch (Exception e){
            System.out.println("location not found");
        }
        finally {
            if (flag){
                System.out.println("Successfully entered the value");
            }
            else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }
    public static boolean selectBySendKeys(WebElement ele,String value){
        boolean flag=false;
        try {
            ele.sendKeys(value);
            flag=true;
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
            if (flag){
                System.out.println("Select value form dropdown");
            }
            else {
                System.out.println("Not selected the value from dropdown");
            }
        }
    }
    public static boolean selectByIndex(WebElement element,int index){
        boolean flag=false;
        try {
            Select s=new Select(element);
            s.selectByIndex(index);
            flag=true;
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
            if (flag) {
                System.out.println("option selected by index");
            } else {
                System.out.println("Not option selected by index");
            }
        }


    }
    public static boolean selectByValue(WebElement element,String value){
        boolean flag=false;
        try {
            Select s=new Select(element);
            s.selectByValue(value);
            flag=true;
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
            if (flag) {
                System.out.println("option selected by value");
            } else {
                System.out.println("Not option selected by value");
            }
        }

    }
    public static boolean mouseHoverByJavaScript(WebElement locator){
        boolean flag=false;
        try {
            WebElement mo=locator;
//            String javaScript="var evObj=document.createEvent('MouseEvent+"
//                  +  "evObj.initMouseEvent(\"mouseover\",true,false,window
//                    +"arguments[0].dispatchEvent(evObj);";
//            JavascriptExecutor js=(JavascriptExecutor)driver;
//            js.executeScript(javaScript,mo);
            flag=true;
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
            if (flag) {
                System.out.println("Mouseover action is performed");
            } else {
                System.out.println("Mouseover action is not performed");
            }
        }

    }
    public static boolean JSClick(WebDriver driver,WebElement ele){
        boolean flag=false;
        try {
           JavascriptExecutor executor=(JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click();",ele);
            flag=true;

        }
        catch (Exception e){
           throw e;
        }
        finally {
            if (flag) {
                System.out.println("click action is performed");
            } else {
                System.out.println("click action is not  performed");
            }
        }
        return flag;

    }





}
