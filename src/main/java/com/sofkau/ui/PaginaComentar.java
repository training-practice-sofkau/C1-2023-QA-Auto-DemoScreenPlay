package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaComentar extends PageObject {
    /////////////LOCALIZADORES CONTACTO/////////////
    public static final Target OPCION_PRODUCTOS = Target.the("oopcion productos")
            .located(By.cssSelector("a[href='/products']"));
    public static final Target OPCION_KIDS = Target.the("oopcion ropa niños")
            .located(By.xpath("//a[@href='/brand_products/Kookie Kids']"));
    public static final Target VER_PRODUCTO_BUSITOROSADO = Target.the("ver producto busito para niña")
            .located(By.xpath("(//a[contains(text(),'View Product')])[1]"));
    public static final Target CAMPO_NOMBRE_COMENTARIO = Target.the("campo nombre ")
            .located(By.xpath("//input[@id='name']"));
    public static final Target CAMPO_EMAIL_COMENTARIO= Target.the("campo email")
            .located(By.xpath("//input[@id='email']"));
    public static final Target CAMPO_MENSAJE_COMENTARIO= Target.the("campo mensaje")
            .located(By.xpath("//textarea[@id='review']"));
    public static final Target BOTON_ENVIAR = Target.the("Boton enviar comentario")
            .located(By.xpath("(//button[normalize-space()='Submit'])[1]"));

}
