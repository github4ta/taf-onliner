package by.itacademy.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerStep {

    WebDriver driver;

    OnlinerStep(WebDriver driver) {
        this.driver = driver;
    }

    public String openCart(){
        driver.findElement(By.xpath(OnlinerPage.BUTTON_CART)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.xpath(OnlinerPage.LABEL_CART_TITLE));
        return TITLE_CART_Element.getText();
    }
}
