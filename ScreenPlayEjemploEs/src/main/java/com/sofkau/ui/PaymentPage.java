package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {

    public static final Target CAMPO_NAME_ON_CARD = Target.the("Campo name on card")
            .located(By.name("name_on_card"));

    public static final Target CARD_NUMBER = Target.the("Campo Numero de tarjeta")
            .located(By.name("card_number"));

    public static final Target CVC = Target.the("Campo codigo de seguridad")
            .located(By.name("cvc"));
    public static final Target EXPIRATION_MONTH = Target.the("Campo Mes de Expiracion")
            .located(By.name("expiry_month"));
    public static final Target EXPIRATION_YEAR = Target.the("Campo Año de Expiracion")
            .located(By.name("expiry_year"));
    public static final Target SUBMIT_BOTTON = Target.the("Boton de submit")
            .located(By.id("submit"));

}
