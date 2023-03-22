package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.DatosPago.*;

public class HacerPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("Juan Pineda").into(NAMECARD),
        Enter.theValue("12345654565").into(NUMBERCARD),
        Enter.theValue("232").into(CVC),
        Enter.theValue("02").into(EXPIRATION),
        Enter.theValue("2026").into(EXPIRATIONYEAR),
        Click.on(SUBMITPAY)
        );
    }
    public static HacerPago hacerPago(){
        return new HacerPago();
    }
}
