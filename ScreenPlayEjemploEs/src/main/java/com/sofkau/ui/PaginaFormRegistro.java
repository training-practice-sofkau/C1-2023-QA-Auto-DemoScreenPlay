package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaFormRegistro extends PageObject {

    public static final Target BOTON_MALE = Target.the("boton gender male")
            .located(By.xpath("//input[@id='id_gender1']"));
    public static final Target BOTON_FEMALE = Target.the("boton gender female")
            .located(By.xpath("//input[@id='id_gender2']"));
    public static final Target PASSWORD= Target.the("campo password")
            .located(By.xpath("//input[@id='password']"));
    public static final Target DAY= Target.the("campo day")
            .located(By.xpath("//select[@id='days']"));
    public static final Target MONTH= Target.the("campo month")
            .located(By.xpath("//select[@id='months']"));
    public static final Target YEAR= Target.the("campo year")
            .located(By.xpath("//select[@id='years']"));
    public static final Target FIRST_NAME= Target.the("campo first name")
            .located(By.xpath("//input[@id='first_name']"));
    public static final Target LAST_NAME = Target.the("campo last name")
            .located(By.xpath("//input[@id='last_name']"));
    public static final Target COMPANY = Target.the("campo company")
            .located(By.xpath("//input[@id='company']"));
    public static final Target ADDRESS = Target.the("campo address")
            .located(By.xpath("//input[@id='address1']"));
    public static final Target ADDRESS2 = Target.the("campo address2")
            .located(By.xpath("(//input[@id='address2'])[1]"));
    public static final Target COUNTRY = Target.the("Campo pais")
            .located(By.xpath("//select[@data-qa='country']"));
    public static final Target STATE = Target.the("campo state")
            .located(By.xpath("//input[@id='state']"));
    public static final Target CITY = Target.the("campo city")
            .located(By.xpath("//input[@id='city']"));
    public static final Target ZIPCODE = Target.the("campo zipcode")
            .located(By.xpath("//input[@id='zipcode']"));
    public static final Target MOBILE = Target.the("campo mobile")
            .located(By.xpath("//input[@id='mobile_number']"));
    public static final Target BUTTON_CREATE_ACOUNT = Target.the("campo mobile")
            .located(By.xpath("//button[normalize-space()='Create Account']"));

}
