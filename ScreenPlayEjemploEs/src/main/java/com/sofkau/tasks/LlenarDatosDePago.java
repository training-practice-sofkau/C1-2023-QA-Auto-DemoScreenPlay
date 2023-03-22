package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioDatosPago.*;

public class LlenarDatosDePago implements Task {

    private String nameOnCard;
    private String cardNumber;
    private String cvc;
    private String month;
    private String year;

    public LlenarDatosDePago conElNombre(String nameOnCard){
        this.nameOnCard=nameOnCard;
        return this;
    }

    public LlenarDatosDePago conCardNumber(String cardNumber){
        this.cardNumber=cardNumber;
        return this;
    }

    public LlenarDatosDePago conElCVC(String cvc){
        this.cvc=cvc;
        return this;
    }

    public LlenarDatosDePago conElMes(String mes){
        this.month=mes;
        return this;
    }

    public LlenarDatosDePago conElYear(String anno){
        this.year=anno;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameOnCard).into(CARD_NAME),
                Enter.theValue(cardNumber).into(CARD_NUMBER),
                Enter.theValue(cvc).into(CVC),
                Enter.theValue(month).into(EXPIRATION_MONTH),
                Enter.theValue(year).into(EXPIRATION_YEAR),
                Click.on(BOTON_PAGAR)
        );
    }

    public static LlenarDatosDePago llenarDatosDePago(){
        return new LlenarDatosDePago();
    }
}
