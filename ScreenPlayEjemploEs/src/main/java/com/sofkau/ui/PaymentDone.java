package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentDone extends PageObject {
    public static Target E_YEAR = Target.the("Expiration year of the card")
            .located(By.xpath("//h2[@data-qa='order-placed']"));

    public static Target DELETE_ACCOUNT = Target.the("Delete account link")
            .located(By.xpath("//a[@href='/delete_account']"));
}