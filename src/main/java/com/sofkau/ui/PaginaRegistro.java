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


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //// REGISTRAR USUARIO
    public static final Target CAMPO_NOMBRE = Target.the("campo nombre")
            .located(By.xpath("//input[@placeholder='Name']"));
    public static final Target CAMPO_EMAIL = Target.the("campo email")
            .located(By.xpath("//input[@data-qa='signup-email']"));
    public static final Target BOTON_SIGNUP = Target.the("Boton registro")
            .located(By.xpath("(//*[@class='btn btn-default'])[2]"));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //// REGISTRAR USUARIO
    public static final Target BOTON_TITLE_MR = Target.the("Botón title MR")
            .located(By.xpath("//input[@id='id_gender1']"));
    public static final Target BOTON_TITLE_MRs = Target.the("Botón title MRs")
            .located(By.xpath("(//input[@id='id_gender2'])[1]"));
    public static final Target CAMPO_PASSWORD = Target.the("campo password")
            .located(By.xpath("(//input[@id='password'])[1]"));
    public static final Target BOX_DAY = Target.the("BOX DAY")
            .located(By.cssSelector("#days"));
    public static final Target CAMPO_DAY = Target.the("CAMPO DAY")
            .located(By.xpath("//option[@value='17']"));
    public static final Target BOX_MONTH= Target.the("BOX MONTH")
            .located(By.cssSelector("#months"));
    public static final Target CAMPO_MONTH = Target.the("CAMPO MONTH")
            .located(By.xpath("//option[normalize-space()='November']"));
    public static final Target BOX_YEAR= Target.the("BOX YEAR")
            .located(By.cssSelector("#years"));
    public static final Target CAMPO_YEAR = Target.the("CAMPO YEAR")
            .located(By.xpath("//option[@value='2005']"));
    public static final Target BOX_COUNTRY= Target.the("BOX COUNTRY")
            .located(By.xpath("//select[@id='country']"));
    public static final Target CAMPO_COUNTRY = Target.the("CAMPO COUNTRY")
            .located(By.xpath("//option[@value='United States']"));
    public static final Target BOTON_NEWSLETTER = Target.the("boton newsletter")
            .located(By.xpath("//input[@id='newsletter']"));

    public static final Target BOTON_OFERTAS_ESPECIALES = Target.the("boton Receive special offers from our partners")
            .located(By.xpath("//input[@id='optin']"));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //// FORMULARIO DATOS USUARIO
    public static final Target CAMPO_NOMBREE = Target.the("campo nombree")
            .located(By.id("first_name"));
    public static final Target CAMPO_APELLIDO = Target.the("campo apellido")
            .located(By.id("last_name"));
    public static final Target CAMPO_COMPANY = Target.the("campo company")
            .located(By.id("company"));
    public static final Target CAMPO_DIRECCION = Target.the("campo direccion")
            .located(By.id("address1"));
    public static final Target CAMPO_COMPLEMENTO_DIRECCION = Target.the("campo direccion complemento")
            .located(By.id("address2"));
    public static final Target CAMPO_ESTADO = Target.the("campo estado")
            .located(By.id("state"));
    public static final Target CAMPO_CITY = Target.the("campo city")
            .located(By.id("city"));
    public static final Target CAMPO_ZIPCODE = Target.the("campo zipcode")
            .located(By.id("zipcode"));
    public static final Target CAMPO_CELULAR = Target.the("campo celular")
            .located(By.id("mobile_number"));

    public static final Target BOTON_CREAR_CUENTA = Target.the("boton Receive special offers from our partners")
            .located(By.xpath("//button[normalize-space()='Create Account']"));


}
