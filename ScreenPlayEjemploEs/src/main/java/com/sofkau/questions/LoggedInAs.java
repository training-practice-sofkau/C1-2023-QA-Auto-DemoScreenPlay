package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.HomePage.LOGGED_IN_AS;

public class LoggedInAs implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LOGGED_IN_AS.resolveFor(actor).getText();
    }

    public static LoggedInAs loggedInAs() {
        return new LoggedInAs();
    }
}