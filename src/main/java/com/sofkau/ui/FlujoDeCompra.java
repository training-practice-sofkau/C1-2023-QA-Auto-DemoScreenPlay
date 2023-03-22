package com.sofkau.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FlujoDeCompra extends PageObject {
    public static final Target BOTON_PRODUCTOS = Target.the("Boton ir a productos")
            .located(By.xpath("//a[@href='/products']"));
    public static final Target CATEGORIA_MEN = Target.the("opcion productos MEN")
            .located(By.xpath("//a[normalize-space()='Men']"));
    public static final Target SUBCATEGORIA_TSHIRTS  = Target.the("SUBCATEGORIA TSHIRTS")
            .located(By.xpath("//a[normalize-space()='Tshirts']"));
    public static final Target BOTON_VIEW_PRODUCT_CAMISETA = Target.the("Green Side Placket Detail ")
            .located(By.xpath("(//a[contains(text(),'View Product')])[3]"));
    public static final Target CAMPO_CANTIDAD = Target.the("campo de cantidad")
            .located(By.xpath("//input[@id='quantity']"));
    public static final Target BOTON_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando")
            .located(By.xpath("//button[normalize-space()='Continue Shopping']"));
    public static final Target SUBCATEGORIA_JEANS  = Target.the("SUBCATEGORIA JEANS")
            .located(By.xpath("//a[normalize-space()='Jeans']"));
    public static final Target BOTON_VIEW_PRODUCT_JEANS3 = Target.the("Grunt Blue Slim Fit Jeans ")
            .located(By.xpath("(//a[contains(text(),'View Product')])[3]"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("BOTON AGREGAR AL CARRITO")
            .located(By.xpath("//button[normalize-space()='Add to cart']"));
    public static final Target BOTON_VER_CARRITO = Target.the("Boton ir a ver el carrito de compras")
            .located(By.xpath("//a[normalize-space()='Cart']"));
    public static final Target BOTON_CAJA_DE_COMENTARIOS = Target.the("CAJA DE COMENTARIOS")
            .located(By.xpath("//textarea[@name='message']"));

    public static final Target BOTON_CHECKOUT = Target.the("Proceed To Checkout")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
    public static final Target BOTON_HACER_ORDEN = Target.the("boton hacer la orden")
            .located(By.xpath("//a[normalize-space()='Place Order']"));
    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("campo ingresar nombre tarjeta ")
            .located(By.xpath("//input[@name='name_on_card']"));
    public static final Target CAMPO_NUMERO_TARJETA = Target.the("campo ingresar numero de la tarjeta")
            .located(By.xpath("//input[@name='card_number']"));
    public static final Target CAMPO_CVC = Target.the("campo CVC")
            .located(By.xpath("//input[@placeholder='ex. 311']"));
    public static final Target CAMPO_MES_TARJETA = Target.the("campo MM ")
            .located(By.xpath("//input[@placeholder='MM']"));
    public static final Target CAMPO_ANNO_TARJETA = Target.the("campo YY")
            .located(By.xpath("//input[@placeholder='YYYY']"));
    public static final Target BOTON_PAGAR = Target.the("boton pagar y hacer pedido ")
            .located(By.cssSelector("#submit"));
}

