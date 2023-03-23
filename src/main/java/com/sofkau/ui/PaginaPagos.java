package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPagos {
    public static final Target NOMBRE_TARJETA_CREDITO= Target.the("Nombre titular tarjeta credito")
            .located(By.cssSelector("div.form-row:nth-child(2) > div:nth-child(1) > input:nth-child(2)"));
    public static final Target NUMERO_TARJETA_CREDITO= Target.the("Numero tarjeta credito")
            .located(By.cssSelector(".card-number"));
    public static final Target CVC_TARJETA_CREDITO= Target.the("CVC tarjeta credito")
            .located(By.cssSelector(".card-cvc"));
    public static final Target MES_EXPIRACION_TARJETA_CREDITO =Target.the("Mes expiracion tarjeta credito")
            .located(By.cssSelector(".card-expiry-month"));
    public static final Target ANNO_EXPIRACION_TARJETA_CREDITO =Target.the("Anno expiracion tarjeta credito")
            .located(By.cssSelector(".card-expiry-year"));
    public static final Target PAGAR_Y_CONTINUAR =Target.the("Pagar productos y continuar")
            .located(By.id("submit"));
    public static final Target MENSAJE_CONFIRMACION_PEDIDO =Target.the("Confirmacion pedido realizado con exito")
            .located(By.cssSelector(".col-sm-9 > p:nth-child(2)"));

}
