package by.itacademy.onliner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OnlinerTest {
    @Test
    public void testOboutOnliner() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL);
        WebElement OBOUT_BTN_ELEMENT = driver.findElement(By.xpath(OnlinerPage.LABEL_ABOUT_THE_COMPANY));
        OBOUT_BTN_ELEMENT.click();
        WebElement LABEL_OBOUT_TXT = driver.findElement(By.xpath(OnlinerPage.LABEL_OBOUT_TXT));
        Assert.assertEquals(LABEL_OBOUT_TXT.getText(), OnlinerPage.LABEL_OBOUT_TXT_HEADER);
        driver.quit();
    }
}
