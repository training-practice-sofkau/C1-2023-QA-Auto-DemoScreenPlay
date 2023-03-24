package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaymentDone.DELETE_ACCOUNT;
import static com.sofkau.ui.PaymentDone.ORDER_TITLE;

public class IsOrderPlaced implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        Click.on(DELETE_ACCOUNT);
        return ORDER_TITLE.resolveFor(actor).getText();
    }

    public static IsOrderPlaced isOrderPlaced() {
        return new IsOrderPlaced();
    }
}
