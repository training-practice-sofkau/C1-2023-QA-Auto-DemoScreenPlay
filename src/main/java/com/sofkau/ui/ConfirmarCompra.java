package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmarCompra extends PageObject {

    public static Target MENSAJE_ORDER = Target.the("mensaje con el nombre")
            .located(By.xpath("(//a[@data-qa='continue-button'])[1]"));
}
