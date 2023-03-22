package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.MSJ_CONFIRMAR_COMPRA;


public class MensajeCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MSJ_CONFIRMAR_COMPRA.resolveFor(actor).getText();}
        public static MensajeCompra mensajeCompra(){
        return new MensajeCompra();
    }

    }



