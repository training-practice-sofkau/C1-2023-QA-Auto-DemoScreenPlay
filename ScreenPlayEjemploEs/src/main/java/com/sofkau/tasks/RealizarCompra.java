package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaCompra.*;


public class RealizarCompra  implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        Scroll.to(CATEGORIA_HOMBRE),

        Click.on(CATEGORIA_HOMBRE),
        Click.on (SECCION_JEANS),

        Click.on (SELECION_PRODUCT0_CAMISA_N)

    );
    }
    public static RealizarCompra realizarCompra(){
        return new RealizarCompra();
    }
}
