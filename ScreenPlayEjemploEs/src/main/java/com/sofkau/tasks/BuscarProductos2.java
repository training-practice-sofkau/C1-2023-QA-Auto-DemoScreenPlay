package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.CarritoDeCompras.BTN_CHECKOUT;
import static com.sofkau.ui.CatalogoProductos.PRODUCTO_ESCOGIDO;
import static com.sofkau.ui.ConfirmacionLogin.MENS_CATEGORY;
import static com.sofkau.ui.ConfirmacionLogin.TSHIRT_CATEGORY;
import static com.sofkau.ui.DetallesDeCompra.BTN_PLACE_ORDER;
import static com.sofkau.ui.PausaPublicitaria.DISMISS_ADS;
import static com.sofkau.ui.ProductoEscogido.ADD_TO_CART;
import static com.sofkau.ui.ProductoEscogido.BUTTON_VIEW_CART;

public class BuscarProductos2 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRODUCTO_ESCOGIDO),
                Click.on(PRODUCTO_ESCOGIDO),
                Click.on(ADD_TO_CART),
                Click.on(BUTTON_VIEW_CART),
                Click.on(BTN_CHECKOUT),
                Scroll.to(BTN_PLACE_ORDER),
                Click.on(BTN_PLACE_ORDER)
        );
    }

    public static BuscarProductos2 buscarProductos2(){
        return new BuscarProductos2();
    }
}
