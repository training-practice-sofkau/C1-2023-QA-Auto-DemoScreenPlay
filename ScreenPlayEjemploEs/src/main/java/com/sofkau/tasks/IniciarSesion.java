package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.tasks.LlenarRegistro.contrasennaUsuario;
import static com.sofkau.tasks.LlenarRegistro.emailUsuario;
import static com.sofkau.ui.PaginaRegistro.*;

public class IniciarSesion implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("juan.pineda@gmail.com").into(CAMPO_CORREO_LOGIN),
                Enter.theValue("123456").into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
