package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoDeCompras extends PageObject {

    public static Target BTN_CHECKOUT = Target.the("Boton acceder al checkout")
            .located(By.xpath("//a[@class='btn btn-default check_out']"));

}
