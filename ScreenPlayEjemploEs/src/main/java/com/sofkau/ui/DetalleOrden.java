package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleOrden extends PageObject {
    public static final Target PAGO = Target.the("Orden")
            .located(By.xpath("//*[@href='/payment']"));
}
