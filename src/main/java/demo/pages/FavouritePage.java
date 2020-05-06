package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class FavouritePage {
    public boolean isOnFavourite() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement element = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar_bar_favourite")));
        String bool = element.getAttribute("selected");
        if (bool.equals("true")) {
            return true;
        } else return false;
    }

    public void selectItem(String itemName, int quantity) {
        List<AndroidElement> items = AndroidDriverInstance.androidDriver
                .findElements(By.id("grid_favourite_name"));
        for (int i = 0; i < items.size(); i++) {
            if (itemName.equalsIgnoreCase(items.get(i).getText())) {
                for (int j = 0; j < quantity; j++) {
                    System.out.println("halo");
                    items.get(i).click();
                }
            }
        }
    }
}
