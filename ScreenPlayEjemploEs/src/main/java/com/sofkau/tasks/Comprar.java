package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.sofkau.tasks.RefrescarVentana.thePage;
import static com.sofkau.ui.PaginaCamposRegistro.*;
import static com.sofkau.ui.PaginaCompra.*;

public class Comprar implements Task {

    private String nameOnCard;
    private String cardNumber;
    private String cvc;
    private String expiration;
    private String year;

    public Comprar witchNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
        return this;
    }

    public Comprar withCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public Comprar withCvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    public Comprar withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    public Comprar withYear(String year) {
        this.year = year;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OPTION_WOMEN),
                Click.on(OPTION_WOMEN),
                Click.on(OPTION_SAREE)
                );

        actor.attemptsTo(
                thePage()
        );

        actor.attemptsTo(
                Scroll.to(OPTION_WOMEN),
                Click.on(OPTION_WOMEN),
                Click.on(OPTION_SAREE),
                Scroll.to(VIEW_PRODUCT),
                Click.on(VIEW_PRODUCT),
                Click.on(ADD_TO_CART),
                Click.on(VIEW_CART),
                Click.on(PROCEED_TO_CHECKOUT),
                Scroll.to(PLACE_ORDER),
                Click.on(PLACE_ORDER),
                Enter.theValue(nameOnCard).into(NAME_OR_CARD),
                Enter.theValue(cardNumber).into(CARD_NUMBER),
                Enter.theValue(cvc).into(CVC),
                Enter.theValue(expiration).into(EXPIRATION),
                Enter.theValue(year).into(YEAR),
                Click.on(BOTON_SUBMIT)
        );

    }

    public static Comprar comprar(){
        return new Comprar();
    }
}
