package com.sofkau.ui;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart extends PageObject {

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Boton checkout")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));


}
