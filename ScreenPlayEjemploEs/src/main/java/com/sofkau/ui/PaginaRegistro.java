package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath("//input[@name='name']"));

    public static final Target BOTON_SUBMIT = Target.the("boton")
            .located(By.xpath("(//button[@type='submit'])[2]"));

    public static final Target CAMPO_CORREO = Target.the("correo usuario")
            .located(By.xpath("(//input[@name='email'])[2]"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("//button[@data-qa='login-button']"));

    public static final Target GENERO = Target.the("Genero")
            .located(By.id("id_gender1"));

    public static final Target PRIMERNOMBRE = Target.the("Primer nombre")
            .located(By.id("first_name"));

    public static final Target APELLIDO = Target.the("APELLIDO")
            .located(By.id("last_name"));
    public static final Target COMPANNIA = Target.the("COMPANNIA")
            .located(By.id("company"));

    public static final Target DIRECCION = Target.the("DIRECCION")
            .located(By.id("address1"));
    public static final Target PAIS = Target.the("PAIS")
            .located(By.id("country"));
    public static final Target NOMBREPAIS = Target.the("NOMBREPAIS")
            .located(By.xpath("//option[@value='India']"));
    public static final Target ESTADO = Target.the("ESTADO")
            .located(By.id("state"));

    public static final Target CIUDAD = Target.the("CIUDAD")
            .located(By.id("city"));


    public static final Target CODIGOZIP = Target.the("CODIGOZIP")
            .located(By.id("zipcode"));

    public static final Target CELULAR = Target.the("CELULAR")
            .located(By.id("mobile_number"));
    public static final Target CONTRASENNA = Target.the("Contraseña")
            .located(By.id("password"));
    public static final Target DIA = Target.the("Dia")
            .located(By.id("days"));
    public static final Target NUMEMRODIA = Target.the("NUMEMRODIA")
            .located(By.xpath("//option[@value='10']"));
    public static final Target MES = Target.the("Mes")
            .located(By.id("months"));
    public static final Target ANNO = Target.the("Anno")
            .located(By.id("years"));
    public static final Target NUMEROANNO = Target.the("NUMEROANNO")
            .located(By.xpath("//option[@value='2003']"));

    public static final Target CREARCUENNTA = Target.the("CREARCUENNTA")
            .located(By.xpath("(//button[@class='btn btn-default'])[1]"));
    public static final Target BOTONCONTINUA = Target.the("BOTONCONTINUA")
            .located(By.xpath("//a[@class='btn btn-primary']"));

    public static final Target PUBLICIDAD = Target.the("PUBLICIDAD")
            .located(By.id("ad_position_box"));
}
