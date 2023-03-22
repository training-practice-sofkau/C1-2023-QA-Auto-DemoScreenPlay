package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;

public class Registrarse implements Task {

    private String name;
    private String email;

    public Registrarse conElName(String name){
        this.name=name;
        return this;
    }

    public Registrarse conElEmail(String email){
        this.email=email;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CAMPO_NOMBRE),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_SIGNUP)
        );
    }

    public static Registrarse registrarse(){
        return new Registrarse();
    }
}
