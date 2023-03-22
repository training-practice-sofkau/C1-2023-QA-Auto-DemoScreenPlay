package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CatalogoProductos extends PageObject {

    public static Target PRODUCTO_ESCOGIDO = Target.the("Mas informacion del producto")
            .located(By.xpath("//a[@href='/product_details/28']"));

}
