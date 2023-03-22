package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static com.sofkau.ui.PaymentPage.*;


public class PayAndConfirmPage implements Task {

    private String name_card;
    private String card_number;
    private String cvc;
    private String expirationMonth;
    private String expirationYear;

    public PayAndConfirmPage withNameOnCard(String name_card){
        this.name_card=name_card;
        return this;
    }
    public PayAndConfirmPage withCardNumber(String card_number){
        this.card_number=card_number;
        return this;
    }
    public PayAndConfirmPage withCVC(String cvc){
        this.cvc=cvc;
        return this;
    }

    public PayAndConfirmPage withExpirationMonth(String expirationMonth){
        this.expirationMonth=expirationMonth;
        return this;
    }

    public PayAndConfirmPage withExpirationYear(String expirationYear){
        this.expirationYear=expirationYear;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name_card).into(CAMPO_NAME_ON_CARD),
                Enter.theValue(card_number).into(CARD_NUMBER),
                Enter.theValue(cvc).into(CVC),
                Enter.theValue(expirationMonth).into(EXPIRATION_MONTH),
                Enter.theValue(expirationYear).into(EXPIRATION_YEAR),
                Click.on(SUBMIT_BOTTON)
        );
    }

    public static PayAndConfirmPage payAndConfirmPage(){
        return new PayAndConfirmPage();
    }
}
