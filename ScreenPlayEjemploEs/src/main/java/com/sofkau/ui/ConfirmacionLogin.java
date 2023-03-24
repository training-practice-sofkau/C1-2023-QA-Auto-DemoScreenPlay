package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionLogin extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));

    public static Target MENS_CATEGORY = Target.the("Categoria hombre")
            .located(By.xpath("//a[@href='#Men']"));

    public static Target TSHIRT_CATEGORY = Target.the("Categoria tshirt")
            .located(By.xpath("//a[@href='/category_products/3']"));

}
