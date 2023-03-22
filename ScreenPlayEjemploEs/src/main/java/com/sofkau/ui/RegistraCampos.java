package com.sofkau.ui;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegistraCampos extends PageObject {




    public static final Target CAMPO_GENERO_HOMBRE = Target.the("Hombre")
            .located(By.xpath("//*[@id='id_gender1']"));



    public static final Target CAMPO_GENERO_MUJER = Target.the("Mujer")
            .located(By.xpath("//*[@id='id_gender2']"));



    //public static final Target CAMPO_USUARIO_NUEVO = Target.the("campo usuario nuevo")
    //      .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_DAYS = Target.the("dia")
            .located(By.xpath("//select[@id='days']"));
    public static final Target CAMPO_MONTHS = Target.the("mes")
            .located(By.xpath("//select[@id='months']"));


    public static final Target CAMPO_YEAR = Target.the("anio")
            .located(By.xpath("//select[@id='years']"));


    public static final Target CAMPO_PASSWORD = Target.the("password")
            .located(By.xpath("//input[@id='password']"));


    public static final Target CAMPO_NEWSTLETTER = Target.the("noticia")
            .located(By.xpath("//input[@id='newsletter']"));


    public static final Target CAMPO_FIRST_NAME = Target.the("primerNombre")
            .located(By.xpath("//input[@id='first_name']"));


    public static final Target CAMPO_LAST_NAME = Target.the("segundoNombre")
            .located(By.xpath("//input[@id='last_name']"));


    public static final Target CAMPO_COMPANY = Target.the("compania")
            .located(By.xpath("//input[@id='company']"));

    public static final Target CAMPO_ADDRESS = Target.the("direccion")
            .located(By.xpath("//input[@id='address1']"));

    public static final Target CAMPO_ADDRESS2 = Target.the("direccion2")
            .located(By.xpath("//input[@id='address2']"));


    public static final Target CAMPO_PAIS = Target.the("pais")
            .located(By.xpath("//select[@id='country']"));


    public static final Target CAMPO_STATE = Target.the("estado")
            .located(By.xpath("//input[@id='state']"));

    public static final Target CAMPO_CITY = Target.the("ciudad")
            .located(By.xpath("//input[@id='city']"));

    public static final Target CAMPO_ZIPCODE = Target.the("zipcode")
            .located(By.xpath("//input[@id='zipcode']"));


    public static final Target CAMPO_MOBILE_NUMBER = Target.the("numeroCeular")
            .located(By.xpath("//input[@id='mobile_number']"));

    public static final Target CAMPO_CREATE_ACCOUNT = Target.the("crearCuenta")
            .located(By.xpath("//button[@data-qa='create-account']"));
}
