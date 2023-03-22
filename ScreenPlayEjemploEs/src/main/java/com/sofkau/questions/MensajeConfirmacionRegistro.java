package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaCompletarRegistro.CONFIRMAR_REGISTRO;

public class MensajeConfirmacionRegistro implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CONFIRMAR_REGISTRO.resolveFor(actor).getText();
    }

    public static MensajeConfirmacionRegistro mensajeConfirmacionRegistro(){
        return new MensajeConfirmacionRegistro();
    }

}
