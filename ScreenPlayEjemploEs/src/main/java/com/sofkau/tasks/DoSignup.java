package com.sofkau.tasks;

import com.sofkau.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.Signup.*;

public class DoSignup implements Task {
    private static final User user = User.getInstance();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TITLE),
                Enter.theValue(user.getName()).into(NAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                Scroll.to(DAY),
                Click.on(DAY),
                Click.on(E_DAY),
                Click.on(MONTH),
                Click.on(E_MONTH),
                Click.on(YEAR),
                Click.on(E_YEAR),
                Scroll.to(FIRST_NAME),
                Enter.theValue(user.getName()).into(FIRST_NAME),
                Scroll.to(LAST_NAME),
                Enter.theValue(user.getLName()).into(LAST_NAME),
                Scroll.to(COMPANY),
                Enter.theValue(user.getCompany()).into(COMPANY),
                Scroll.to(ADDRESS),
                Enter.theValue(user.getAddress()).into(ADDRESS),
                Scroll.to(COUNTRY),
                Click.on(COUNTRY),
                Click.on(E_COUNTRY),
                Scroll.to(STATE),
                Enter.theValue(user.getState()).into(STATE),
                Scroll.to(CITY),
                Enter.theValue(user.getCity()).into(CITY),
                Scroll.to(ZIPCODE),
                Enter.theValue(user.getZipCode()).into(ZIPCODE),
                Scroll.to(NUMBER),
                Enter.theValue(user.getNumber()).into(NUMBER),
                Scroll.to(CREATE_BTTN),
                Click.on(CREATE_BTTN)
        );
    }

    public static DoSignup doSignup() {
        return new DoSignup();
    }
}
