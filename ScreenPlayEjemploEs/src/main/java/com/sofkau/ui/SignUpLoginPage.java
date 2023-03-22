package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignUpLoginPage extends PageObject {
    public static final Target USER_FIELD = Target.the("User email field")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target LOGIN_BTTN = Target.the("Login button")
            .located(By.xpath("//button[@data-qa='login-button']"));

    public static final Target USER_NAME_FIELD = Target.the("User name field")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target USER_EMAIL_FIELD = Target.the("User email for signup field")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target SIGNUP_BTTN = Target.the("Signup button")
            .located(By.xpath("//button[@data-qa='signup-button']"));
}