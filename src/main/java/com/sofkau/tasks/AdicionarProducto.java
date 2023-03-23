package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.sofkau.ui.PaginaCarrito.CARRITO_COMPRAS;
import static com.sofkau.ui.PaginaPrincipal.*;

public class AdicionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SECCION_HOMBRES),
                Click.on(JEANS_HOMBRE),
                RefrescarPagina.refrescarPagina(),
                Click.on(SECCION_HOMBRES),
                Click.on(JEANS_HOMBRE),
                Click.on(GRUNT_BLUE_JEANS),
                Click.on(AGREGAR_CARRITO),
                Click.on(CONTINUAR_COMPRA),
                Click.on(SECCION_HOMBRES),
                Click.on(CAMISETAS_HOMBRE),
                Scroll.to(PREMIUM_POLO),
                Click.on(PREMIUM_POLO),
                Click.on(AGREGAR_CARRITO),
                Click.on(CONTINUAR_COMPRA),
                Scroll.to(PRENDAS_MADAME),
                Click.on(PRENDAS_MADAME),
                Click.on(VESTIDO_MADAME),
                Click.on(AGREGAR_CARRITO),
                Click.on(CONTINUAR_COMPRA),
                Click.on(CARRITO_COMPRAS)
        );

    }

    public static AdicionarProducto adicionarProducto() {
        return new AdicionarProducto();
    }

}