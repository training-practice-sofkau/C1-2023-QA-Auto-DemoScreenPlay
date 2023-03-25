package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaymentDone.ORDER_TITLE;

public class IsOrderPlaced implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ORDER_TITLE.resolveFor(actor).getText();
    }

    public static IsOrderPlaced isOrderPlaced() {
        return new IsOrderPlaced();
    }
}