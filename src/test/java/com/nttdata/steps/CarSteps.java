package com.nttdata.steps;

import com.nttdata.screens.CarScreen;
import org.junit.Assert;

public class CarSteps {

    CarScreen carScreen;

    public void validateCarrito(){

        Assert.assertTrue(carScreen.getCarTitle());
    }


}
