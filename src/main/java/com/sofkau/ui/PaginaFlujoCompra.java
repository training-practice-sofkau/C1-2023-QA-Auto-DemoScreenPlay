package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaFlujoCompra extends PageObject {
                    //////// LOCALIZADORES FLUJO DE COMPRA/////////////

    public static final Target BOTON_PRODUCTS = Target.the("Boton ir a productos")
            .located(By.xpath("//a[@href='/products']"));
    public static final Target OPCION_MADAME = Target.the("opcion productos Madame")
            .located(By.xpath("//a[@href='/brand_products/Madame']"));
    public static final Target VER_PRODUCTO_LIANA_PAVO_REAL = Target.the("ver producto Lino pavo real")
            .located(By.xpath("(//a[contains(text(),'View Product')])[5]"));
    public static final Target CAMPO_CANT_LIANA = Target.the("modificar cantidad liana")
            .located(By.xpath("//input[@id='quantity']"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito")
            .located(By.xpath("//button[normalize-space()='Add to cart']"));
    public static final Target BOTON_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando")
            .located(By.xpath("//button[normalize-space()='Continue Shopping']"));
    public static final Target BOTON_VER_CARRITO = Target.the("Boton ir a ver el carrito de compras")
            .located(By.xpath("//u[normalize-space()='View Cart']"));
    public static final Target OPCION_POLO = Target.the("opcion productos Polo")
            .located(By.xpath("//a[@href='/brand_products/Polo']"));
    public static final Target VER_PRODUCTO_JEAN = Target.the("opcion ver jean")
            .located(By.xpath("(//a[contains(text(),'View Product')])[5]"));
    public static final Target OPCION_NAME = Target.the("opcion nombre")
            .located(By.xpath("(//input[@id='name'])[1]"));
    public static final Target OPCION_EMAIL = Target.the("opcion email")
            .located(By.xpath("//input[@id='email']"));
    public static final Target OPCION_DESCRIPCION = Target.the("opcion descripcion")
            .located(By.xpath("//textarea[@id='review']"));
    public static final Target BOTON_SUBMIT = Target.the("boton enviar descripcion")
            .located(By.xpath("//button[@id='button-review']"));
    public static final Target BOTON_AGREGAR_CARRITO_JEAN = Target.the("boton agregar al carrito el jean")
            .located(By.xpath("//button[normalize-space()='Add to cart']"));
    public static final Target BOTON_VER_CARRITO_JEAN = Target.the("boton ver carrito")
            .located(By.xpath("//u[normalize-space()='View Cart']"));
    public static final Target BOTON_CHECKOUT = Target.the("boton ir a la caja")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
    public static final Target CAMPO_MENSAJE_ANEXO = Target.the("campo mensaje de anexo")
            .located(By.xpath("//textarea[@name='message']"));
    public static final Target BOTON_HACER_ORDEN = Target.the("boton hacer la orden")
            .located(By.xpath("//a[normalize-space()='Place Order']"));
    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("campo ingresar nombre tarjeta ")
            .located(By.xpath("//input[@name='name_on_card']"));
    public static final Target CAMPO_NUMERO_TARJETA = Target.the("campo ingresar numero de la tarjeta")
            .located(By.xpath("//input[@name='card_number']"));
    public static final Target CAMPO_CVC = Target.the("campo CVC")
            .located(By.xpath("//input[@placeholder='ex. 311']"));
    public static final Target CAMPO_MM = Target.the("campo MM ")
            .located(By.xpath("//input[@placeholder='MM']"));
    public static final Target CAMPO_YY = Target.the("campo YY")
            .located(By.xpath("//input[@placeholder='YYYY']"));
    public static final Target BOTON_PAY = Target.the("boton pagar y hacer pedido ")
            .located(By.cssSelector("#submit"));
}
