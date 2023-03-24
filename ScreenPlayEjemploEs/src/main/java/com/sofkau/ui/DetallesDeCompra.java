package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetallesDeCompra extends PageObject {

    public static Target BTN_PLACE_ORDER = Target.the("Boton acceder a datos de pago")
            .located(By.xpath("//a[@href='/payment']"));

}
