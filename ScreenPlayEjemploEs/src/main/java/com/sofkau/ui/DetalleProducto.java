package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleProducto extends PageObject {
    public static final Target AGREGAR_AL_CARRITO = Target.the("Agregar al carrito")
            .located(By.xpath("//*[@class='btn btn-default cart']"));
    public static final Target CONTINUAR = Target.the("Continuar")
            .located(By.xpath("//*[@class='btn btn-success close-modal btn-block']"));
    public static final Target IR_AL_CARRITO = Target.the("Ir al carrito")
            .located(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));


}
