package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Checkout extends PageObject {
    public static Target COMMENT = Target.the("Comment area")
            .located(By.xpath("//textarea"));

    public static Target TO_PAYMENT = Target.the("Place order button")
            .located(By.xpath("//a[@href='/payment']"));
}