package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage {
    public void inputEmailorPhone(String EmailOrPhone){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        element.sendKeys(EmailOrPhone);
    }

    public  void inputPassword(String password){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        element.sendKeys(password);
    }

    public void clickSignIn(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        element.click();
    }

    public String failedAuthentication(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("errorSignInTextView"));
        return element.getText();
    }

    public String invalidEmailInput(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("textinput_error"));
        return element.getText();
    }
}
