package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.sofkau.ui.PaginaFormRegistro.*;

public class FormularioRegistro implements Task{

    private String gender ;
    private String password;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String mobile;

    public FormularioRegistro seleccionaGenero(String gender){
        this.gender=gender;
        return this;
    }

    public FormularioRegistro yPassword(String password){
        this.password=password;
        return this;
    }

    public FormularioRegistro yDay(String day) {
        this.day = day;
        return this;
    }

    public FormularioRegistro yMonth(String month) {
        this.month = month;
        return this;
    }

    public FormularioRegistro yYear(String year) {
        this.year = year;
        return this;
    }

    public FormularioRegistro yFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FormularioRegistro yLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FormularioRegistro yCompany(String company) {
        this.company = company;
        return this;
    }

    public FormularioRegistro yAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public FormularioRegistro yAddress2(String address2) {
        this.address2 = address2;
        return this;

    }

    public FormularioRegistro yCountry(String country) {
        this.country = country;
        return this;
    }

    public FormularioRegistro yState(String state) {
        this.state = state;
        return this;
    }

    public FormularioRegistro yCity(String city) {
        this.city = city;
        return this;
    }

    public FormularioRegistro yZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public FormularioRegistro yMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            switch (gender){
                case "Hombre":
                    actor.attemptsTo(Click.on(BOTON_MALE ));
                case "Mujer":
                    actor.attemptsTo(Click.on(BOTON_FEMALE));
                    break;
            }
            actor.attemptsTo(
                    Enter.theValue(password).into(PASSWORD),
                    Scroll.to(DAY),
                    SelectFromOptions.byValue(day).from(DAY),
                    SelectFromOptions.byValue(month).from(MONTH),
                    SelectFromOptions.byValue(year).from(YEAR),
                    Scroll.to(FIRST_NAME),
                    Enter.theValue(firstName).into(FIRST_NAME),
                    Enter.theValue(lastName).into(LAST_NAME),
                    Enter.theValue(company).into(COMPANY),
                    Enter.theValue(address1).into(ADDRESS),
                    Enter.theValue(address2).into(ADDRESS2),
                    SelectFromOptions.byValue(country).from(COUNTRY),
                    Scroll.to(STATE),
                    Enter.theValue(state).into(STATE),
                    Enter.theValue(city).into(CITY),
                    Enter.theValue(zipcode).into(ZIPCODE),
                    Enter.theValue(mobile).into(MOBILE),
                    Click.on(BUTTON_CREATE_ACOUNT)
            );


    }
    public static  FormularioRegistro formularioRegistro(){
        return new  FormularioRegistro();
    }
}
