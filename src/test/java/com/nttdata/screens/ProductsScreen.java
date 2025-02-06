package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement titleProducts;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Backpack\"]" )
    private WebElement productsG;

    public boolean titleProductsVisible(){
        return titleProducts.isDisplayed();
    }

    public boolean getProduct(){
        return productsG.isDisplayed();
    }

    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement backpack;

    public void clickbackpack(){
        backpack.click();
    }


    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement addCar;

    public void clickAddCar(){
        addCar.click();
    }


    @AndroidFindBy(accessibility = "Sauce Labs Bolt T-Shirt")
    private WebElement tshirt;

    public void clicktshirt(){
        tshirt.click();
    }

    @AndroidFindBy(accessibility = "Sauce Labs Fleece Jacket")
    private WebElement jacket;

    public void clicktjacket(){
        jacket.click();
    }

    @AndroidFindBy(accessibility = "Increase item quantity")
    private WebElement botonMas;

    public void setCantidad(int cantidad) {
        for (int i = 1; i < cantidad; i++) {
            botonMas.click();
        }
    }



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement clickCarrito;

    public void clickCar(){
        clickCarrito.click();
    }

}
