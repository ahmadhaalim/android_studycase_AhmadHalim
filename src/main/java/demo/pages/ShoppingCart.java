package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingCart {
    public boolean itemOnShoppingCart(String itemName, int quantity){
        List<AndroidElement> items = AndroidDriverInstance.androidDriver
                .findElements(By.id("name_text_view"));
        for (int i = 0; i < items.size(); i++) {
            if (itemName.equalsIgnoreCase(items.get(i).getText())) {
                if(quantity ==1){
                    return true;
                }
                else{
                    List<AndroidElement> quantities = AndroidDriverInstance.androidDriver
                            .findElements(By.id("quantity_text_view"));
                    System.out.println(quantity);
                    System.out.println(quantities.get(i).getText());
                    if(quantities.get(i).getText().equals("x"+quantity)){
                        System.out.println("helo");
                        return true;
                    }
                }
            }
        }
        return false;
    }



    public void clickCheckOutButton(){
        AndroidElement element = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        element.click();
    }
}


