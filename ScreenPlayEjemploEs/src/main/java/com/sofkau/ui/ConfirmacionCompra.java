package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static final Target MSJ_CONFIRMAR_COMPRA = Target.the("MSJ confirma compra")
            .located(By.xpath("(//b)[2]"));

}
