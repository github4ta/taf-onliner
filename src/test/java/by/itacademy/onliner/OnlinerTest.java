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
import java.util.List;

public class OnlinerTest {

    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL);
    }

    @Test
    public void testOnlinerOpen() {
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
    public void testLabelForum() {
        driver.findElement(By.xpath(OnlinerPage.LINK_FORUM)).click();
        WebElement labelForum = driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM));
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM)).getText());
    }

    @Test
    public void testWithEmptyFields() {
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ENTRANCE)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_REGISTRATION_ENTRANCE)).click();
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(OnlinerPage.LABEL_WITHOUT_PASSWORD)));
        Assertions.assertEquals("Укажите пароль", driver.findElement(By.xpath(OnlinerPage.LABEL_WITHOUT_PASSWORD)).getText());
        Assertions.assertEquals("Укажите ник или e-mail", driver.findElement(By.xpath(OnlinerPage.LABEL_WITHOUT_EMAIL)).getText());
    }

    @Test
    public void testAddLaptopInCart() {
        driver.findElement(By.xpath(OnlinerPage.LINK_CATALOG)).click();
        driver.findElement(By.xpath(OnlinerPage.BUTTON_COMPUTERS_AND_NETWORKS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_LAPTOPS_AND_COMPUTERS_AND_MONITOR)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_LAPTOPS)).click();
        List<WebElement> topLaptop = driver.findElements(By.xpath(OnlinerPage.LABEL_ALL_LIST_LAPTOP_ON_PAGE));
        String laptopNumberOne = topLaptop.get(0).getText();
        driver.findElement(By.xpath(OnlinerPage.LABEL_NUMBERS_OF_OFFERS_LAPTOPS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_ADD_LAPTOPS_TO_CART)).click();
        Util.waitFor(2);
        String actual = driver.findElement(By.xpath("//div[@class='product-recommended__title']/div")).getText();
        Assertions.assertEquals(laptopNumberOne, actual);
    }

    @Test
    public void testFooterElements() {
        int count = driver.findElements(By.className(OnlinerPage.FOOTER_ELEMENTS_CLASS)).size();
        System.out.println(count);
        WebElement footerOKompaniiElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_O_KOMPANII));
        Assertions.assertEquals("О компании", footerOKompaniiElement.getText());
        WebElement footerKontaktyRedElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_KONTAKTY_RED));
        Assertions.assertEquals("Контакты редакции", footerKontaktyRedElement.getText());
        WebElement footerReklamaElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_REKLAMA));
        Assertions.assertEquals("Реклама", footerReklamaElement.getText());
        WebElement footerTarifyElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_TARIFY));
        Assertions.assertEquals("Тарифы", footerTarifyElement.getText());
        WebElement footerVakansiiElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_VAKANSII));
        Assertions.assertEquals("Вакансии", footerVakansiiElement.getText());
        WebElement footerManifestElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_MANIFEST));
        Assertions.assertEquals("Манифест", footerManifestElement.getText());
        WebElement footerPolsovatSoglashenieElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_POLSOVAT_SOGLASHENIE));
        Assertions.assertEquals("Пользовательское соглашение", footerPolsovatSoglashenieElement.getText());
        WebElement footerPublDogovoriElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_PUBL_DOGOVORI));
        Assertions.assertEquals("Публичные договоры", footerPublDogovoriElement.getText());
        WebElement footerPolitikaKonfElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_POLITIKA_KONF));
        Assertions.assertEquals("Политика конфиденциальности", footerPolitikaKonfElement.getText());
        WebElement footerPodderzkaPolsovateleiElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_PODDERZKA_POLSOVATELEI));
        Assertions.assertEquals("Поддержка пользователей", footerPodderzkaPolsovateleiElement.getText());
        WebElement footerPravilaVozvrataElement = driver.findElement(By.xpath(OnlinerPage.FOOTER_PRAVILA_VOZVRATA));
        Assertions.assertEquals("Правила возврата", footerPravilaVozvrataElement.getText());
    }

    @Test
    public void testSelectNews() {
        driver.findElement(By.xpath(OnlinerPage.LINK_NEWS)).click();
        driver.findElement(By.xpath(OnlinerPage.NEWS_MONEY_LINK)).click();
        WebElement blockOfNews = driver.findElement(By.xpath(OnlinerPage.FIRST_TITLE));
        String firstNews = blockOfNews.getText();
        driver.findElement(By.xpath(OnlinerPage.FIRST_BLOCK_OF_NEWS)).click();
        WebElement title = driver.findElement(By.xpath(OnlinerPage.ARTICLE_TITLE));
        Assertions.assertEquals(firstNews, driver.findElement(By.xpath(OnlinerPage.ARTICLE_TITLE)).getText());
    }

    @Test
    public void testAbilitySelectAdvertInHouses() {
        driver.findElement(By.xpath(OnlinerPage.LINK_HOUSES_AND_APARTMENTS)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_RENT)).click();
        Util.waitForPresenceElementByXPath(driver, OnlinerPage.RENT_APPART_PRICE_FIRST_ITEM, 10000);
        String priceOnGeneralPage = String.format("%s р.", driver.findElement(By
                .xpath(OnlinerPage.RENT_APPART_PRICE_FIRST_ITEM)).getText());
        driver.findElement(By.xpath(OnlinerPage.RENT_APPART_PRICE_FIRST_ITEM)).click();
        Util.waitForPresenceElementByXPath(driver, OnlinerPage.RENT_APPART_PRICE_EXACT, 10000);
        String priceOnPrivatePage = driver.findElement(By.xpath(OnlinerPage.RENT_APPART_PRICE_EXACT)).getText();
        Assertions.assertEquals(priceOnGeneralPage, priceOnPrivatePage);
    }
    @Test
    public void testSearchMobilePhone(){
        WebElement linkTextFleaMarket = driver.findElement(By.xpath(OnlinerPage.LINK_FLEA_MARKET));
        linkTextFleaMarket.click();
        WebElement linkTextMobilePhone  = driver.findElement(By.xpath(OnlinerPage.LINK_MOBILE_PHONE));
        linkTextMobilePhone.click();
        Util.waitFor(3);
        List<WebElement> linkOfFirstAd = driver.findElements(By.xpath(OnlinerPage.LINK_FIRST_MOBILE_PHONE));
        String firstAdPhone = linkOfFirstAd.get(0).getText();
        driver.findElements(By.xpath(OnlinerPage.LINK_FIRST_MOBILE_PHONE)).get(0).click();
        Util.waitFor(5);
        String nameFirst = driver.findElement(By.xpath(OnlinerPage.NAME_FIRST_MOBILE_PHONE)).getText();
        Assertions.assertEquals(firstAdPhone,nameFirst);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}