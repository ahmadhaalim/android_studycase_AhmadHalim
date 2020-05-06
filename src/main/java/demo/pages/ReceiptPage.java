package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ReceiptPage {
    public String seeChange(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("change_text_view"));
        return element.getText();
    }
}
