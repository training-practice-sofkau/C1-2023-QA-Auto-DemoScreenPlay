package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.FlujoDeCompra.*;
import static com.sofkau.ui.PaginaRegistro.BOX_DAY;
import static com.sofkau.ui.PaginaRegistro.CAMPO_EMAIL;
import static com.sofkau.tasks.Refrescar.thePage;

public class ComprarProductos implements Task {

    private String cantidad;
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String CVC;
    private String mesTarjeta;
    private String annoTarjeta;
    public ComprarProductos cantidad(String cantidad){
        this.cantidad = cantidad;
        return this;
    }
    public ComprarProductos nombreTarjeta(String nombreTarjeta){
        this.nombreTarjeta = nombreTarjeta;
        return this;
    }
    public ComprarProductos numeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }
    public ComprarProductos CVC(String CVC){
        this.CVC = CVC;
        return this;
    }
    public ComprarProductos mesTarjeta(String mesTarjeta){
        this.mesTarjeta = mesTarjeta;
        return this;
    }
    public ComprarProductos annoTarjeta(String annoTarjeta){
        this.annoTarjeta = annoTarjeta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTOS),
                Click.on(CATEGORIA_MEN),
                Click.on(SUBCATEGORIA_TSHIRTS),
                Click.on(BOTON_VIEW_PRODUCT_CAMISETA),
                Enter.theValue(cantidad).into(CAMPO_CANTIDAD),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_SEGUIR_COMPRANDO),
                Click.on(CATEGORIA_MEN),
                Click.on(SUBCATEGORIA_JEANS),
                Click.on(BOTON_VIEW_PRODUCT_JEANS3),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_SEGUIR_COMPRANDO),
                Click.on(BOTON_VER_CARRITO),
                Click.on(BOTON_CHECKOUT),
                Scroll.to(BOTON_CAJA_DE_COMENTARIOS),
                Click.on(BOTON_HACER_ORDEN),
                Enter.theValue(nombreTarjeta).into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(numeroTarjeta).into(CAMPO_NUMERO_TARJETA),
                Enter.theValue(CVC).into(CAMPO_CVC),
                Enter.theValue(mesTarjeta).into(CAMPO_MES_TARJETA),
                Enter.theValue(annoTarjeta).into(CAMPO_ANNO_TARJETA),
                Click.on(BOTON_PAGAR)


        );
    }
    public static ComprarProductos comprarProductos(){
        return new ComprarProductos();
    }
}
