package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.cssSelector(".fa-lock"));
    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.cssSelector(".login-form > form:nth-child(2) > input:nth-child(2)"));
    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.cssSelector(".login-form > form:nth-child(2) > input:nth-child(3)"));
    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.cssSelector("button.btn:nth-child(4)"));
    public static final Target CAMPO_NOMBRE_COMPLETO = Target.the("Campo nombre")
            .located(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(2)"));
    public static final Target CAMPO_EMAIL = Target.the("Campo email")
            .located(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
    public static final Target BOTON_SIGNUP = Target.the("Boton signup")
            .located(By.cssSelector("button.btn:nth-child(5)"));
}
