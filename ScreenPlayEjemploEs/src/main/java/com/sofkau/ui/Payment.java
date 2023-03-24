package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Payment extends PageObject {
    public static Target NAME_C = Target.the("Name on credit card")
            .located(By.xpath("//input[@data-qa='name-on-card']"));

    public static Target C_NUMBER = Target.the("Credit card number")
            .located(By.xpath("//input[@data-qa='card-number']"));

    public static Target CVC = Target.the("CVC of the card")
            .located(By.xpath("//input[@data-qa='expiry-month']"));

    public static Target E_MONTH = Target.the("Expiration month of the card")
            .located(By.xpath("//input[@data-qa='expiry-month']"));

    public static Target E_YEAR = Target.the("Expiration year of the card")
            .located(By.xpath("//input[@data-qa='expiry-year']"));

    public static Target PAY_BTTN = Target.the("Pay and confirm order button")
            .located(By.xpath("//button[@data-qa='pay-button']"));
}