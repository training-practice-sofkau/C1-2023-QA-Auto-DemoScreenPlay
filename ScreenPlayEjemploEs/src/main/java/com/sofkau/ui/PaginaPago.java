package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPago extends PageObject {

    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("nombre de la tarjeta")
            .located(By.xpath("//input[@data-qa='name-on-card']"));

    public static final Target CAMPO_NUMERO_TARJETA = Target.the("numero de la tarjeta")
            .located(By.xpath("//input[@data-qa='card-number']"));

    public static final Target CAMPO_CVC = Target.the("numero cvc")
            .located(By.xpath("//input[@data-qa='cvc']"));

    public static final Target CAMPO_MES = Target.the("mes de expiracion de la tarjeta")
            .located(By.xpath("//input[@data-qa='expiry-month']"));


    public static final Target CAMPO_ANIO = Target.the("año de expiracion de la tarjeta")
            .located(By.xpath("//input[@data-qa='expiry-year']"));

    public static final Target BOTON_PAGAR = Target.the("boton pagar")
            .located(By.xpath("//button[@data-qa='pay-button']"));
}
