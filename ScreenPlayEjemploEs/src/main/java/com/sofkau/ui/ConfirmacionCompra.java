package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA = Target.the("mensaje gracias por comprar")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));
}
