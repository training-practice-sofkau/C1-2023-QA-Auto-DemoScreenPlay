package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.AccountCreated.TITLE;

public class IsAccountCreated implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).getText();
    }

    public static IsAccountCreated isAccountCreated() {
        return new IsAccountCreated();
    }
}