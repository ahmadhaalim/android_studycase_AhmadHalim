package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CheckOutPopUp {
    public void clickCashManual(String amount){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("cash_edit_text"));
        element.sendKeys(amount);
    }

    public void clickCheckOutPopUp(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        element.click();
    }

}
