package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenJeans extends PageObject {
    public static Target ADD_CHEAP = Target.the("Add to cart button for cheap jean")
            .located(By.xpath("//div[@class='productinfo text-center']/child::a[@data-product-id='33']"));

    public static Target VIEW_CART = Target.the("View cart link")
            .located(By.xpath("//p[@class='text-center']/child::a[@href='/view_cart']"));
}