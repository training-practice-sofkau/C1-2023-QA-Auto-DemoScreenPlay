package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_CONFIRMACION_COMPRA;

public class MensajeCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeCompra mensajeCompra(){
        return new MensajeCompra();
    }
}
