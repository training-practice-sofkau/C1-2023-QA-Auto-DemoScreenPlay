package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriaCompra extends PageObject {

    public static final Target OPCION_CATEGORIA_MUJER = Target.the("categoria mujer")
            .located(By.xpath("(//div[@class='panel-heading']//h4[@class='panel-title'])[1]"));

    public static final Target OPCION_TOPS = Target.the("opcion tops")
            .located(By.xpath("//div[@id='Women']//a[normalize-space()='Dress']"));

    public static final Target BOTON_REALIZAR_PAGO = Target.the("boton pago")
            .located(By.xpath("//section[@id='do_action']//div[@class='col-sm-6']//a[contains(@class,'check_out')]"));

    public static final Target BOTON_REALIZAR_PEDIDO = Target.the("boton pedido")
            .located(By.xpath("//div[@class='container']//a[contains(@class,'check_out')]"));

    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("campo nombre tarjeta")
            .located(By.className("name_on_card"));

    public static final Target CAMPO_NUMERO_TARJETA = Target.the("campo numero tarjeta")
            .located(By.className("card-number"));

    public static final Target CAMPO_CVC = Target.the("campo CVC")
            .located(By.xpath("//input[@data-qa='cvc']"));

    public static final Target CAMPO_EXPIRACION_MES = Target.the("campo expiracion mes")
            .located(By.xpath("//input[@data-qa='expiry-month']"));

    public static final Target CAMPO_EXPIRACION_ANIO = Target.the("campo expiracion anio")
            .located(By.xpath("//input[@data-qa='expiry-year']"));

    public static final Target BOTON_ = Target.the("boton ")
            .located(By.xpath("//button[@data-qa='pay-button']"));
}
