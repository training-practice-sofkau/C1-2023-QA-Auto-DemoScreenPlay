package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {

    public static Target INDICADOR_PAGINA_INICIO = Target.the("Borrado cuenta")
            .located(By.cssSelector(".navbar-nav > li:nth-child(10)"));
}
