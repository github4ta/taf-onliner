package by.itacademy.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL);
    }

    @Test
    public void testOpenOnliner() {

    }
    
    @Test
    public void testCart(){
        driver.findElement(By.xpath(OnlinerPage.BUTTON_CART)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.xpath(OnlinerPage.LABEL_CART));
        Assertions.assertEquals("Корзина", TITLE_CART_Element.getText());
    }
    @Test
    public void openTV(){
        driver.findElement(By.xpath((OnlinerPage.LINK_CATALOG))).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ELECTRONICS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_TV_AND_VIDEO)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_TV)).click();
        Assertions.assertEquals("Телевизоры", driver.findElement(By.xpath(OnlinerPage.LABEL_TV)).getText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
