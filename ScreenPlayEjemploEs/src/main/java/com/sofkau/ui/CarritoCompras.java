package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoCompras extends PageObject {
    public static final Target PROSEGUIR_COMPRA = Target.the("Proseguir compra")
            .located(By.xpath("//*[@class='btn btn-default check_out']"));

}
