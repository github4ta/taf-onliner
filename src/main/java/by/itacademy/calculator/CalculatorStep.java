package by.itacademy.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorStep {

    CalculatorStep(WebDriver driver) {

    }
    public void doCalculate() {
        WebElement inputName = driver.findElement(By.xpath(CalculatorPage.INPUT_NAME));
        inputName.sendKeys("Иван");
        WebElement inputHeight = driver.findElement(By.xpath(CalculatorPage.INPUT_HEIGHT));
        inputHeight.sendKeys("180");
        WebElement inputWeight = driver.findElement(By.xpath(CalculatorPage.INPUT_WEIGHT));
        inputWeight.sendKeys("78");
        WebElement inputGender = driver.findElement(By.xpath(CalculatorPage.INPUT_GENDER_F));
        inputGender.click();
        WebElement buttonCalculate = driver.findElement(By.xpath(CalculatorPage.BUTTON_CALCULATE));
        buttonCalculate.click();
    }
}
