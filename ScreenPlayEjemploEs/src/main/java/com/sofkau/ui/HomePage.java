package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target LOGGED_IN_AS = Target.the("Login user name")
            .located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));

    public static final Target SIGNUP_LOGIN_BTTN = Target.the("Go to login and register button")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target MEN_BTTN = Target.the("Open drop-down")
            .located(By.xpath("//a[@href='#Men']"));

    public static final Target JEANS = Target.the("Jeans option for men")
            .located(By.xpath("//a[@href='/category_products/6']"));
}