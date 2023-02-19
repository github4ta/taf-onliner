package by.itacademy.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(By.xpath(OnlinerPage.BTN_CART)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.xpath(OnlinerPage.TITLE_CART));
        Assert.assertEquals("Корзина", TITLE_CART_Element.getText());
        driver.quit();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
