package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprarProductos extends PageObject {

    public static final Target CATEGORIA_HOMBRE = Target.the("categoria hombre")
            .located(By.xpath("//a[normalize-space()='Men']"));

    public static final Target SUBCATEGORIA_JEANS = Target.the("subcategoria jeans")
            .located(By.xpath("//a[normalize-space()='Jeans']"));

    public static final Target VER_PRODUCTO_1 = Target.the("ver producto 1")
            .located(By.xpath("(//a[contains(text(),'View Product')])[1]"));

    public static final Target AGREGAR_CARRITO = Target.the("agregar al carrito")
            .located(By.cssSelector("button[type='button']"));

    public static final Target CONTINUAR_COMPRANDO = Target.the("boton agregar producto1")
            .located(By.cssSelector(".btn.btn-success.close-modal.btn-block"));

    public static final Target VER_CARRITO = Target.the("boton agregar producto1")
            .located(By.xpath("//u[normalize-space()='View Cart']"));

    public static final Target VER_PRODUCTO_2 = Target.the("ver producto 2")
            .located(By.xpath("(//a[contains(text(),'View Product')])[2]"));

    public static final Target BOTON_CONTINUAR_COMPRA = Target.the("boton continuar con la compra")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));

    public static final Target BOTON_ORDEN_COMPRA = Target.the("boton orden de compra")
            .located(By.xpath("//a[normalize-space()='Place Order']"));



}
