package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CrearUsuario extends PageObject {

    public static final Target CAMPO_NOMBRE_USUARIO = Target.the("campo nombre usuario")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_CORREO = Target.the("campo correo")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_REGISTRO_USUARIO = Target.the("boton registro")
            .located(By.xpath("//button[@data-qa='signup-button']"));

    public static final Target RADIO_GENERO = Target.the("radio genero")
            .located(By.id("id_gender2"));

    public static final Target CAMPO_CONTRASENNA = Target.the("radio genero")
            .located(By.id("password"));

    public static final Target SELECT_DIA = Target.the("seleccionar dia")
            .located(By.id("days"));

    public static final Target SELECT_MES = Target.the("seleccionar mes")
            .located(By.id("months"));

    public static final Target SELECT_ANIO = Target.the("seleccionar anio")
            .located(By.id("years"));

    public static final Target CAMPO_NOMBRE = Target.the("campo nombre")
            .located(By.id("first_name"));

    public static final Target CAMPO_APELLIDO = Target.the("campo apellido")
            .located(By.id("last_name"));

    public static final Target CAMPO_EMPRESA = Target.the("campo empresa")
            .located(By.id("company"));

    public static final Target CAMPO_DIRECCION1 = Target.the("campo direccion1")
            .located(By.id("address1"));

    public static final Target CAMPO_DIRECCION2 = Target.the("campo direccion2")
            .located(By.id("address2"));

    public static final Target CAMPO_PAIS = Target.the("campo pais")
            .located(By.id("country"));

    public static final Target CAMPO_ESTADO = Target.the("campo estado")
            .located(By.id("state"));

    public static final Target CAMPO_CIUDAD = Target.the("campo ciudad")
            .located(By.id("city"));

    public static final Target CAMPO_CODIGO_POSTAL = Target.the("campo codigo postal")
            .located(By.id("zipcode"));

    public static final Target CAMPO_NUMERO_TELEFONO = Target.the("campo numero telefono")
            .located(By.id("mobile_number"));

    public static final Target BOTON_CREATE_CUENTA = Target.the("boton crear cuenta")
            .located(By.xpath("//button[@data-qa='create-account']"));
}
