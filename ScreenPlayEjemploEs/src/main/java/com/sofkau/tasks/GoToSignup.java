package com.sofkau.tasks;

import com.sofkau.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.SignUpLoginPage.*;

public class GoToSignup implements Task {
    private static final User user = User.getInstance();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getName()).into(USER_NAME_FIELD),
                Enter.theValue(user.getEmail()).into(USER_EMAIL_FIELD),
                Click.on(SIGNUP_BTTN)
        );
    }

    public static GoToSignup goToSignup() {
        return new GoToSignup();
    }
}
