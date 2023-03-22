package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaymentDone.PAYMENT_DONE;

public class MensajeOrderPlaced implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PAYMENT_DONE.resolveFor(actor).getText();
    }

    public static MensajeOrderPlaced mensajeOrderPlaced(){
        return new MensajeOrderPlaced();
    }
}
