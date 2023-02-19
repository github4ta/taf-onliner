package by.itacademy.onliner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    WebDriver driver;
    @Test
    public void testCart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.LOGIN_URL);
        driver.findElement(By.xpath(OnlinerPage.BTN_CART)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.xpath(OnlinerPage.TITLE_CART));
        Assert.assertEquals("Корзина", TITLE_CART_Element.getText());
        driver.quit();
    }
}
