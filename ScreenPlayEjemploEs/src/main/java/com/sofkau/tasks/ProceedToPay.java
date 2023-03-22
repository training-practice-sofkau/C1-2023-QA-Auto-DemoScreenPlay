package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.sofkau.ui.ShoppingCart.PROCEED_TO_CHECKOUT;

public class ProceedToPay implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(PROCEED_TO_CHECKOUT)
            );
        }
        public static ProceedToPay proceedToPay(){
            return new ProceedToPay();
        }
}

