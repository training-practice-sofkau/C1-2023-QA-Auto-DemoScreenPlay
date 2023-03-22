package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NuevoUsuario extends PageObject {


    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target CAMPO_USUARIO_NUEVO = Target.the("campo usuario nuevo")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_CORREO_NUEVO = Target.the("campo contraseña nueva")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_REGISTRO_NUEVO = Target.the("Botón registro")
            .located(By.xpath("//button[@data-qa='signup-button']"));


}
