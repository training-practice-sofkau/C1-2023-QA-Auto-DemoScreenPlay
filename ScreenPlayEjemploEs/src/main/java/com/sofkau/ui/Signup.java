package com.sofkau.ui;

import com.sofkau.models.User;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Signup extends PageObject {
    private static final User user = User.getInstance();

    public static final Target TITLE = Target.the("Male title")
            .located(By.xpath(String.format("//input[@id='id_gender%s']", user.getTitle())));

    public static final Target NAME = Target.the("Account name")
            .located(By.xpath("//input[@data-qa='name']"));

    public static final Target PASSWORD = Target.the("Account password")
            .located(By.xpath("//input[@data-qa='password']"));

    public static final Target DAY = Target.the("Day of birth")
            .located(By.xpath("//select[@data-qa='days']"));

    public static final Target E_DAY = Target.the("User day of birth")
            .located(By.xpath(String.format("//select[@data-qa='days']/child::option[@value='%s']", user.getBirthDay())));

    public static final Target MONTH = Target.the("Month of birth")
            .located(By.xpath("//select[@data-qa='months']"));

    public static final Target E_MONTH = Target.the("User month of birth")
            .located(By.xpath(String.format("//select[@data-qa='months']/child::option[@value='%s']", user.getMonthDay())));

    public static final Target YEAR = Target.the("Year of birth")
            .located(By.xpath("//select[@data-qa='years']"));

    public static final Target E_YEAR = Target.the("User year of birth")
            .located(By.xpath(String.format("//select[@data-qa='years']/child::option[@value='%s']", user.getYearDay())));

    public static final Target FIRST_NAME = Target.the("User first name")
            .located(By.xpath("//input[@data-qa='first_name']"));

    public static final Target LAST_NAME = Target.the("User last name")
            .located(By.xpath("//input[@data-qa='last_name']"));

    public static final Target COMPANY = Target.the("Account company")
            .located(By.xpath("//input[@data-qa='company']"));

    public static final Target ADDRESS = Target.the("Account address")
            .located(By.xpath("//input[@data-qa='address']"));

    public static final Target COUNTRY = Target.the("Select country")
            .located(By.xpath("//select[@data-qa='country']"));

    public static final Target E_COUNTRY = Target.the("User country")
            .located(By.xpath(String.format("//select[@data-qa='country']/child::option[%s]", user.getCountry())));

    public static final Target STATE = Target.the("Account state")
            .located(By.xpath("//input[@data-qa='state']"));

    public static final Target CITY = Target.the("Account city")
            .located(By.xpath("//input[@data-qa='city']"));

    public static final Target ZIPCODE = Target.the("Account zipcode")
            .located(By.xpath("//input[@data-qa='zipcode']"));

    public static final Target NUMBER = Target.the("Account mobile number")
            .located(By.xpath("//input[@data-qa='mobile_number']"));

    public static final Target CREATE_BTTN = Target.the("Create account button")
            .located(By.xpath("//button[@data-qa='create-account']"));
}