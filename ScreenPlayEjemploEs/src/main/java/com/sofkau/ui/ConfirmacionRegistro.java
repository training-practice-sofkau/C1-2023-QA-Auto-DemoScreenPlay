package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//b[1]"));
    public static Target MENSAJE_CONFIRMACION = Target.the("mensaje con el nombre")
            .located(By.xpath("//p[1]"));
}
