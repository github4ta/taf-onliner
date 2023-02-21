package by.itacademy.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OnlinerTest {

    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL);
    }

    @Test
    public void testOnlinerOpen(){
        String actualFooterCoopyright = driver.findElement(By.xpath(OnlinerPage.LABEL_COPYRIGHT)).getText();
        Util.waitFor(1);
        Assertions.assertEquals("© 2001—2023 Onlíner", actualFooterCoopyright);

    }

    @Test
    public void testCart() {
        driver.findElement(By.xpath(OnlinerPage.BUTTON_CART)).click();
        WebElement TITLE_CART_Element = driver.findElement(By.xpath(OnlinerPage.LABEL_CART));
        Assertions.assertEquals("Корзина", TITLE_CART_Element.getText());
    }

    @Test
    public void openTV() {
        driver.findElement(By.xpath((OnlinerPage.LINK_CATALOG))).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ELECTRONICS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_TV_AND_VIDEO)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_TV)).click();
        Assertions.assertEquals("Телевизоры", driver.findElement(By.xpath(OnlinerPage.LABEL_TV)).getText());
    }

    @Test
    public void testOpenFleaMarket() {
        driver.findElement(By.xpath(OnlinerPage.LINK_FLEA_MARKET)).click();
        WebElement TitleFleaMarket = driver.findElement(By.xpath(OnlinerPage.LABEL_FLEA_MARKET));
        Assertions.assertEquals("Барахолка", TitleFleaMarket.getText());
    }

    @Test
    public void testHousesAndFlats() {
        driver.findElement(By.xpath(OnlinerPage.LINK_HOUSES_AND_APARTMENTS)).click();
        WebElement textOfBtnSale = driver.findElement(By.xpath(OnlinerPage.LABEL_SALE));
        Assertions.assertEquals("Продажа", textOfBtnSale.getText());
    }

    @Test
    public void testHousesAndFlatsRent() {
        driver.findElement(By.xpath(OnlinerPage.LINK_HOUSES_AND_APARTMENTS)).click();
        WebElement textOfBtnRent = driver.findElement(By.xpath(OnlinerPage.LABEL_RENT));
        Assertions.assertEquals("Аренда", textOfBtnRent.getText());
    }

    @Test
    public void testOboutOnliner() {
        WebElement OBOUT_BTN_ELEMENT = driver.findElement(By.xpath(OnlinerPage.LABEL_ABOUT_THE_COMPANY));
        OBOUT_BTN_ELEMENT.click();
        WebElement LABEL_OBOUT_TXT = driver.findElement(By.xpath(OnlinerPage.LABEL_OBOUT_TXT));
        Assertions.assertEquals(LABEL_OBOUT_TXT.getText(), OnlinerPage.LABEL_OBOUT_TXT_HEADER);
    }

    @Test
    public void testCatalogOnliner() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath(OnlinerPage.LINK_CATALOG)).click();
        WebElement LabelTextCatalog = driver.findElement(By.xpath(OnlinerPage.LABEL_CATALOG));
        Assertions.assertEquals("КаталогВсе суперцены!", LabelTextCatalog.getText());

    }

    @Test
    public void testAbilitySearchByWord() {
        driver.findElement(By.xpath(OnlinerPage.SEARCH_LINE)).sendKeys(OnlinerPage.TEXT_FOR_SEARCH);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(OnlinerPage.SEARCH_FRAME)));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(OnlinerPage.RESULT_SEARCH_FIRST_PRODUCT)));
        String resultSearch = driver.findElement(By.xpath(OnlinerPage.RESULT_SEARCH_FIRST_PRODUCT)).getText();
        Assertions.assertTrue(resultSearch.contains(OnlinerPage.TEXT_FOR_SEARCH), "Error");
    }

    @Test
    public void testOpenOnliner() {
        By btnLoginBy = By.xpath(OnlinerPage.BUTTON_ENTRANCE);
        WebElement btnLoginElement = driver.findElement(btnLoginBy);
        btnLoginElement.click();
        Util.waitFor(2);
        WebElement loginText = driver.findElement(By.xpath(OnlinerPage.LABEL_ENTER));
        Assertions.assertTrue(loginText.isDisplayed());
    }
    @Test
    public void testLabelForum(){
        driver.findElement(By.xpath(OnlinerPage.LINK_FORUM)).click();
        WebElement labelForum = driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM));
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM)).getText());
    }

    @Test
    public void testWithEmptyFields(){
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ENTRANCE)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_REGISTRATION_ENTRANCE)).click();
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(OnlinerPage.LABEL_WITHOUT_PASSWORD)));
        Assertions.assertEquals("Укажите пароль", driver.findElement(By.xpath(OnlinerPage.LABEL_WITHOUT_PASSWORD)).getText());
        Assertions.assertEquals("Укажите ник или e-mail", driver.findElement(By.xpath(OnlinerPage.LABEL_WITHOUT_EMAIL)).getText());
    }
    
    @Test
    public void testLoginFormWithEmptyPassword() {
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ENTRANCE)).click();
        WebElement inputLogin = driver.findElement(By.xpath(OnlinerPage.INPUT_LOGIN));
        inputLogin.sendKeys("Nataliya0405");
        driver.findElement(By.xpath(OnlinerPage.BTN_ENTER)).click();
        Util.waitFor(40);
        Assertions.assertEquals("Укажите пароль", driver.findElement(By.xpath(OnlinerPage.INPUT_PASSWORD)).getText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}