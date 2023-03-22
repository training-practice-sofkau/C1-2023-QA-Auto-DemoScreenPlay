package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_REGISTRO_EXITOSO;

public class MensajeRegistroExitoso implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_REGISTRO_EXITOSO.resolveFor(actor).getText();
    }

    public static MensajeRegistroExitoso mensajeRegistroExitoso(){
        return new MensajeRegistroExitoso();
    }
}

