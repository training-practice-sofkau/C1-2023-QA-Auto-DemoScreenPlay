package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target CAMPO_NOMBRE = Target.the("campo nombre")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_CORREO = Target.the("campo correo")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_REGISTRARSE = Target.the("Botón registrarse")
            .located(By.xpath("//button[@data-qa='signup-button']"));

    public static final Target TITULO = Target.the("Título")
            .located(By.id("id_gender1"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='password']"));

    public static final Target DIA = Target.the("dropdownlist dia")
            .located(By.id("uniform-days"));

    public static final Target MES = Target.the("dropdownlist mes")
            .located(By.id("uniform-months"));

    public static final Target ANNO = Target.the("dropdownlist año")
            .located(By.id("uniform-years"));

    public static final Target PRIMER_NOMBRE = Target.the("campo primer nombre")
            .located(By.id("first_name"));

    public static final Target APELLIDO = Target.the("campo apellido")
            .located(By.id("last_name"));

    public static final Target COMPANNIA = Target.the("campo compañia")
            .located(By.id("company"));

    public static final Target DIRECCION = Target.the("campo dirección")
            .located(By.id("address1"));

    public static final Target PAIS = Target.the("campo pais")
            .located(By.id("country"));

    public static final Target ESTADO = Target.the("campo estado")
            .located(By.id("state"));

    public static final Target CIUDAD = Target.the("campo ciudad")
            .located(By.id("city"));

    public static final Target CODIGO_POSTAL = Target.the("codigo postal")
            .located(By.id("zipcode"));

    public static final Target NUMERO_TELEFONICO = Target.the("numero telefonico")
            .located(By.id("mobile_number"));

    public static final Target BOTON_CREAR_CUENTA = Target.the("Botón crear cuenta")
            .located(By.xpath("//button[@data-qa='create-account']"));



}
