package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "product_sort_container")
    WebElement sortProducts;

    @FindBy(css = ".inventory_list .inventory_item:nth-of-type(6) .btn_inventory")
    WebElement cheapestProduct;

    @FindBy(css = "#shopping_cart_container")
    WebElement cartButton;

    @FindBy(css = ".btn_action.checkout_button")
    WebElement checkout;

    public void clickCartButton() {
        clickOnElement(cartButton);
        log.info("Clicking On CartButton :" +cartButton.toString());
    }
    public void clickCheckout() {
        clickOnElement(checkout);
        log.info("Clicking On Checkout :" +checkout.toString());

    }
    public void sortProductsHighToLow(String price) {
        selectByVisibleTextFromDropDown(sortProducts, price);
        log.info("Select Product From DropDown:" +sortProducts.toString());

    }
    public void addCheapestProduct() {
        clickOnElement(cheapestProduct);
        log.info("Clicking On Cheapest Price Product :" +cheapestProduct.toString());

    }
}
