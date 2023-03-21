package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {

    public static Target MENSAJE_CONFIRMACION = Target.the("mensaje de confirmacion")
            .located(By.xpath("//h2[@data-qa='account-created']//b"));

}
