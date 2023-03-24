package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {
    public static Target MENSAJE_REGISTRO = Target.the("mensaje cuenta creada")
            .located(By.xpath("(//b[normalize-space()='Account Created!'])[1]"));
}
