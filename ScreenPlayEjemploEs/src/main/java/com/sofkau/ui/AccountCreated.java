package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountCreated extends PageObject {
    public static final Target TITLE = Target.the("Account created title")
            .located(By.xpath("//h2[@data-qa='account-created']"));
}