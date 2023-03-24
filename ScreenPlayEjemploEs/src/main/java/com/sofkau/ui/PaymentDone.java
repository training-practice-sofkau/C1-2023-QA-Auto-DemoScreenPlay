package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentDone extends PageObject {
    public static Target ORDER_TITLE = Target.the("Order placed title")
            .located(By.xpath("//h2[@data-qa='order-placed']"));

    public static Target DELETE_ACCOUNT = Target.the("Delete account link")
            .located(By.xpath("//a[@href='/delete_account']"));
}