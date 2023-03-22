package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;



import static com.sofkau.ui.ConfirmacionLogin.*;

public class BuscarProductos1 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENS_CATEGORY),
                Click.on(MENS_CATEGORY),
                Click.on(TSHIRT_CATEGORY)
        );
    }

    public static BuscarProductos1 buscarProductos1(){
        return new BuscarProductos1();
    }
}
