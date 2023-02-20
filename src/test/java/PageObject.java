import by.itacademy.onliner.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


import java.util.concurrent.TimeUnit;

public class PageObject {

    WebDriver driver;

    @BeforeEach
    public void warmUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TestClass.URL);
    }

    @Test
    public void testOpenOnliner() {

        By btnLoginBy = By.xpath(TestClass.LOG);
        WebElement btnLoginElement = driver.findElement(btnLoginBy);

        Util.waitFor(2);

        btnLoginElement.click();


        WebElement loginText = driver.findElement(By.xpath(TestClass.LABEL_ENTER));

        Util.waitFor(3);

        Assert.assertTrue(loginText.isDisplayed());


    }


    @AfterEach
    public void TurnOff() {
        driver.quit();
    }

}
