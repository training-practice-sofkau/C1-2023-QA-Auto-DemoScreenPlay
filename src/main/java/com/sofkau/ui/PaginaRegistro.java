package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("//button[@data-qa='login-button']"));

    public static final Target REGISTRO_USUARIO = Target.the("Boton crear cuenta")
            .located(By.xpath("(//input[@placeholder='Name'])[1]"));

    public static final Target REGISTRO_EMAIL = Target.the("Boton crear cuenta")
            .located(By.xpath("(//input[@data-qa='signup-email'])[1]"));
    public static final Target BOTON_REGISTRO2 = Target.the("Boton ir al registro")
            .located(By.xpath("(//button[@data-qa='signup-button'])[1]"));
}
