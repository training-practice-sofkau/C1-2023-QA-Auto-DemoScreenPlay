package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.apache.commons.compress.archivers.sevenz.CLI;

import java.lang.reflect.Type;

import static com.sofkau.ui.PaginaCompletarRegistro.*;
import static com.sofkau.ui.PaginaRegistro.*;

public class CompletarRegistro implements Task {
    private String day;
    private String month;
    private String year;
    private String password;
    private String firstname;
    private String lastname;
    private String direction;
    private String state;
    private String city;
    private String zipcode;
    private String number;

    public CompletarRegistro withDay(String day){
        this.day=day;
        return this;
    }

    public CompletarRegistro withMonth(String month){
        this.month=month;
        return this;
    }
    public CompletarRegistro withYear(String year){
        this.year=year;
        return this;
    }
    public CompletarRegistro withPassword(String password){
        this.password=password;
        return this;
    }
    public CompletarRegistro withFirstName(String firstName) {
        this.firstname = firstName;
        return this;
    }

    public CompletarRegistro withLastName(String lastName) {
        this.lastname = lastName;
        return this;
    }

    public CompletarRegistro withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public CompletarRegistro withState(String state) {
        this.state = state;
        return this;
    }

    public CompletarRegistro withCity(String city) {
        this.city = city;
        return this;
    }

    public CompletarRegistro withZipCode(String zipCode) {
        this.zipcode = zipCode;
        return this;
    }

    public CompletarRegistro withNumber(String number) {
        this.number = number;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_MALE),
                Enter.theValue(password).into(PASSWORD),
                SelectFromOptions.byValue(day).from(SELECT_DAY),
                SelectFromOptions.byValue(month).from(SELECT_MONTH),
                SelectFromOptions.byValue(year).from(SELECT_YEAR),
                Enter.theValue(firstname).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Scroll.to(ADDRESS),
                Enter.theValue(direction).into(ADDRESS),
                Click.on(SELECT_COUNTRY),
                Click.on(SELECTED_COUNTRY),
                Enter.theValue(state).into(STATE),
                Enter.theValue(city).into(CITY),
                Enter.theValue(zipcode).into(ZIPCODE),
                Enter.theValue(number).into(PHONENUMBER),
                Click.on(BOTON_CREATE_ACCOUNT)
        );
    }

    public static CompletarRegistro completarRegistro(){
        return new CompletarRegistro();
    }
}
