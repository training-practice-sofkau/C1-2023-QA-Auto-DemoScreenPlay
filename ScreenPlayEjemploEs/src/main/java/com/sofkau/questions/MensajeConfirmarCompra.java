package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaCarritoCompra.CONFIRMAR_COMPRA;

public class MensajeConfirmarCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CONFIRMAR_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeConfirmarCompra mensajeConfirmarCompra(){
        return new MensajeConfirmarCompra();
    }
}
