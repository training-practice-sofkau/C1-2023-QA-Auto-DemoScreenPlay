package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_FINAL_COMPRA;
import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_INICIO;

public class MensajeCompraExitosa implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FINAL_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeCompraExitosa mensajeCompraExitosa(){
        return new MensajeCompraExitosa();
    }
}
