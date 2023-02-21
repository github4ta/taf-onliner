package by.itacademy.onliner;

public class OnlinerPage {

    public static final String URL="https://www.onliner.by";

    public static final String LINK_CATALOG = "//span[@class='b-main-navigation__text'][contains(text(),'Каталог')]";
    public static final String LINK_NEWS = "//span[@class='b-main-navigation__text'][contains(text(),'Новости')]";
    public static final String LINK_CAR_MARKET = "//span[@class='b-main-navigation__text'][contains(text(),'Автобарахолка')]";
    public static final String LINK_HOUSES_AND_APARTMENTS = "//span[@class='b-main-navigation__text'][contains(text(),'Дома и квартиры')]";
    public static final String LINK_SERVICES = "//span[@class='b-main-navigation__text'][contains(text(),'Услуги')]";
    public static final String LINK_FLEA_MARKET = "//span[@class='b-main-navigation__text'][contains(text(),'Барахолка')]";
    public static final String LINK_FORUM = "//span[@class='b-main-navigation__text'][contains(text(),'Форум')]";

    public static final String BUTTON_ENTRANCE ="//div[@class='auth-bar__item auth-bar__item--text']";
    public static final String BUTTON_CART ="//a[@class='auth-bar__item auth-bar__item--cart']";
    public static final String BUTTON_ELECTRONICS ="//span[@class='catalog-navigation-classifier__item-title-wrapper'][text()='Электроника']";
    public static final String BUTTON_COMPUTERS_AND_NETWORKS ="//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(),'Компьютеры')]";
    public static final String BUTTON_APPLIANCES ="//span[@class='catalog-navigation-classifier__item-title-wrapper'][text()='Бытовая техника']";
    public static final String BUTTON_REGISTRATION_ENTRANCE = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";

    public static final String LABEL_COPYRIGHT = "//div[@class='footer-style__copy']";
    public static final String LABEL_ABOUT_THE_COMPANY = "//a[@href='https://blog.onliner.by/about']";
    public static final String LABEL_CATALOG = "//div[@class='catalog-navigation__title']";
    public static final String LABEL_TV_AND_VIDEO ="//div[@class='catalog-navigation-list__aside-title'][contains(text(), 'Телевидение')]";
    public static final String BUTTON_TV ="//a[@href='https://catalog.onliner.by/tv']";
    public static final String LABEL_LAPTOPS_AND_COMPUTERS_AND_MONITOR ="//div[@class='catalog-navigation-list__aside-title'][text()=' Ноутбуки, компьютеры, мониторы ']";
    public static final String LABEL_LAPTOPS ="//a[@href='https://catalog.onliner.by/notebook']";
    public static final String LABEL_AUTO_FLEA_MARKET ="//h1[@class='vehicle-form__title vehicle-form__title_big-alter']";
    public static final String LABEL_SALE ="//span[@class='project-navigation__sign'][text()='Продажа']";
    public static final String LABEL_RENT ="//span[@class='project-navigation__sign'][text()='Аренда']";
    public static final String LABEL_ORDERS ="//div[@class='service-header__title service-header__title_huge'][text()='Заказы']";
    public static final String LABEL_FLEA_MARKET ="//h1[@class='m-title-i']";
    public static final String LABEL_FORUM ="//h1[@class='m-title']";
    public static final String LABEL_CART ="//div[@class='cart-form__title cart-form__title_big-alter cart-form__title_condensed-additional']";
    public static final String SEARCH_LINE = "//input [@class='fast-search__input']";
    public static final String TEXT_FOR_SEARCH = "Samsung";
    public static final String SEARCH_FRAME = "//iframe[@class='modal-iframe']";
    public static final String RESULT_SEARCH_FIRST_PRODUCT = "//div[@class='product__title']";
    public static final String LABEL_TV ="//h1[@class='schema-header__title js-schema-header_title'][contains(text(), 'Телевизоры')]";
    public static final String LABEL_OBOUT_TXT = "//*[@id=\"container\"]/div/div[2]/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div";
    public static final String LABEL_OBOUT_TXT_HEADER = "О сайте";
    public static final String  LABEL_ENTER = "/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div/div[1]";
    public static final String LABEL_WITHOUT_PASSWORD = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    public static final String LABEL_WITHOUT_EMAIL = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    public static final String LABEL_NUMBERS_OF_OFFERS_LAPTOPS = "//div[@class='schema-product__offers']";
    public static final String LABEL_ADD_LAPTOPS_TO_CART = "//div[@class='offers-list__part offers-list__part_action']//a[2]";
    public static final String LABEL_ALL_LIST_LAPTOP_ON_PAGE = "//div[@class='offers-list__part offers-list__part_action']//a[2]";
}
