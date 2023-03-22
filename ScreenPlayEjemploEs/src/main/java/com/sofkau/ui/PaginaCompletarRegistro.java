package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.servlet.annotation.ServletSecurity;

public class PaginaCompletarRegistro {

    public static final Target SELECT_MALE = Target.the("Selector genero masculino")
            .located(By.id("id_gender1"));
    public static final Target PASSWORD = Target.the("Campo contrasenna registro")
            .located(By.id("password"));
    public static final Target SELECT_DAY = Target.the("Desplegables para dia de nacimiento")
            .located(By.id("days"));
    public static final Target SELECT_MONTH = Target.the("Desplegable para mes de nacimiento")
            .located(By.id("months"));
    public static final Target SELECT_YEAR = Target.the("Año Seleccionado")
            .located(By.id("years"));
    public static final Target FIRST_NAME = Target.the("Campo Primer nombre")
            .located(By.id("first_name"));
    public static final Target LAST_NAME = Target.the("Campo segundo nombre")
            .located(By.id("last_name"));
    public static final Target ADDRESS = Target.the("Primera direccion")
            .located(By.id("address1"));
    public static final Target SELECT_COUNTRY = Target.the("Selector de ciudad")
            .located(By.id("country"));
    public static final Target SELECTED_COUNTRY = Target.the("Pais seleccionada")
            .located(By.xpath("//option[@value='United States']"));
    public static final Target STATE = Target.the("Campo de estado")
            .located(By.id("state"));
    public static final Target CITY = Target.the("Campo de ciudad")
            .located(By.id("city"));
    public static final Target ZIPCODE = Target.the("Campo de Zip Code")
            .located(By.id("zipcode"));
    public static final Target PHONENUMBER = Target.the("Campo de Numero")
            .located(By.id("mobile_number"));

}
