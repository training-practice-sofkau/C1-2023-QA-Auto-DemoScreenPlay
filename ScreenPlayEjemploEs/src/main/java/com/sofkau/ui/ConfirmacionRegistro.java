package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {
    public static Target MENSAJE_DE_REGISTRO = Target.the("mensaje de confirmacion")
            .located(By.xpath("//h2[@data-qa='account-created']//b"));
}
