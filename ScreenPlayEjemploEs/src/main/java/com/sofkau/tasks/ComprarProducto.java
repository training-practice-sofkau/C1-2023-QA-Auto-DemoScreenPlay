package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.PaginaCompra.*;
import static com.sofkau.ui.PaginaFormRegistro.FIRST_NAME;


public class ComprarProducto implements Task {

    String nombreCard;
    String numeroCard;
    String cvcCard;
    String mes;
    String anio;

    public ComprarProducto conNombreCard(String nombreCard) {
        this.nombreCard = nombreCard;
        return this;
    }

    public ComprarProducto yNumeroCard(String numeroCard) {
        this.numeroCard = numeroCard;
        return this;
    }

    public ComprarProducto yCvc(String cvcCard) {
        this.cvcCard = cvcCard;
        return this;
    }

    public ComprarProducto yMes(String mes) {
        this.mes = mes;
        return this;
    }

    public ComprarProducto yAnio(String anio) {
        this.anio = anio;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CATEGORIA_KIDS),
                Click.on(CATEGORIA_KIDS),
                Click.on(CATEGORIA_DRESS),
                Scroll.to(PRODUCTO_SELECCIONADO),
                Click.on(PRODUCTO_SELECCIONADO),
                Click.on(ENLACE_IR_CARRITO),
                Click.on(ENLACE_IR_CHECKOUT),
                Scroll.to(ENLACE_ORDER),
                Click.on(ENLACE_ORDER)
        );

        actor.attemptsTo(
                thePage()
        );
        actor.attemptsTo(
                Scroll.to(ENLACE_ORDER),
                Click.on(ENLACE_ORDER),
                Enter.theValue(nombreCard).into(NOMBRE_CARD),
                Enter.theValue(numeroCard).into(NUMERO_CARD),
                Enter.theValue(cvcCard).into(CVC_CARD),
                Enter.theValue(mes).into(EXPIRACION_CARD),
                Enter.theValue(anio).into(YEAR_EXPIRACION_CARD),
                Click.on(BOTON_CONFIRMAR_COMPRA )


        );


    }

    public static ComprarProducto comprarProducto() {
        return new ComprarProducto();
    }
}
