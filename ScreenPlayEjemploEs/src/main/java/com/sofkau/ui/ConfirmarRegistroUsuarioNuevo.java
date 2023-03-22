package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmarRegistroUsuarioNuevo extends PageObject {


    public static Target MENSAJE_FINAL_REGISTRO = Target.the("mensaje con el nombre")
            .located(By.xpath("//b[normalize-space()='Account Created!']"));
}
