package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraProducto extends PageObject {

    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target EMAIL_USUARIO = Target.the("Email del usuario")
            .located(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));

    public static final Target PASSWORD_USUARIO = Target.the("Passwor del usuario")
            .located(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));

    public static final Target BOTON_LOGIN = Target.the("boton de confirmacion usuario y password")
            .located(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));

    public static final Target CATEGORIA_HOMBRE = Target.the("Seccion de hombre")
            .located(By.xpath("//a[@href='#Men']"));

    public static final Target SECCION_JEANS = Target.the("Jeans")
            .located(By.xpath("//*[@id=\'Men\']/div/ul/li[2]/a"));

    public static final Target ELECCION_PRODUCTO = Target.the("Jeans")
            .located(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[2]/ul/li/a"));

    public static final Target CARRITO_COMPRA = Target.the("Añadir al carrito de compra")
            .located(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));

    public static final Target BOTON_VIEW_CART = Target.the("Jeans")
            .located(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u"));

    public static final Target VERIFICAR_PEDIDO = Target.the("Verificar el pedido y datos personales")
            .located(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));

    public static final Target BOTON_REALIZAR_PEDIDO = Target.the("Proceder a ingresar los datos del medio de pago")
            .located(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a"));

    public static final Target NOMBRE_USUARIO_EN_TARJETA = Target.the("Ingrese el nombre del usuario que aparece en la tarjeta")
            .located(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));

    public static final Target NUMERO_TARJETA = Target.the("Ingresar el numero de la tarjeta")
            .located(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));

    public static final Target CVC_TARJETA = Target.the("Ingresar el cvc de 3 digito")
            .located(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));

    public static final Target MES_VIGENCIA_TARJETA = Target.the("Ingresar hasta que mes esta viginte la tarjeta")
            .located(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
    public static final Target ANIO_VIGENCIA_TARJETA = Target.the("Ingresar hasta que año esta viginte la tarjeta")
            .located(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
    public static final Target BOTON_PAGAR_PRODUCTO = Target.the("Boton para confirmar el pago del producto")
            .located(By.xpath("//*[@id=\"submit\"]"));

    public static final Target MENSAJE_CONFIRMACION = Target.the("Mensaje de confirmacio")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));






}
