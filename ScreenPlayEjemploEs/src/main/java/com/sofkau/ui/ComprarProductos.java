package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarProductos extends PageObject {
    public static final Target PRODUCTOS = Target.the("PRODUCTOS")
            .located(By.xpath("//a[@href='/products']"));
    public static final Target WOMEN = Target.the("WOMEN")
            .located(By.xpath("//a[@href='#Women']"));
    public static final Target DRESS = Target.the("DRESS")
            .located(By.xpath("//a[@href='/category_products/1']"));
    public static final Target PRODUCTO1 = Target.the("PRODUCTO1")
            .located(By.xpath("//a[@href='/product_details/3']"));
    public static final Target PRODUCTO2 = Target.the("PRODUCTO1")
            .located(By.xpath("//a[@href='/product_details/4']"));
    public static final Target PRODUCTO3 = Target.the("PRODUCTO1")
            .located(By.xpath("//a[@href='/product_details/38']"));
    public static final Target ADDPRODUCTO1 = Target.the("ADDPRODUCTO1")
            .located(By.xpath("//button[@class='btn btn-default cart']"));
    public static final Target CONTINUESHOPPING = Target.the("CONTINUESHOPPING")
            .located(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
    public static final Target CHECKOUT = Target.the("CHECKOUT")
            .located(By.xpath("//a[@class='btn btn-default check_out']"));

    public static final Target CAR = Target.the("CAR")
            .located(By.xpath("//a[@href='/view_cart']"));
    public static final Target BUTTOMPAYMENT= Target.the("BUTTOMPAYMENT")
            .located(By.xpath("//a[@href='/payment']"));





}
