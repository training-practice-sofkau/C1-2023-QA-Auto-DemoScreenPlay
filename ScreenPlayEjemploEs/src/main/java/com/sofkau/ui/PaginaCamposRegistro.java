package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarCamposRegistro {

    public static final Target CAMPO_PASSWORD = Target.the("campo password")
            .located(By.xpath("//input[@id='password']"));

    public static final Target CAMPO_DAY = Target.the("campo day")
            .located(By.xpath("//select[@id='days']"));

    public static final Target CAMPO_MONTH = Target.the("campo month")
            .located(By.xpath("//select[@id='months']"));

    public static final Target CAMPO_YEAR = Target.the("campo year")
            .located(By.xpath("//select[@id='years']"));

    public static final Target CAMPO_FIRST_NAME = Target.the("campo first name")
            .located(By.xpath("//input[@id='first_name']"));

    public static final Target CAMPO_LAST_NAME = Target.the("campo last name")
            .located(By.xpath("//input[@id='last_name']"));

    public static final Target CAMPO_ADDRESS1 = Target.the("campo address1")
            .located(By.xpath("//input[@id='address1']"));

    public static final Target CAMPO_COUNTRY = Target.the("campo country")
            .located(By.xpath("//select[@id='country']"));

    public static final Target CAMPO_STATE = Target.the("campo state")
            .located(By.xpath("//input[@id='state']"));

    public static final Target CAMPO_CITY = Target.the("campo city")
            .located(By.xpath("//input[@id='city']"));

    public static final Target CAMPO_ZIPCODE = Target.the("campo zipcode")
            .located(By.xpath("//input[@id='zipcode']"));









}
