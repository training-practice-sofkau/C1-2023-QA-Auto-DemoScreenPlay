package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaFormularioRegistro.REGISTRO_FINALIZADO;

public class MensajeRegistroExitoso implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return REGISTRO_FINALIZADO.resolveFor(actor).getText();
    }
    public static MensajeRegistroExitoso mensajeRegistroExitoso(){
        return new MensajeRegistroExitoso();
    }
}
