package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmarRegistro.MENSAJE_REGISTROE;

public class MensajeAccountCreated implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_REGISTROE.resolveFor(actor).getText();
    }

    public static MensajeAccountCreated mensajeAccountCreated(){
        return new MensajeAccountCreated();
    }
}

