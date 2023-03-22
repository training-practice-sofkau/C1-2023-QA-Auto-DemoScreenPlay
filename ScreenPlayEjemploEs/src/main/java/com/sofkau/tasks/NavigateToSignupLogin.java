package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomePage.SIGNUP_LOGIN_BTTN;

public class NavigateToSignupLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGNUP_LOGIN_BTTN)
        );
    }

    public static NavigateToSignupLogin navigateToSignupLogin() {
        return new NavigateToSignupLogin();
    }
}