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
        driver.findElement(By.className(OnlinerPage.BUTTON_CART_CLASS_NAME)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.className(OnlinerPage.LABEL_CART_TITLE_CLASS_NAME));
        return TITLE_CART_Element.getText();
    }

    public String openFleaMarketSection(){
        driver.findElement(By.xpath(OnlinerPage.LINK_FLEA_MARKET)).click();
        WebElement titleFleaMarket = driver.findElement(By.className(OnlinerPage.LABEL_FLEA_MARKET_TITLE_CLASS_NAME));
        return titleFleaMarket.getText();
        }

    public String openForumSection() {
        driver.findElement(By.xpath(OnlinerPage.LINK_FORUM)).click();
        WebElement labelForum = driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM_TITLE));
        return labelForum.getText();
    }
}
