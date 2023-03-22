package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionCompra {


    /**
     *
     */
    public static final Target MENSAJE_FINAL_COMPRA = Target.the("BOTON_CHECKOUT")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));

}
