package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioDatosPago extends PageObject {

    public static final Target CARD_NAME = Target.the("Nombre en la tarjeta")
            .located(By.xpath("(//input[@data-qa='name-on-card'])[1]"));

    public static final Target CARD_NUMBER = Target.the("Número de la tarjeta")
            .located(By.xpath("(//input[@data-qa='card-number'])[1]"));

    public static final Target CVC = Target.the("CVC")
            .located(By.xpath("(//input[@placeholder='ex. 311'])[1]"));

    public static final Target EXPIRATION_MONTH = Target.the("Fecha de expiracion (mes)")
            .located(By.xpath("(//input[@placeholder='MM'])[1]"));

    public static final Target EXPIRATION_YEAR = Target.the("Fecha de expiracion (año)")
            .located(By.xpath("(//input[@placeholder='YYYY'])[1]"));

    public static final Target BOTON_PAGAR = Target.the("Boton de pago")
            .located(By.xpath("//button[@data-qa='pay-button']"));
}
