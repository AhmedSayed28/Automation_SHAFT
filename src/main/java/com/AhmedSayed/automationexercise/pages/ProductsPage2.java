package com.AhmedSayed.automationexercise.pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductsPage2 {
    private SHAFT.GUI.WebDriver driver;
    private String url = System.getProperty("baseUrl");

    private final By productsLink = By.cssSelector("a[href=\"/products\"]");
    private final By MenPlusIcon = By.cssSelector("a[href=\"#Men\"] span");
    private final By jeansLocator = By.cssSelector("a[href=\"/category_products/6\"]");

    private final By jeansHeading = By.cssSelector("div[class=\"features_items\"] h2[class=\"title text-center\"]");
    private final By productsPrices = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"] div[class=\"productinfo text-center\"] h2");

    public ProductsPage2(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    @Step("Navigate To Products Page")
    public ProductsPage2 navigate() {
        driver.browser().navigateToURL(url);
        return this;
    }


    public ProductsPage2 goToProductsPage(){
        driver.element().click(productsLink);
        this.verifyUrl();
        driver.element().click(MenPlusIcon);
        driver.element().click(jeansLocator);

        return this;
    }

    public ProductsPage2 verifyHeadingPage(){
//        driver.element().verifyThat(jeansHeading).text().equals("Men - Jeans Products");
        driver.verifyThat().element(jeansHeading).text().equals("MEN -  JEANS PRODUCTS");
        return this;
    }

    public ProductsPage2 verifyUrl(){
        driver.verifyThat().browser().url().equals(System.getProperty("baseUrl") + "/products");
        return this;
    }


}
