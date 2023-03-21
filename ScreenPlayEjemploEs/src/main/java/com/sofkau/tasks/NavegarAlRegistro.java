package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;

public class NavegarAlRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_REGISTRO),
                Enter.theValue("Efrain solorzano").into(CAMPO_USUARIO),
                Enter.theValue("efsolora@gmail.com").into(CAMPO_CORREO),
                Click.on(BOTON_SUBMIT)
        );
    }
        public static NavegarAlRegistro navegarAlRegistro(){
        return new NavegarAlRegistro();
    }
}
