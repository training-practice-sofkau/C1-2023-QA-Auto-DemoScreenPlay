package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRedireccionamientoRegistroCompleto {

    public static final Target CAMPO_REGISTRO_PASSWORD = Target.the("Campo registro password"  )
            .located(By.id("password"));

    public static final Target SELECCION_GENERO = Target.the("Seleccionable de genero"  )
            .located(By.id("  id_gender1"));


    public static final Target DESPLEGABLE_DIA = Target.the("Desplegable dia"  )
            .located(By.id("days"));

    public static final Target DESPLEGABLE_MES = Target.the("Desplegable mes"  )
            .located(By.id("months"));

    public  static final Target DESPLEGABLE_ANIO = Target.the("Desplegable año"  )
            .located(By.id("years"));

    public  static final Target CAMPO_APELLIDO = Target.the("Campo apellido"  )
            .located(By.id("first_name"));


    public static final Target CAMPO_SEGUNDO_APELLIDO = Target.the("Campo segundo apellido"  )
            .located(By.id("last_name"));


    public static final Target CAMPO_STATE = Target.the("Campo estado"  )
            .located(By.id("state"));

    public static final Target CAMPO_CITY = Target.the("Campo ciudad"  )
            .located(By.id("city"));

    public static final Target CAMPO_ZIP_CODE = Target.the("Campo ZipCode"  )
            .located(By.id("zipcode"));

    public static final Target CAMPO_NUMERO_CELULAR = Target.the("Campo numero celular"  )
            .located(By.id("mobile_number"));

    public static final Target BOTON_CREATE_ACCOUNT = Target.the("Boton create account"  )
            .located(By.id("//button[normalize-space()='Create Account']"));
     }
