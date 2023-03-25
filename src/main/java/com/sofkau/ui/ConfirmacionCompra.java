package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionCompra {
    public static Target MENSAJE_COMPRA_EXITOSA = Target.the("mensaje con el nombre")
            .located(By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']"));
}
