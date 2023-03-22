package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeFinalCompra {
    public static final Target MENSAJE_FINAL_COMPRA = Target.the("Mensaje final de compra")
            .located(By.xpath("//h2[@data-qa='order-placed']//b"));
}
