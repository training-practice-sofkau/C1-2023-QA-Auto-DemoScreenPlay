package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompletarRegistro extends PageObject {
    public static final Target CAMPO_PASSWORD=Target.the("Campo password")
            .located(By.id("password"));

    public static final Target COMBOBOX_DAY=Target.the("Combobox dia")
            .located(By.id("days"));

    public static final Target COMBOBOX_MONTH=Target.the("Combobox mes")
            .located(By.id("months"));

    public static final Target COMBOBOX_YEAR=Target.the("Combobox anno")
            .located(By.id("years"));

    public static final Target CAMPO_FIRST_NAME=Target.the("Campo primer nombre")
            .located(By.id("first_name"));

    public static final Target CAMPO_LAST_NAME=Target.the("Campo apellido")
            .located(By.id("last_name"));

    public static final Target CAMPO_DIRECCION1=Target.the("Campo direccion1")
            .located(By.id("address1"));

    public static final Target COMBOBOX_PAIS=Target.the("Combobox pais")
            .located(By.id("country"));

    public static final Target CAMPO_ESTADO=Target.the("Campo estado")
            .located(By.id("state"));

    public static final Target CAMPO_CITY=Target.the("Campo city")
            .located(By.id("city"));

    public static final Target CAMPO_CODE=Target.the("Campo code")
            .located(By.id("zipcode"));

    public static final Target CAMPO_TELEFONO=Target.the("Campo telefono")
            .located(By.id("mobile_number"));

    public static final Target BOTON_CREAR_CUENTA=Target.the("Crear cuenta")
            .located(By.cssSelector("button[data-qa='create-account']"));

    public static final Target CONFIRMAR_REGISTRO=Target.the("Confirmacion del registro")
            .located(By.xpath("//b[normalize-space()='Account Created!']"));

}
