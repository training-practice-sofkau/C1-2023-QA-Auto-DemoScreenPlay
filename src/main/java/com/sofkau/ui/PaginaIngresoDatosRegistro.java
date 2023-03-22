package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaIngresoDatosRegistro extends PageObject {
    //////////////////LOCALIZADORES PARA EL REGISTRO/////////////////


    public static final Target CAMPO_NAME = Target.the("Campo name")
            .located(By.xpath("//input[@placeholder='Name']"));

    public static final Target CAMPO_EMAIL = Target.the("Campo email")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_SIGNUP = Target.the("Boton registro")
            .located(By.xpath("//button[normalize-space()='Signup']"));

    public static final Target CHECK_GENERO = Target.the("Campo genero")
            .located(By.xpath("//input[@id='id_gender2']"));

    public static final Target CAMPO_NOMBRE_REGISTRO = Target.the("Campo nombre-registro")
            .located(By.xpath("//input[@id='name']"));

    public static final Target CAMPO_EMAIL_REGISTRO = Target.the("Campo email-registro")
            .located(By.xpath("//input[@id='email']"));

    public static final Target CAMPO_CONTRASENNA_REGISTRO = Target.the("Campo contrasenna-registro")
            .located(By.id("password"));

    public static final Target CAMPO_DIA = Target.the("Campo dia")
            .located(By.xpath("//select[@id='days']"));
    public static final Target CAMPO_DIA_6 = Target.the("Campo dia6")
            .located(By.xpath("//option[normalize-space()='6']"));

    public static final Target CAMPO_MES = Target.the("Campo mes")
            .located(By.xpath("//select[@id='months']"));
    public static final Target CAMPO_MES_9 = Target.the("Campo mes9")
            .located(By.xpath("//option[normalize-space()='September']"));

    public static final Target CAMPO_ANNO = Target.the("Campo anno")
            .located(By.xpath("//select[@id='years']"));
    public static final Target CAMPO_ANNO_2002 = Target.the("Campo anno2002")
            .located(By.xpath("//option[@value='2002']"));

    public static final Target CAMPO_NEWSLETTER = Target.the("Campo suscripcion")
            .located(By.xpath("//input[@id='newsletter']"));

    public static final Target CAMPO_OFFERS = Target.the("Campo ofertas")
            .located(By.xpath("//input[@id='optin']"));

    public static final Target CAMPO_NAME_ADDRESS = Target.the("Campo nombre direccion")
            .located(By.xpath("//input[@id='first_name']"));

    public static final Target CAMPO_LASTNAME_ADDRESS = Target.the("Campo apellido direccion")
            .located(By.xpath("//input[@id='last_name']"));

    public static final Target CAMPO_COMPANNIA = Target.the("Campo compannia")
            .located(By.xpath("//input[@id='company']"));

    public static final Target CAMPO_ADDRESS1 = Target.the("Campo direccion 1")
            .located(By.xpath("//input[@id='address1']"));

    public static final Target CAMPO_ADDRESS2 = Target.the("Campo direccion 2")
            .located(By.xpath("//input[@id='address2']"));

    public static final Target CAMPO_COUNTRY = Target.the("Campo pais")
            .located(By.xpath("//select[@id='country']"));
    public static final Target CAMPO_COUNTRY_NEW_ZEALAND = Target.the("Campo pais nueva zelanda")
            .located(By.xpath("//option[@value='New Zealand']"));

    public static final Target CAMPO_STATE = Target.the("Campo estado")
            .located(By.xpath("//input[@id='state']"));

    public static final Target CAMPO_CITY = Target.the("Campo ciudad")
            .located(By.xpath("//input[@id='city']"));


    public static final Target CAMPO_ZIPCODE = Target.the("Campo zipcode")
            .located(By.xpath("//input[@id='zipcode']"));

    public static final Target CAMPO_MOBILENUMBER = Target.the("Campo numero de telefono")
            .located(By.xpath("//input[@id='mobile_number']"));

    public static final Target BOTON_CREATE_ACCOUNT = Target.the("Campo crear cuenta")
            .located(By.xpath("//button[normalize-space()='Create Account']"));
    public static final Target BOTON_CONTINUE = Target.the("boton continuar")
            .located(By.xpath("//a[normalize-space()='Continue']"));



}
