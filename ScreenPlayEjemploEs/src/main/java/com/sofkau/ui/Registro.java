package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Registro extends PageObject {


    public static final Target CAMPO_NOMBRE_USUARIO = Target.the("campo nombre usuario")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_EMAIL = Target.the("campo email")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_RESGISTRARSE = Target.the("Botón registrarse")
            .located(By.xpath("//button[@data-qa='signup-button']"));

}
