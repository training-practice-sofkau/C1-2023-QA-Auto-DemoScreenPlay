package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_CONFIRMACION;

public class MensajeRegistro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }

    public static MensajeRegistro mensajeRegistro(){
        return new MensajeRegistro();
    }
}
