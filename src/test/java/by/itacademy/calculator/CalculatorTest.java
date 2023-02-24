package by.itacademy.calculator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://svyatoslav.biz/testlab/wt/index.php";
        driver.navigate().to(url);
        WebElement inputName = driver.findElement(By.xpath(CalculatorPage.INPUT_NAME));
        inputName.sendKeys("Иван");
        WebElement inputHeight = driver.findElement(By.xpath(CalculatorPage.INPUT_HEIGHT));
        inputHeight.sendKeys("180");
        WebElement inputWeight = driver.findElement(By.xpath(CalculatorPage.INPUT_WEIGHT));
        inputWeight.sendKeys("78");
    }
}
