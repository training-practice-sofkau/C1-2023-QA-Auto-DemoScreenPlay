package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprarProducto extends PageObject {

    /**
     * Localizadores compra
     */


    public static final Target BOTON_PRODUCTO = Target.the("Producto")
            .located(By.xpath("//a[@href='/products']"));

    public static final Target BOTON_KIDS = Target.the("kids")
            .located(By.xpath("//a[normalize-space()='Kids']"));


    public static final Target BOTON_DRESS = Target.the("dress")
            .located(By.xpath("(//a[contains(text(),'Dress')])[2]"));

    public static final Target BOTON_COMPRAR_SLEEVES = Target.the("ADD_VESTIDO")
            .located(By.xpath("(//a[@href='javascript:void();'][normalize-space()='Add to cart'])[1]"));

    public static final Target BOTON_CONTINUE = Target.the("BOTON_CONTINUE")
            .located(By.xpath("(//button[normalize-space()='Continue Shopping']"));


    public static final Target BOTON_CARRITO = Target.the("BOTON_CARRITO")
            .located(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']"));


    public static final Target BOTON_CHECKOUT = Target.the("BOTON_CHECKOUT")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));


    public static final Target BOTON_PLACE_ORDEN = Target.the("place orden")
            .located(By.xpath("//a[normalize-space()='Place Order']"));


    /******************************************/


    public static final Target CAMPO_NAME_CARD = Target.the("nombre card")
            .located(By.xpath("//input[@name='name_on_card']"));


    public static final Target CAMPO_CARD_NUMERO = Target.the("card numero")
            .located(By.xpath("//input[@name='card_number']"));


    public static final Target CAMPO_CVC = Target.the("ccv")
            .located(By.xpath("//input[@placeholder='ex. 311']"));


    public static final Target CAMPO_EXPIRATION = Target.the("fecha experation")
            .located(By.xpath("//input[@placeholder='MM']"));


    public static final Target CAMPO_FECHA_ANIO = Target.the("fecha anio")
            .located(By.xpath("//input[@placeholder='YYYY']"));


    public static final Target BOTON_CONFIRMAR_ORDEN = Target.the("cofirmar orden")
            .located(By.xpath("//button[@id='submit']"));


}
