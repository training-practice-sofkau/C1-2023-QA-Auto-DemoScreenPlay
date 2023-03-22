package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {


    public static final Target SELECION_PRODUCTOS_POLO = Target.the("Seleccion productos Polo"  )
            .located(By.xpath(" /html/body/section/div/div[2]/div[2]/div/div[4]/div/div[2]/ul/li/a"));

    public static final Target SELECION_PRODUCT0_CAMISA_N = Target.the("Seleccionar camisa polo"  )
            .located(By.xpath("  /html/body/section/div/div[2]/div[2]/div/div[4]/div/div[2]/ul/li/a"));

    public static final Target CATEGORIA_HOMBRE = Target.the("Seccion de hombre")
            .located(By.xpath("//a[normalize-space()='Men']"));

    public static final Target SECCION_JEANS = Target.the("Jeans")
            .located(By.xpath("//*[@id=\'Men\']/div/ul/li[2]/a"));




    // jessica


    public static final Target OPTION_WOMEN = Target.the("Opcion women")
            .located(By.xpath("//a[@href='#Women']"));
    public static final Target OPTION_SAREE = Target.the("Opcion Saree")
            .located(By.xpath("//a[normalize-space()='Saree']"));

}
