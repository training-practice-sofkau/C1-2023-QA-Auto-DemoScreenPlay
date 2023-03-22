package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;

import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_INICIO;
import static com.sofkau.ui.PaginaCompra.ORDER_PLACED;

public class MensajeOrder implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return ORDER_PLACED.resolveFor(actor).getText();
    }

    public static MensajeOrder mensajeOrder(){
        return new MensajeOrder();
    }


}
