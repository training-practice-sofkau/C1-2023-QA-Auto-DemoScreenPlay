package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCompra {

    public static final Target OPTION_WOMEN = Target.the("Opcion women")
            .located(By.xpath("//a[@href='#Women']"));

    public static final Target OPTION_SAREE = Target.the("Opcion Saree")
            .located(By.xpath("//a[normalize-space()='Saree']"));

    public static final Target VIEW_PRODUCT = Target.the("Opcion view product")
            .located(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]"));

    public static final Target ADD_TO_CART = Target.the("Opcion add to cart")
            .located(By.xpath("//button[normalize-space()='Add to cart']"));

    public static final Target VIEW_CART = Target.the("Opcion view cart")
            .located(By.xpath("//u[normalize-space()='View Cart']"));

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Opcion Proceed to chekout")
            .located(By.xpath("//a[normalize-space()='Proceed To Checkout']"));


    public static final Target PLACE_ORDER = Target.the("Campo place order")
            .located(By.xpath("//a[normalize-space()='Place Order']"));

    public static final Target NAME_OR_CARD = Target.the("Campo Name or Card")
            .located(By.xpath("//input[@name='name_on_card']"));

    public static final Target CARD_NUMBER = Target.the("Campo Card Number")
            .located(By.xpath("//input[@name='card_number']"));

    public static final Target CVC = Target.the("Campo CVC")
            .located(By.xpath("//input[@placeholder='ex. 311']"));

    public static final Target EXPIRATION = Target.the("Campo Expiration")
            .located(By.xpath("//input[@placeholder='MM']"));

    public static final Target YEAR = Target.the("Campo Year")
            .located(By.xpath("//input[@placeholder='YYYY']"));

    public static final Target BOTON_SUBMIT = Target.the("Boton Submit")
            .located(By.xpath("//button[@id='submit']"));

    public static final Target ORDER_PLACED = Target.the("Mensaje recibido")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));







}
