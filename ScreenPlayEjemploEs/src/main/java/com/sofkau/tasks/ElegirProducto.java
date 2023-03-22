package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.CarritoCompras.PROSEGUIR_COMPRA;
import static com.sofkau.ui.DetalleOrden.PAGO;
import static com.sofkau.ui.DetalleProducto.*;
import static com.sofkau.ui.PaginaInicial.BOTON_MEN;
import static com.sofkau.ui.PaginaInicial.BOTON_TSHIRT;
import static com.sofkau.ui.Pago.*;
import static com.sofkau.ui.Productos.PRODUCTO;

public class ElegirProducto implements Task {

    private String nombreTarjeta;
    private String numeroTarjeta;
    private String cvcTarjeta;
    private String mesTarjeta;
    private String yearTarjeta;

    public ElegirProducto conElNombreTarjeta(String nombreTarjeta){
        this.nombreTarjeta = nombreTarjeta;
        return this;
    }

    public ElegirProducto conElNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }

    public ElegirProducto conCvcTarjeta(String cvcTarjeta){
        this.cvcTarjeta = cvcTarjeta;
        return this;
    }

    public ElegirProducto conMesTarjeta(String mesTarjeta){
        this.mesTarjeta = mesTarjeta;
        return this;
    }

    public ElegirProducto conYearTarjeta(String yearTarjeta){
        this.yearTarjeta = yearTarjeta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_MEN),
                Click.on(BOTON_MEN),
                Click.on(BOTON_TSHIRT),
                Refrescar.refrescar(),
                Click.on(PRODUCTO),
                Click.on(AGREGAR_AL_CARRITO),
                Click.on(CONTINUAR),
                Click.on(IR_AL_CARRITO),
                Click.on(PROSEGUIR_COMPRA),
                Scroll.to(PAGO),
                Click.on(PAGO),
                Enter.theValue(nombreTarjeta).into(NOMBRE_TARJETA),
                Enter.theValue(numeroTarjeta).into(NUMERO_TARJETA),
                Enter.theValue(cvcTarjeta).into(CVC),
                Enter.theValue(mesTarjeta).into(MES_TARJETA),
                Click.on(YEAR_TARJETA),
                Enter.theValue(yearTarjeta).into(YEAR_TARJETA),
                Click.on(SUMBIT)
        );
    }

    public static ElegirProducto elegirProducto(){
        return new ElegirProducto();
    }
}
