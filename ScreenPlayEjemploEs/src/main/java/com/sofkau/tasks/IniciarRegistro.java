package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;

public class IniciarRegistro implements Task {

    private String username;
    private String email;

    public IniciarRegistro withuserName(String username){
        this.username=username;
        return this;
    }

    public IniciarRegistro andWithEmail(String email){
        this.email=email;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(CAMPO_REGISTER_NAME),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_SIGNUP)
        );
    }

    public static IniciarRegistro iniciarRegistro(){
        return new IniciarRegistro();
    }
}
