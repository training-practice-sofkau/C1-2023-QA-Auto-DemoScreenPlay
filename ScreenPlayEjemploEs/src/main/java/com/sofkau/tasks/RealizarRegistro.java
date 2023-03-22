package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRedireccionamientoRegistroCompleto.CAMPO_REGISTRO_PASSWORD;
import static com.sofkau.ui.PaginaRedireccionamientoRegistroCompleto.SELECCION_GENERO;
import static com.sofkau.ui.PaginaRegistro.*;

public class RealizarRegistro implements Task {

    private String nombre;
    private String email;

    public RealizarRegistro conElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public RealizarRegistro yElCorreo(String correo){
        this.email =correo;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NAME_NEW_USER),
                Enter.theValue(email).into(CAMPO_EMAIL_NEW_USER),
                Click.on(BOTON_SINGUP_NEW_USER)
        );
    }



    public static RealizarRegistro realizarRegistro(){
        return new RealizarRegistro();
    }






}
