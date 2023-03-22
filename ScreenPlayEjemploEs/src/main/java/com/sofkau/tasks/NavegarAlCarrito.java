package com.sofkau.tasks;

import com.sofkau.ui.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaProductos.SHOPPING_CART;

public class NavegarAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHOPPING_CART)
        );
    }
    public static NavegarAlCarrito navegarAlCarrito(){
        return new NavegarAlCarrito();
    }
}
