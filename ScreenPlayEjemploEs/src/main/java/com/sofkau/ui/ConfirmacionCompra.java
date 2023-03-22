package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static final Target MENSAJE_CONFIRMACION_COMPRA = Target.the("Confirmacion compra")
            .located(By.xpath("//*[@data-qa='order-placed']"));
}
