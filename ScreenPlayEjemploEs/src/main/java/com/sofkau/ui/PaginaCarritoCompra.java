package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarritoCompra {

    public static final Target IR_AL_CARRITO=Target.the("Ir al carro")
            .located(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));

    public static final Target PROCERDER_COMPRA=Target.the("Seguir con la compra")
            .located(By.cssSelector(".btn.btn-default.check_out"));

    public static final Target REALIZAR_PEDIDO=Target.the("Realizar pedido")
            .located(By.cssSelector(".btn.btn-default.check_out"));

    public static final Target NOMBRE_TARJETA=Target.the("Propietario tarjeta")
            .located(By.cssSelector("input[name='name_on_card']"));

    public static final Target NUMERO_TARJETA=Target.the("Numero de la tarjeta")
            .located(By.cssSelector("input[name='card_number']"));

    public static final Target CVS_TARJETA=Target.the("CVC de la tarjeta")
            .located(By.cssSelector("input[placeholder='ex. 311']"));

    public static final Target EXPIRACION_MES_TARJETA=Target.the("Mes de expedicion de la tarjeta")
            .located(By.cssSelector("input[placeholder='MM']"));

    public static final Target EXPIRACION_ANIO_TARJETA=Target.the("Anio de expedicion de la tarjeta")
            .located(By.cssSelector("input[placeholder='YYYY']"));

    public static final Target PAGAR=Target.the("Pagar el pedido")
            .located(By.cssSelector("#submit"));

    public static final Target CONFIRMAR_COMPRA=Target.the("Mensaje de confirmacion compra")
            .located(By.cssSelector("h2[class='title text-center'] b"));
}
