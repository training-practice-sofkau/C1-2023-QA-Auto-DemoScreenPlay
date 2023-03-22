package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {

    //a[normalize-space()='Kids']
    public static final Target CATEGORIA_KIDS = Target.the("Categoria niña")
            .located(By.xpath("//a[normalize-space()='Kids']"));
    public static final Target CATEGORIA_DRESS = Target.the("Categoria vestidos")
            .located(By.xpath("//*[@id=\"accordian\"]/div[3]/div[1]/h4/a"));
    public static final Target PRODUCTO_SELECCIONADO = Target.the("Producto seleccionado")
            .located(By.xpath("(//a[contains(text(),'Add to cart')])[35]"));


    public static final Target ENLACE_IR_CARRITO = Target.the("Ir a carrito")
            .located(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a"));

    public static final Target ENLACE_IR_CHECKOUT = Target.the("Ir a checkout")
            .located(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));


    public static final Target ENLACE_ORDER = Target.the("Ir order")
            .located(By.xpath("(//a[normalize-space()='Place Order'])[1]"));


    public static final Target NOMBRE_CARD = Target.the("Nombre card")
            .located(By.xpath("//input[@name='name_on_card']"));

    public static final Target NUMERO_CARD = Target.the("Numero card")
            .located(By.xpath("//input[@name='card_number']"));

    public static final Target CVC_CARD = Target.the("CVC card")
            .located(By.xpath("//input[@placeholder='ex. 311']"));
    public static final Target EXPIRACION_CARD = Target.the("Expiracion card")
            .located(By.xpath("//input[@placeholder='MM']"));
    public static final Target YEAR_EXPIRACION_CARD = Target.the("Año expiracion card")
            .located(By.xpath("//input[@placeholder='YYYY']"));
    public static final Target BOTON_CONFIRMAR_COMPRA = Target.the("Boton confirmar compra")
            .located(By.xpath("//button[@id='submit']"));


}
