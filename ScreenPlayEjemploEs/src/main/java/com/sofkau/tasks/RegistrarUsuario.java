package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.NuevoUsuario.*;
import static com.sofkau.ui.PaginaRegistro.*;

public class RegistrarUsuario implements Task {


    private String nombre;
    private String correo;

    public RegistrarUsuario conElUsuarioNuevo(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public RegistrarUsuario yConLaContrasennaNueva(String correo) {
        this.correo = correo;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_USUARIO_NUEVO),
                Enter.theValue(correo).into(CAMPO_CORREO_NUEVO),
                Click.on(BOTON_REGISTRO_NUEVO)

        );
    }


    public static RegistrarUsuario registrarUsuario() {
        return new RegistrarUsuario();
    }

}
