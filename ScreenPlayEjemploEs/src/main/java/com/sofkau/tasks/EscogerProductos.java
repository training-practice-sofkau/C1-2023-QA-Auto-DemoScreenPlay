package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.ComprarProductos.*;
import static com.sofkau.ui.PaginaRegistro.BOTON_REGISTRO;

public class EscogerProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                thePage(),
                Scroll.to(WOMEN),
                Click.on(WOMEN),
                Click.on(DRESS),
                thePage(),
                Scroll.to(PRODUCTO3),
                Click.on(PRODUCTO1),
                Click.on(ADDPRODUCTO1),
                Click.on(CONTINUESHOPPING),
                Click.on(WOMEN),
                Click.on(DRESS),
                Scroll.to(PRODUCTO3),
                Click.on(PRODUCTO2),
                Click.on(ADDPRODUCTO1),
                Click.on(CONTINUESHOPPING),
                Click.on(WOMEN),
                Click.on(DRESS),
                Scroll.to(PRODUCTO3),
                Click.on(PRODUCTO3),
                Click.on(ADDPRODUCTO1),
                Click.on(CONTINUESHOPPING),
                Click.on(CAR),
                Click.on(CHECKOUT),
                Click.on(BUTTOMPAYMENT)
        );

    }

    public static EscogerProductos escogerProductos(){
        return new EscogerProductos();}
}
