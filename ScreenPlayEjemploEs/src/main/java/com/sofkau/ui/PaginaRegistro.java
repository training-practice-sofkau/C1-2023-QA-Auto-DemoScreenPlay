package com.sofkau.ui;

import io.cucumber.core.backend.Located;
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

    public static final Target CAMP_CREAR_USUARIO_NOMBRE = Target.the("Campo crear usuario nombre")
            .located(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[2]"));


    public static final Target CAMPO_EMAIL_CREAR_USUARIO = Target.the("Campo crear usuario email")
            .located(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]"));

    public static final Target BOTON_INSCRIBIRSE = Target.the("Botón inscribirse")
            .located(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));

    public static final Target BOTON_GENERO = Target.the("Genero")
            .located(By.xpath("//*[@id=\"id_gender1\"]"));

    public static final Target CAMPO_FORMULARIO_NOMBRE = Target.the("Campo formulario")
            .located(By.xpath("//*[@id='name']"));

    public static final Target CAMPO_FORMULARIO_PASSWORD = Target.the("Campo password")
            .located(By.xpath("//*[@id=\"password\"]"));

    public static final Target CAMPO_FORMULARIO_DATEOFBIRT_DIA= Target.the("Campo dia")
            .located(By.xpath("//*[@id=\"days\"]"));
    public static final Target CAMPO_FORMULARIO_DATEOFBIRT_MES= Target.the("Campo dia")
            .located(By.xpath("//*[@id=\"months\"]"));
    public static final Target CAMPO_FORMULARIO_DATEOFBIRT_ANIO= Target.the("Campo dia")
            .located(By.xpath("//*[@id=\"years\"]"));
    public static final Target CAMPO_FORMULARIO_FIRST_NAME= Target.the("Campo first_name ")
            .located(By.xpath("//*[@id=\"first_name\"]"));
    public static final Target CAMPO_FORMULARIO_LAST_NAME= Target.the("Campo last_name ")
            .located(By.xpath("//*[@id=\"last_name\"]"));
    public static final Target CAMPO_FORMULARIO_DIRECCION= Target.the("Campo direccion ")
            .located(By.xpath("//*[@id=\"address1\"]"));

    public static final Target CAMPO_FORMULARIO_PAIS= Target.the("Campo pais ")
            .located(By.xpath("//*[@id=\"country\"]/option[4]"));
    public static final Target CAMPO_FORMULARIO_ESTADO= Target.the("Campo estado")
            .located(By.xpath("//*[@id=\"state\"]"));
    public static final Target CAMPO_FORMULARIO_CIUDAD= Target.the("Campo ciudad")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target CAMPO_FORMULARIO_CODIGO_POSTAL= Target.the("Campo codigo postal")
            .located(By.xpath("//*[@id=\"zipcode\"]"));
    public static final Target CAMPO_FORMULARIO_NUM_TELEFONO= Target.the("Campo numero telefono")
            .located(By.xpath("//*[@id=\"mobile_number\"]"));
    public static final Target BOTON_CREAR_CUENTA= Target.the("boton crear cuenta")
            .located(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));










//*[@id="country"]





}
