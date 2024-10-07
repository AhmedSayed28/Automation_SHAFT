package com.AhmedSayed.automationexercise.tests;

import com.AhmedSayed.automationexercise.pages.ProductsPage2;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsTests2 {

    @BeforeMethod
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }

    private SHAFT.GUI.WebDriver driver;
    @Test(description = "Verify Product2")
    @Description("Given I open Automation Exercise home, When I click 'View Product' for any product on the home page, Then I verify that the product detail page is opened, When I increase the product quantity to 4 and click 'Add to cart', And then click 'View Cart', Then I verify that the product is displayed in the cart page with the exact quantity of 4")
    public void verifyProductQuantity() {
        new ProductsPage2(driver)
                .navigate()
                .goToProductsPage()
                .verifyHeadingPage();

    }
}
