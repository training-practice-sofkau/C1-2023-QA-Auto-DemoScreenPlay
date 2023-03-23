package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static final Target SECCION_HOMBRES= Target.the("Seccion Hombres")
            .located(By.cssSelector("div.panel:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)"));
    public static final Target JEANS_HOMBRE= Target.the("Seccion Jean hombres")
            .located(By.cssSelector("a[href='/category_products/6']"));
    public static final Target GRUNT_BLUE_JEANS= Target.the("Seccion Jean hombres")
            .located(By.cssSelector("a[href='/product_details/37']"));
    public static final Target AGREGAR_CARRITO= Target.the("Agregar primer producto")
            .located(By.cssSelector("button.btn:nth-child(5)"));
    public static final Target CONTINUAR_COMPRA=Target.the("Continuar comprando")
            .located(By.cssSelector("button.btn:nth-child(1)"));
    public static final Target CAMISETAS_HOMBRE= Target.the("Seccion Camisetas hombres")
            .located(By.cssSelector("a[href='/category_products/3']"));
    public static final Target PREMIUM_POLO = Target.the("Seccion Jean hombres")
            .located(By.cssSelector("a[href='/product_details/30']"));
    public static final Target PRENDAS_MADAME= Target.the("Prendas Madame")
            .located(By.cssSelector("a[href='/brand_products/Madame']"));
    public static final Target VESTIDO_MADAME= Target.the("Agregar tercer producto")
            .located(By.cssSelector("a[href='/product_details/3']"));
}
