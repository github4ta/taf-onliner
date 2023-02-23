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
        WebElement OBOUT_BTN_ELEMENT = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_ABOUT_COMPANY));
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
    public void testLoginFormWithEmptyPassword() {
        driver.findElement(By.xpath(OnlinerPage.BUTTON_ENTRANCE)).click();
        WebElement inputLogin = driver.findElement(By.xpath(OnlinerPage.INPUT_LOGIN));
        inputLogin.sendKeys("Nataliya0405");
        driver.findElement(By.xpath(OnlinerPage.BTN_ENTER)).click();
        Util.waitFor(40);
        Assertions.assertEquals("Укажите пароль", driver.findElement(By.xpath(OnlinerPage.INPUT_PASSWORD)).getText());
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
        WebElement footerOKompaniiElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_ABOUT_COMPANY));
        Assertions.assertEquals("О компании", footerOKompaniiElement.getText());
        WebElement footerKontaktyRedElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_KONTAKTS_EDITORIAL));
        Assertions.assertEquals("Контакты редакции", footerKontaktyRedElement.getText());
        WebElement footerReklamaElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_ADVERTISING));
        Assertions.assertEquals("Реклама", footerReklamaElement.getText());
        WebElement footerTarifyElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_RATES));
        Assertions.assertEquals("Тарифы", footerTarifyElement.getText());
        WebElement footerVakansiiElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_VACANCY));
        Assertions.assertEquals("Вакансии", footerVakansiiElement.getText());
        WebElement footerManifestElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_MANIFESTO));
        Assertions.assertEquals("Манифест", footerManifestElement.getText());
        WebElement footerPolsovatSoglashenieElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_USER_AGREEMENT));
        Assertions.assertEquals("Пользовательское соглашение", footerPolsovatSoglashenieElement.getText());
        WebElement footerPublDogovoriElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_PUBLIC_CONTRACTS));
        Assertions.assertEquals("Публичные договоры", footerPublDogovoriElement.getText());
        WebElement footerPolitikaKonfElement = driver.findElement(By.xpath(OnlinerPage.LINK_FOOTER_PRIVACY_POLICY));
        Assertions.assertEquals("Политика конфиденциальности", footerPolitikaKonfElement.getText());
        WebElement footerPodderzkaPolsovateleiElement = driver.findElement(By.xpath(OnlinerPage.LABEL_FOOTER_SUPPORT));
        Assertions.assertEquals("Поддержка пользователей", footerPodderzkaPolsovateleiElement.getText());
        WebElement footerPravilaVozvrataElement = driver.findElement(By.xpath(OnlinerPage.LABEL_FOOTER_REFUND_POLICY));
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
    public void testOpportunitySelectAdsAutobaraholka() {
        driver.findElement(By.xpath(OnlinerPage.LABEL_AUTO_FLEA_MARKET)).click();
        String firstTxtAutoFleaMarketElement = driver.findElement(By.xpath(OnlinerPage.TXT_AUTO_FLEA_MARKET)).getText();
        driver.findElement(By.xpath(OnlinerPage.FIRST_AUTO_FLEA_MARKET)).click();
        Util.waitForPresenceElementByXPath(driver, OnlinerPage.VEHICLE, 10000);
        String txtAutoFleaMarketElement = driver.findElement(By.xpath(OnlinerPage.VEHICLE)).getText();

        Assertions.assertEquals(firstTxtAutoFleaMarketElement, txtAutoFleaMarketElement);
    }

    @Test
    public void testAbilitySelectForumTheme(){
        driver.findElement(By.xpath(OnlinerPage.LINK_FORUM)).click();
        driver.findElement(By.xpath(OnlinerPage.LABEL_FORUM)).click();
        Util.waitFor(2);
        List<WebElement> forumThemes = driver.findElements(By.xpath(OnlinerPage.LIST_OF_FORUM_THEMES));
        String firstForumTheme = forumThemes.get(0).getText();
        Util.waitFor(2);
        driver.findElements(By.xpath(OnlinerPage.LIST_OF_FORUM_THEMES)).get(0).click();
        Assertions.assertEquals(firstForumTheme, driver.findElement(By.xpath(OnlinerPage.TITLE_FIRST_FORUM_THEME)).getText());
    }

    @Test
    public void testChoosingInServices() {
        driver.findElement(By.xpath(OnlinerPage.LINK_SERVICES)).click();
        WebElement servicesFirstItem = driver.findElement(By.xpath(OnlinerPage.SERVICES_PRICE_FIRST_ITEM));
        String firstServicesItem = servicesFirstItem.getText();
        servicesFirstItem.click();
        WebElement servicesFirstItemExact = driver.findElement(By.xpath(OnlinerPage.SERVICES_PRICE_EXACT));
        String firstServicesItemExact = servicesFirstItemExact.getText();
        Assertions.assertEquals(firstServicesItem,firstServicesItemExact);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}