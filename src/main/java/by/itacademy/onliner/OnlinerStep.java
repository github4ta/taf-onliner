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

    public String openFleaMarketSection(){
        driver.findElement(By.xpath(OnlinerPage.LINK_FLEA_MARKET)).click();
        WebElement titleFleaMarket = driver.findElement(By.xpath(OnlinerPage.LABEL_FLEA_MARKET_TITLE));
        return titleFleaMarket.getText();
        }

    public String openForumSection() {
        driver.findElement(By.xpath(OnlinerPage.LINK_FORUM)).click();
        WebElement labelForum = driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM_TITLE));
        return labelForum.getText();
    }
    public String openTVSection() {
        driver.findElement(By.xpath((OnlinerPage.LINK_CATALOG))).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_CATALOG_ELECTRONICS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_TV_AND_VIDEO)).click();
        driver.findElement(By.xpath(OnlinerPage.CATALOG_NAVIGATION_LIST_ITEM_TV)).click();
        WebElement labelTV = driver.findElement(By.xpath(OnlinerPage.LABEL_TV_TITLE));
        return labelTV.getText();
    }
}
