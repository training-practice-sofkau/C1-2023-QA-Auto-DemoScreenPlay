package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountCreated extends PageObject {
    public static final Target TITLE = Target.the("Account created title")
            .located(By.xpath("//h2[@data-qa='account-created']"));
}