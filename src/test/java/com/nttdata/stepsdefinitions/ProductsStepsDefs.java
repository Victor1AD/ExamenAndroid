package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarSteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class ProductsStepsDefs {
    @Steps
    ProductsSteps productsSteps;
    @Steps
    CarSteps carSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        productsSteps.validateProductsTitle();
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        productsSteps.validateProduct();

    }


    @When("agrego {int} del siguiente producto {string}")
    public void agregoProductoAlCarrito(int unidades, String producto) {
        productsSteps.agregarProductoAlCarrito(producto, unidades);
    }


    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        carSteps.validateCarrito();
    }
}
