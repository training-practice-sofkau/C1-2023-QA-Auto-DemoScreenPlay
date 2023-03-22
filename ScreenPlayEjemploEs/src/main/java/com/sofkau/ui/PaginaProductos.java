package com.sofkau.ui;

import io.cucumber.java.sl.Ter;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductos extends PageObject {

    public static final Target SHOPPING_CART = Target.the("Modulo Carrito")
            .located(By.xpath("//a[normalize-space()='Cart']"));
    public static final Target MEN_CATEGORY = Target.the("Categoria de hombres")
            .located(By.xpath("//a[normalize-space()='Men']"));
    public static final Target TSHIRT_SELECTOR = Target.the("Selector TSHIRT")
            .located(By.xpath("//a[normalize-space()='Tshirts']"));
    public static final Target PRODUCT_1 = Target.the("Tshirt 1")
            .located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
    public static final Target PRODUCT_2 = Target.the("Tshirt 2")
            .located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]"));

    public static final Target AGREGAR_AL_CARRO=Target.the("Agregar producto1")
            .located(By.cssSelector("button[type='button']"));
    public static final Target CONTINUE_SHOPPING =Target.the("Continuar comprando")
            .located(By.cssSelector(".btn.btn-success.close-modal.btn-block"));

    public static final Target VOLVER_PAGINA_PRINCIPAL=Target.the("Volver a comprar productos")
            .located(By.cssSelector("a[href='/products']"));
}
