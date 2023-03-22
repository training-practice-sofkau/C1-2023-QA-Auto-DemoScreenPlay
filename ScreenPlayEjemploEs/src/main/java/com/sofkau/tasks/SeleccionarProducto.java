package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.ComprarProducto.*;

public class SeleccionarProducto implements Task {


    private String nameCrad;
    private String cardNumber;

    private String cvc;

    private String expiration;

    private String year;

    public SeleccionarProducto conLaNombreTarjeta(String nameCrad) {
        this.nameCrad = nameCrad;
        return this;
    }

    public SeleccionarProducto yConLaCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }


    public SeleccionarProducto yConLaCvc(String cvc) {
        this.cvc = cvc;
        return this;
    }


    public SeleccionarProducto yConLaExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }


    public SeleccionarProducto yConElYear(String year) {
        this.year = year;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTO),
                Click.on(BOTON_KIDS),
                Click.on(BOTON_DRESS),
                Click.on(BOTON_COMPRAR_SLEEVES),
                Click.on(BOTON_CONTINUE),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CHECKOUT),
                Click.on(BOTON_PLACE_ORDEN),
                Enter.theValue(nameCrad).into(CAMPO_NAME_CARD),
                Enter.theValue(cardNumber).into(CAMPO_CARD_NUMERO),
                Enter.theValue(cvc).into(CAMPO_CVC),
                Enter.theValue(expiration).into(CAMPO_EXPIRATION),
                Enter.theValue(year).into(CAMPO_FECHA_ANIO),
                Click.on(BOTON_CONFIRMAR_ORDEN)

        );
    }

    public static SeleccionarProducto seleccionarProducto() {
        return new SeleccionarProducto();
    }
}
