package by.itacademy.onliner;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest1 {
    WebDriver driver;
    @Test
    public void testOpenOnliner() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage1.URL);
        driver.quit();
    }


    @After
    public void endTest() {

        driver.quit();
    }
}
