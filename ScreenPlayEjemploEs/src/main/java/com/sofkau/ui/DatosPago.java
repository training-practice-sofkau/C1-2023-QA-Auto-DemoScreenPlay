package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPago extends PageObject {
    public static final Target NAMECARD = Target.the("NAMECARD")
            .located(By.xpath("//input[@name='name_on_card']"));
    public static final Target NUMBERCARD = Target.the("NUMBERCARD")
            .located(By.xpath("//input[@name='card_number']"));
    public static final Target CVC = Target.the("CVC")
            .located(By.xpath("//input[@name='cvc']"));
    public static final Target EXPIRATION = Target.the("EXPIRATION")
            .located(By.xpath("//input[@name='expiry_month']"));
    public static final Target EXPIRATIONYEAR = Target.the("EXPIRATIONYEAR")
            .located(By.xpath("//input[@name='expiry_year']"));
    public static final Target SUBMITPAY = Target.the("SUBMITPAY")
            .located(By.id("submit"));
}
