package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.RefrescarPagina.refrescarPagina;
import static com.sofkau.ui.ComprarProductos.*;

public class AgregarProductosCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CATEGORIA_HOMBRE),
                Click.on(CATEGORIA_HOMBRE),
                Click.on(SUBCATEGORIA_JEANS),
                refrescarPagina(),
                Click.on(CATEGORIA_HOMBRE),
                Click.on(SUBCATEGORIA_JEANS),
                refrescarPagina(),
                Click.on(VER_PRODUCTO_1),
                Click.on(AGREGAR_CARRITO),
                Click.on(CONTINUAR_COMPRANDO),
                Click.on(CATEGORIA_HOMBRE),
                Click.on(SUBCATEGORIA_JEANS),
                Click.on(VER_PRODUCTO_2),
                Click.on(AGREGAR_CARRITO),
                Click.on(VER_CARRITO),
                Click.on(BOTON_CONTINUAR_COMPRA),
                Scroll.to(BOTON_ORDEN_COMPRA),
                Click.on(BOTON_ORDEN_COMPRA)

        );
    }

    public static AgregarProductosCarrito agregarProductosCarrito(){return new AgregarProductosCarrito();}
}
