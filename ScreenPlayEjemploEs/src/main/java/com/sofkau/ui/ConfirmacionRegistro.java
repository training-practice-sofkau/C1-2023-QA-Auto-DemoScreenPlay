package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));

    public static Target MENSAJE_REGISTRO = Target.the("mensaje usuario registrado")
            .located(By.xpath("//div[contains(@class,'col-sm-9')]//h2[contains(@class,'text-center')]"));

    public static Target MENSAJE_COMPRA = Target.the("mensaje compra satisfactoria")
            .located(By.xpath("//h2[@data-qa='order-placed']"));
}