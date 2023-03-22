package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    //public static String producto="%s";

    public static final Target COMPRAR_PRODUCTO = Target.the("Comprar producto")
            .located(By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));

    public static final Target ANIADIR_PRODUCTO1= Target.the("Comprar primer producto")
            .located(By.cssSelector("a[href='/product_details/1']"));

    public static final Target AGREGAR_AL_CARRO=Target.the("Agregar producto1")
            .located(By.cssSelector("button[type='button']"));
    public static final Target CONTINUAR_COMPRANDO=Target.the("Continuar comprando")
            .located(By.cssSelector(".btn.btn-success.close-modal.btn-block"));

    public static final Target VOLVER_PAGINA_PRINCIPAL=Target.the("Volver a comprar productos")
            .located(By.cssSelector("a[href='/products']"));

}
