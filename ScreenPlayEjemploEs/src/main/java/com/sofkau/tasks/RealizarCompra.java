package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaCompra.SELECION_PRODUCTOS_POLO;
import static com.sofkau.ui.PaginaRegistro.BOTON_SINGUP_NEW_USER;

public class RealizarCompra  implements Task {

    public static RealizarCompra realizarCompra(){
        return new RealizarCompra();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(SELECION_PRODUCTOS_POLO);
    }
}
