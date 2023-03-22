package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Productos extends PageObject {
    public static final Target PRODUCTO = Target.the("Producto")
            .located(By.xpath("//*[@href='/product_details/2']"));
}
