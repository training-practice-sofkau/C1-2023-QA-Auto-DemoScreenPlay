package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {


    public static final Target SELECION_PRODUCTOS_POLO = Target.the("Seleccion productos Polo"  )
            .located(By.xpath(" (//a[@href='/brand_products/Polo'])[1]"));

    public static final Target SELECION_PRODUCTOS_POLO2 = Target.the("Seleccionar camisa polo"  )
            .located(By.xpath("   (//a[@href='javascript:void();'][normalize-space()='Add to cart'])[7]"));


}
