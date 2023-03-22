package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.CompraProducto.MENSAJE_CONFIRMACION;



public class MensajeConfirmacionCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }

    public static MensajeConfirmacionCompra mensajeConfirmacionCompra(){
        return new MensajeConfirmacionCompra();
    }
}
