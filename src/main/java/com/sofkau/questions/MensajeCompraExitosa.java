package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaPagos.MENSAJE_CONFIRMACION_PEDIDO;

public class MensajeCompraExitosa implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION_PEDIDO.resolveFor(actor).getText();
    }
    public static MensajeCompraExitosa mensajeCompraExitosa(){
        return new MensajeCompraExitosa();
    }
}
