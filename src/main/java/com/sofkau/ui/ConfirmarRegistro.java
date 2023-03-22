package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmarRegistro extends PageObject {

    public static Target MENSAJE_REGISTROE = Target.the("mensaje registro exitoso")
            .located(By.xpath("(//b)[1]"));
}
