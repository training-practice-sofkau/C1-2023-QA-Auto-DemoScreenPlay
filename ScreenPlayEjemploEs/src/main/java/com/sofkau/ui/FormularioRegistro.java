package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRegistro extends PageObject {
    public static final Target GENERO = Target.the("campo genero")
            .located(By.id("id_gender1"));

    public static final Target PASSWORD = Target.the("campo password")
            .located(By.id("password"));

    public static final Target NOMBRE = Target.the("campo nombre")
            .located(By.id("first_name"));

    public static final Target APELLIDO = Target.the("campo apellido")
            .located(By.id("last_name"));

    public static final Target DIRECCION = Target.the("campo direccion")
            .located(By.id("address1"));

    public static final Target PAIS = Target.the("campo pais")
            .located(By.id("country"));

    public static final Target ELEGIR_PAIS = Target.the("elegir pais")
            .located(By.xpath("//option[@value='Canada']"));

    public static final Target ESTADO = Target.the("campo estado")
            .located(By.id("state"));

    public static final Target CIUDAD = Target.the("campo ciudad")
            .located(By.id("city"));

    public static final Target CODIGO_POSTAL = Target.the("campo codigoPostal")
            .located(By.id("zipcode"));

    public static final Target CELULAR = Target.the("campo celular")
            .located(By.id("mobile_number"));

    public static final Target REGISTRAR = Target.the("boton registrar")
            .located(By.xpath("//*[@data-qa='create-account']"));
}
