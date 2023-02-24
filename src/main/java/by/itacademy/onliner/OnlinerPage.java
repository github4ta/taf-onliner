package by.itacademy.onliner;

public class OnlinerPage {

    public static final String URL = "https://www.onliner.by";

    public static final String LINK_CATALOG = "//span[@class='b-main-navigation__text'][contains(text(),'Каталог')]";
    public static final String LINK_NEWS = "//span[@class='b-main-navigation__text'][contains(text(),'Новости')]";
    public static final String LINK_CAR_MARKET = "//span[@class='b-main-navigation__text'][contains(text(),'Автобарахолка')]";
    public static final String LINK_HOUSES_AND_APARTMENTS = "//span[@class='b-main-navigation__text'][contains(text(),'Дома и квартиры')]";
    public static final String LINK_SERVICES = "//span[@class='b-main-navigation__text'][contains(text(),'Услуги')]";
    public static final String LINK_FLEA_MARKET = "//span[@class='b-main-navigation__text'][contains(text(),'Барахолка')]";
    public static final String LINK_FORUM = "//span[@class='b-main-navigation__text'][contains(text(),'Форум')]";

    public static final String BUTTON_LOGIN = "//div[@class='auth-bar__item auth-bar__item--text']";
    public static final String BUTTON_CART = "//a[@class='auth-bar__item auth-bar__item--cart']";
    public static final String BUTTON_CATALOG_ELECTRONICS = "//span[@class='catalog-navigation-classifier__item-title-wrapper'][text()='Электроника']";
    public static final String BUTTON_CATALOG_COMPUTERS_AND_NETWORKS = "//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(),'Компьютеры')]";
    public static final String BUTTON_CATALOG_APPLIANCES = "//span[@class='catalog-navigation-classifier__item-title-wrapper'][text()='Бытовая техника']";

    public static final String BUTTON_SUBMIT_AUTHORIZATION_FORM = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";

    public static final String LABEL_COPYRIGHT = "//div[@class='footer-style__copy']";
    public static final String LINK_ABOUT_THE_COMPANY = "//a[@href='https://blog.onliner.by/about']";
    public static final String LABEL_CATALOG = "//div[@class='catalog-navigation__title']";
    public static final String LABEL_TV_AND_VIDEO = "//div[@class='catalog-navigation-list__aside-title'][contains(text(), 'Телевидение')]";

    public static final String CATALOG_NAVIGATION_LIST_ITEM_TV = "//a[@href='https://catalog.onliner.by/tv']";
   
    public static final String LABEL_LAPTOPS_COMPUTERS_AND_MONITOR = "//div[@class='catalog-navigation-list__aside-title'][text()=' Ноутбуки, компьютеры, мониторы ']";
    public static final String LINK_LAPTOPS = "//a[@href='https://catalog.onliner.by/notebook']";
    public static final String LABEL_VEHICLE_MODEL = "//*[@id=\"list\"]/div[2]/div/a[1]/div/div/div[3]/div/div[2]/div/div[1]";

    public static final String FIRST_AUTO_FLEA_MARKET = "//*[@id=\"list\"]/div[2]/div/a[1]/div/div/div[1]/div/div[1]/div[1]/div[2]";
    public static final String LABEL_VEHICLE_MODEL_TITLE = "//*[@id=\"container\"]/div/div/div/div/div/div[2]/div/div/div[1]/div/div[4]/div[1]/h1";

    public static final String LABEL_AUTO_FLEA_MARKET_TITLE = "//h1[@class='vehicle-form__title vehicle-form__title_big-alter']";

    public static final String BUTTON_HOUSES_AND_APARTMENTS_SALE = "//span[@class='project-navigation__sign'][text()='Продажа']";
    public static final String BUTTON_HOUSES_AND_APARTMENTS_RENT = "//span[@class='project-navigation__sign'][text()='Аренда']";

