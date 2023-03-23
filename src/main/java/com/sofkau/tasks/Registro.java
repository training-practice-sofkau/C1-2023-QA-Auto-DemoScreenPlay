package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.sofkau.ui.PaginaRegistro.*;

public class Registro implements Task {
    private String nombre;
    private String correoElectronico;

    public Registro nombreCompletoUsuario(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Registro correoUsuario(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE_COMPLETO),
                Enter.theValue(correoElectronico).into(CAMPO_EMAIL),
                Click.on(BOTON_SIGNUP)
        );
    }


    public static Registro registrarse() {
        return new Registro();
    }
}