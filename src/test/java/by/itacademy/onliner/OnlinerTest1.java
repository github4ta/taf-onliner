package by.itacademy.onliner;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest1 {
    ChromeDriver driver = new ChromeDriver();
    @Test
    public void testOpenOnliner() {
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_ONLINER);
    }

    @After
    public void endTest() {
        driver.quit();
    }
}
