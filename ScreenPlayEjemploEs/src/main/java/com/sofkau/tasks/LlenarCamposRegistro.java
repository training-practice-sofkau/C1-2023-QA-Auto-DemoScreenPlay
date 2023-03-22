package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Locale;

import static com.sofkau.ui.PaginaCamposRegistro.*;
import static com.sofkau.ui.Registro.*;

public class LlenarCamposRegistro implements Task {

    private String gender;
    private String password;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String address1;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String mobil;

    public LlenarCamposRegistro withGender(String gender){
        this.gender=gender;
        return this;
    }


    public LlenarCamposRegistro withPassword(String password){
        this.password=password;
        return this;
    }

    public LlenarCamposRegistro withDay(String day) {
        this.day = day;
        return this;
    }

    public LlenarCamposRegistro withMonth(String month) {
        this.month = month;
        return this;
    }

    public LlenarCamposRegistro withYear(String year) {
        this.year = year;
        return this;
    }

    public LlenarCamposRegistro withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LlenarCamposRegistro withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LlenarCamposRegistro withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public LlenarCamposRegistro withCountry(String country) {
        this.country = country;
        return this;
    }

    public LlenarCamposRegistro withState(String state) {
        this.state = state;
        return this;
    }

    public LlenarCamposRegistro withCity(String city) {
        this.city = city;
        return this;
    }

    public LlenarCamposRegistro withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public LlenarCamposRegistro withMobil(String mobil) {
        this.mobil = mobil;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch(gender.toLowerCase()) {
            case "male":
                actor.attemptsTo(
                        Click.on(MALE)
                );
                break;
            case "female":
                actor.attemptsTo(
                        Click.on(FEMALE)
                );
                break;
        }
        actor.attemptsTo(
                Enter.theValue(password).into(CAMPO_PASSWORD),
                SelectFromOptions.byValue(day).from(CAMPO_DAY),
                SelectFromOptions.byValue(month).from(CAMPO_MONTH),
                SelectFromOptions.byValue(year).from(CAMPO_YEAR),
                Enter.theValue(firstName).into(CAMPO_FIRST_NAME),
                Enter.theValue(lastName).into(CAMPO_LAST_NAME),
                Enter.theValue(address1).into(CAMPO_ADDRESS1),
                SelectFromOptions.byValue(country).from(CAMPO_COUNTRY),
                Enter.theValue(state).into(CAMPO_STATE),
                Enter.theValue(city).into(CAMPO_CITY),
                Enter.theValue(zipcode).into(CAMPO_ZIPCODE),
                Enter.theValue(mobil).into(CAMPO_MOBILE_NUMBER),
                Scroll.to(BOTON_CREATE_ACCOUNT),
                Click.on(BOTON_CREATE_ACCOUNT),
                Click.on(BOTON_CONTINUE)
        );

    }

    public static LlenarCamposRegistro llenarCamposRegistro(){
        return new LlenarCamposRegistro();
    }

}
