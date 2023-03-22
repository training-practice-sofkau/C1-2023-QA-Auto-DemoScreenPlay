package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Pago extends PageObject {
    public static final Target NOMBRE_TARJETA = Target.the("Nombre tarjeta")
            .located(By.xpath("//*[@data-qa='name-on-card']"));

    public static final Target NUMERO_TARJETA = Target.the("Numero tarjeta")
            .located(By.xpath("//*[@data-qa='card-number']"));

    public static final Target CVC = Target.the("CVC")
            .located(By.xpath("//*[@data-qa='cvc']"));

    public static final Target MES_TARJETA = Target.the("Fecha tarjeta")
            .located(By.xpath("//*[@data-qa='expiry-month']"));

    public static final Target YEAR_TARJETA = Target.the("Year tarjeta")
            .located(By.xpath("//*[@data-qa='expiry-year']"));

    public static final Target SUMBIT = Target.the("Submit")
            .located(By.id("submit"));


}
