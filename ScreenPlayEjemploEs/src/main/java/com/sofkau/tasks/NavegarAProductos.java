package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaRegistro.BOTON_PRODUCTOS;

public class NavegarAProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTOS)
        );
    }
    public static NavegarAProductos navegarAProductos(){
        return new NavegarAProductos();
    }
}