    public static final String LABEL_ORDERS = "//div[@class='service-header__title service-header__title_huge'][text()='Заказы']";
    public static final String LABEL_FLEA_MARKET_TITLE = "//h1[@class='m-title-i']";
    public static final String LABEL_FORUM_TITLE = "//h1[@class='m-title']";
    public static final String LABEL_CART_TITLE = "//div[@class='cart-form__title cart-form__title_big-alter cart-form__title_condensed-additional']";
    public static final String SEARCH_LINE = "//input [@class='fast-search__input']";
    public static final String TEXT_FOR_SEARCH = "Samsung";
    public static final String SEARCH_FRAME = "//iframe[@class='modal-iframe']";
    public static final String RESULT_SEARCH_FIRST_PRODUCT = "//div[@class='product__title']";
    public static final String LABEL_TV_TITLE = "//h1[@class='schema-header__title js-schema-header_title'][contains(text(), 'Телевизоры')]";
    public static final String LABEL_ABOUT_COMPANY_TITLE = "//*[@id=\"container\"]/div/div[2]/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div";
    public static final String aboutCompany = "О сайте";
    public static final String LABEL_ENTER_TITLE = "/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div/div[1]";
    public static final String LABEL_ERR_NO_PASSWORD = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    public static final String LABEL_ERR_NO_EMAIL = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";

    public static final String INPUT_LOGIN = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
   
    //The following line with INPUT_PASSWORD locator has the same xpath as LABEL_ERR_NO_PASSWORD. Should be removed and the code should be refactored
    public static final String INPUT_PASSWORD = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    public static final String BUTTON_NUMBERS_OF_OFFERS_LAPTOPS = "//div[@class='schema-product__offers']/a";
    public static final String BUTTON_ADD_LAPTOPS_TO_CART = "//div[@class='offers-list__part offers-list__part_action']//a[2]";
    public static final String LINK_ALL_LIST_LAPTOP_ON_PAGE = "//a[@class='js-product-title-link']";
    public static final String FOOTER_ELEMENTS_CLASS = "footer-style__item";
    public static final String FOOTER_O_KOMPANII = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[1]/a";
    public static final String FOOTER_KONTAKTY_RED = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[2]/a";
    public static final String FOOTER_REKLAMA = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[3]/a";
    public static final String FOOTER_TARIFY = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[4]/a";
    public static final String FOOTER_VAKANSII = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[5]/a";
    public static final String FOOTER_MANIFEST = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[6]/a";
    public static final String FOOTER_POLSOVAT_SOGLASHENIE = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[7]/a";
    public static final String FOOTER_PUBL_DOGOVORI = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[8]/a";
    public static final String FOOTER_POLITIKA_KONF = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[9]/a";
    public static final String FOOTER_PODDERZKA_POLSOVATELEI = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[10]/a";
    public static final String FOOTER_PRAVILA_VOZVRATA = "/html/body/div[4]/footer/div/div/div/div[1]/ul/li[11]/a";
    public static final String NEWS_MONEY_LINK = "//h2/a[contains(text(),'Кошелек')]";
    public static final String FIRST_TITLE = "//a[@class='news-tidings__link']/span[contains(text(),'Этот белорусский продукт')][1]";
    public static final String FIRST_BLOCK_OF_NEWS = "//*[@id='container']//div[@data-post-date='1676985631']";

    public static final String LABEL_ARTICLE_TITLE = "//*[@id='container']//h1";
    public static final String LABEL_RENT_APARTMENT_ALL_PRICES = "//span[@data-bind=\"text: SearchApartments.formatPrice(apartment.price, 'BYN')\"]";
    public static final String LABEL_RENT_APARTMENT_PRICE_EXACT = "//span[@class='apartment-bar__price apartment-bar__price_primary']";

    public static final String LABEL_SERVICE_ITEM_TITLE = "//*[@id=\"container\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/div";
    public static final String SERVICES_PRICE_FIRST_ITEM ="//*[@id=\"service-list\"]/div[2]/div/div/div[3]/search-tasks-list/div/div/div[1]/search-tasks-item/div/div/div[1]/div/a/span[2]/span[1]";

    public static final String LIST_OF_FORUM_THEMES = "//ul[@class = 'b-list-topics']//li//h3";
    public static final String LABEL_TITLE_FIRST_FORUM_THEME = "//div[@class = 'b-mnforum-header']//h1//a";
}
