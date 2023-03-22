package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static com.sofkau.ui.PaginaProductos.*;

public class AgregarProductos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Refresh.thePage(),
                Click.on(MEN_CATEGORY),
                Click.on(TSHIRT_SELECTOR),
                Click.on(PRODUCT_1),
                Click.on(CONTINUE_SHOPPING),
                Click.on(PRODUCT_2),
                Click.on(CONTINUE_SHOPPING)
        );

    }

    public static AgregarProductos agregarProductos(){
        return new AgregarProductos();
    }
}
