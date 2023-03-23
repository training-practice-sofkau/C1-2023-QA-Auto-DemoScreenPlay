package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito {
    public static final Target CARRITO_COMPRAS = Target.the("Ir al carrito")
            .located(By.cssSelector(".nav > li:nth-child(3) > a:nth-child(1)"));
    public static final Target PROCEDER_CHECKOUT = Target.the("Ir al checkout")
            .located(By.cssSelector("a.btn"));
    public static final Target COMENTARIO_PEDIDO = Target.the("Comentairos del pedido")
            .located(By.className("form-control"));
    public static final Target GENERAR_PEDIDO = Target.the("Generar el pedido")
            .located(By.cssSelector("a[href='/payment"));
}