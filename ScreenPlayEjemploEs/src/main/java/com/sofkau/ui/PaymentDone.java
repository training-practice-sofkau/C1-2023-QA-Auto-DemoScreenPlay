package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentDone {

    public static final Target PAYMENT_DONE = Target.the("Texto de pago exitoso")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));
}
