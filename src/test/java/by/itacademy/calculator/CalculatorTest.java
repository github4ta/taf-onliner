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
        WebElement input_name = driver.findElement(By.xpath(CalculatorPage.INPUT_NAME));
        input_name.sendKeys("Иван");
    }
}
