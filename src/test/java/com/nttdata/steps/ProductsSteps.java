package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.getDriver;

public class ProductsSteps {

    ProductsScreen productsScreen;


    public void validateProductsTitle(){
        Assert.assertTrue(productsScreen.titleProductsVisible());
    }

    public void validateProduct(){

        Assert.assertTrue(productsScreen.getProduct());
    }

    public void EnterBackpack(){
        productsScreen.clickbackpack();
    }

    public void AddCarrito(){
        productsScreen.clickAddCar();
    }

    public void EnterTshirt(){
        productsScreen.clicktshirt();
    }


    public void EnterJacket(){
        productsScreen.clicktjacket();
    }

    public void agregarProductoAlCarrito(String producto, int cantidad) {
        switch (producto) {
            case "Sauce Labs Backpack":
                productsScreen.clickbackpack();
                productsScreen.setCantidad(cantidad);
                productsScreen.clickAddCar();
                productsScreen.clickCar();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                productsScreen.clicktshirt();
                productsScreen.setCantidad(cantidad);
                productsScreen.clickAddCar();
                productsScreen.clickCar();
                break;
            case "Sauce Labs Fleece Jacket":
                productsScreen.clicktjacket();
                productsScreen.setCantidad(cantidad);
                productsScreen.clickAddCar();
                productsScreen.clickCar();
                break;

            default:
                throw new IllegalArgumentException("Producto no reconocido: " + producto);
        }
    }






}
