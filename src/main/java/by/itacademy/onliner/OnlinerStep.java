package by.itacademy.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlinerStep {
    WebDriver driver;

    OnlinerStep(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> openHousesAndFlatsSection() {
        driver.findElement(By.xpath(OnlinerPage.LINK_HOUSES_AND_APARTMENTS)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_HOUSES_AND_APARTMENTS_SALE)).click();
        List<WebElement> property = driver.findElements(By.xpath(OnlinerPage.LABEL_TITLE_SALE_AND_RENT));
        System.out.println(property.get(0).getText());
        System.out.println(property.get(1).getText());
        return property;
    }
}
