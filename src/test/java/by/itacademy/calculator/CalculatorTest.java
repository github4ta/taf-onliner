package by.itacademy.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    public void testCalculator() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://svyatoslav.biz/testlab/wt/index.php";
        driver.navigate().to(url);
    }
}
