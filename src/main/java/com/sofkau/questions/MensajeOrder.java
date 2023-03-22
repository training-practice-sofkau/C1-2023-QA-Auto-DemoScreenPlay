package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_ORDEN;

public class MensajeOrder implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ORDEN.resolveFor(actor).getText();
    }
    public static MensajeOrder mensajeOrder(){
        return new MensajeOrder();
    }
}
