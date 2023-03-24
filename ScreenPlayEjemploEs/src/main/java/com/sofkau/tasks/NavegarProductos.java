package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.ComprarProductos.PRODUCTOS;
import static com.sofkau.ui.PaginaRegistro.BOTON_REGISTRO;

public class NavegarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTOS)
        );
    }
    public static NavegarProductos navegarProductos(){
        return new NavegarProductos();
    }
}
