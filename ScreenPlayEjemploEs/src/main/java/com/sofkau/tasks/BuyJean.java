package com.sofkau.tasks;

import com.sofkau.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.Checkout.COMMENT;
import static com.sofkau.ui.Checkout.TO_PAYMENT;
import static com.sofkau.ui.HomePage.JEANS;
import static com.sofkau.ui.HomePage.MEN_BTTN;
import static com.sofkau.ui.MenJeans.ADD_CHEAP;
import static com.sofkau.ui.MenJeans.VIEW_CART;
import static com.sofkau.ui.Payment.*;
import static com.sofkau.ui.ViewCart.TO_CHECKOUT_BTTN;

public class BuyJean implements Task {
    private static final User user = User.getInstance();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MEN_BTTN),
                Click.on(MEN_BTTN),
                Click.on(JEANS),
                Scroll.to(ADD_CHEAP),
                Click.on(ADD_CHEAP),
                Click.on(VIEW_CART),
                Click.on(TO_CHECKOUT_BTTN),
                Scroll.to(COMMENT),
                Enter.theValue("HI!").into(COMMENT),
                Click.on(TO_PAYMENT),
                Enter.theValue(String.format("%s %s", user.getName(), user.getLName())).into(NAME_C),
                Enter.theValue(user.getCCard()).into(C_NUMBER),
                Enter.theValue().into(CVC),
                Enter.theValue().into(E_MONTH),
                Enter.theValue().into(E_YEAR),
                Click.on(PAY_BTTN)
        );
    }

    public static BuyJean buyJean() {
        return new BuyJean();
    }
}