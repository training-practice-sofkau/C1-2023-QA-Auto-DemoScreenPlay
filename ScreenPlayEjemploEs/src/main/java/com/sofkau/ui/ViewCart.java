package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewCart extends PageObject {
    public static Target TO_CHECKOUT_BTTN = Target.the("Proceed to checkout button")
            .located(By.xpath("//a[@class='btn btn-default check_out']"));
}