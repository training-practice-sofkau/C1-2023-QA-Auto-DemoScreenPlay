package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target BOTON_MEN = Target.the("Boton productos hombre")
            .located(By.xpath("//a[@href='#Men']"));

   public static final Target BOTON_TSHIRT = Target.the("Camisetas")
           .located(By.xpath("//*[@href='/category_products/3']"));
}
