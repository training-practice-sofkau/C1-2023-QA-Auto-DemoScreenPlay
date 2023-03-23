package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormularioRegistro {
    public static final Target CAMPO_CONTRASENA = Target.the("Campo password")
            .located(By.id("password"));
    public static final Target CAJA_DIA_NACIMIENTO = Target.the("Combobox dia")
            .located(By.id("days"));
    public static final Target CAJA_MES_NACIMIENTO = Target.the("Combobox mes")
            .located(By.id("months"));
    public static final Target CAJA_ANNO_NACIMIENTO = Target.the("Combobox anno")
            .located(By.id("years"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo primer nombre")
            .located(By.id("first_name"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo apellido")
            .located(By.id("last_name"));
    public static final Target CAMPO_DIRECCION_1 = Target.the("Campo direccion_1")
            .located(By.id("address1"));
    public static final Target CAJA_PAIS = Target.the("Combobox pais")
            .located(By.id("country"));
    public static final Target CAMPO_ESTADO = Target.the("Campo estado")
            .located(By.id("state"));
    public static final Target CAMPO_CIUDAD = Target.the("Campo city")
            .located(By.id("city"));
    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Campo code")
            .located(By.id("zipcode"));
    public static final Target CAMPO_TELEFONO = Target.the("Campo telefono")
            .located(By.id("mobile_number"));
    public static final Target BOTON_CREAR_CUENTA = Target.the("Crear cuenta")
            .located(By.cssSelector("button[data-qa='create-account']"));
    public static final Target REGISTRO_FINALIZADO = Target.the("Registro finalizado")
            .located(By.cssSelector(".title"));
}

