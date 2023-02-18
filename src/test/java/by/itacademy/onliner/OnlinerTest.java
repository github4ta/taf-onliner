package by.itacademy.onliner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    WebDriver driver;
    @Test
    public void testOpenOnliner() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.LOGIN_URL);
        driver.quit();
    }


    @After
    public void endTest() {

        driver.quit();
    }
}
