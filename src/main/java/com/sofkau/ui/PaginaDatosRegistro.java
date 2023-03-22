package com.sofkau.ui;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDatosRegistro extends PageObject {
    public static final Target TITULO_GENERO_MASCULINO = Target.the("Titulo genero masculino")
            .located(By.xpath("(//input[@id='id_gender1'])[1]"));

    public static final Target CAMPO_CONTRASENNA1 = Target.the("campo contrasena")
            .located(By.xpath("(//input[@id='password'])[1]"));

    public static final Target MENU_DESPEGABLE_DIA = Target.the("Menu desplegable día")
            .located(By.xpath("(//select[@id='days'])[1]"));

    public static final Target MENU_DESPEGABLE_MES = Target.the("Menu desplegable mes")
            .located(By.xpath("(//select[@id='months'])[1]"));

    public static final Target MENU_DESPEGABLE_ANIO = Target.the("Menu desplegable año")
            .located(By.xpath("(//select[@id='years'])[1]"));

    public static final Target CAMPO_NOMBRE_PRIMERO = Target.the("campo primer nombre")
            .located(By.xpath("(//input[@id='first_name'])[1]"));

    public static final Target CAMPO_NOMBRE_APELLIDO = Target.the("campo apellido")
            .located(By.xpath("(//input[@id='last_name'])[1]"));

    public static final Target CAMPO_COMPANIA = Target.the("campo compania")
            .located(By.xpath("(//input[@id='company'])[1]"));

    public static final Target CAMPO_DIRECCION = Target.the("campo direccion")
            .located(By.xpath("(//input[@id='address1'])[1]"));

    public static final Target MENU_DESPEGABLE_PAIS = Target.the("Menu desplegable pais")
            .located(By.xpath("(//select[@id='country'])[1]"));

    public static final Target CAMPO_ESTADO_PROVINCIA = Target.the("campo estado provincia")
            .located(By.xpath("(//input[@id='state'])[1]"));

    public static final Target CAMPO_CIUDAD = Target.the("campo ciudad")
            .located(By.xpath("(//input[@id='city'])[1]"));

    public static final Target CAMPO_CODIGO_POSTAL = Target.the("campo codigo postal")
            .located(By.xpath("(//input[@id='zipcode'])[1]"));

    public static final Target CAMPO_NUMERO_MOVIL = Target.the("campo numero movil")
            .located(By.xpath("(//input[@id='mobile_number'])[1]"));

    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton crear cuenta")
            .located(By.xpath("(//button[@data-qa='create-account'])[1]"));
    public static final Target BOTON_CONTINUE = Target.the("Boton crear cuenta")
            .located(By.xpath("(//a[@data-qa='continue-button'])[1]"));



}

