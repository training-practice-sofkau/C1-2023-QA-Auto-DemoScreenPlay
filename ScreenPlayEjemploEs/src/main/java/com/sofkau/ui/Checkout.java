package com.sofkau.ui;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class Checkout extends PageObject {
    public static final Target PLACE_ORDER = Target.the("Boton PLace Order")
            .located(By.cssSelector(".btn.btn-default.check_out"));
}
