package com.sofkau.tasks;

import com.sofkau.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.SignUpLoginPage.*;


public class Login implements Task {
    private static final User user = User.getInstance();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getEmail()).into(USER_FIELD),
                Enter.theValue(user.getPassword()).into(PASSWORD_FIELD),
                Click.on(LOGIN_BTTN)
        );
    }

    public static Login login() {
        return new Login();
    }
}