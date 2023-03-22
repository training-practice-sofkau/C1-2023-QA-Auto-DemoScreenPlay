package com.sofkau.ui;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoEscogido extends PageObject {

    public static Target ADD_TO_CART = Target.the("Boton agregar al carrito")
            .located(By.xpath("//button[@class='btn btn-default cart']"));

    public static Target BUTTON_VIEW_CART = Target.the("Boton ver el carrito")
            .located(By.xpath("(//a[@href='/view_cart'])[2]"));

}
