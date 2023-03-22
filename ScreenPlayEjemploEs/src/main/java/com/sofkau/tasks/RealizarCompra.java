package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.sofkau.ui.PaginaCarritoCompra.*;


public class RealizarCompra implements Task {
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String cvcTarjeta;
    private String mesTarjeta;
    private String anioTarjeta;

    public RealizarCompra conElNombreTarjeta(String nombreTarjeta){
        this.nombreTarjeta=nombreTarjeta;
        return this;
    }
    public RealizarCompra conElNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }

    public RealizarCompra conElCvcTarjeta(String cvcTarjeta){
        this.cvcTarjeta = cvcTarjeta;
        return this;
    }

    public RealizarCompra conElMesTarjeta(String mesTarjeta){
        this.mesTarjeta = mesTarjeta;
        return this;
    }

    public RealizarCompra conElAnioTarjeta(String anioTarjeta){
        this.anioTarjeta = anioTarjeta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IR_AL_CARRITO),
                Click.on(PROCERDER_COMPRA),
                Scroll.to(REALIZAR_PEDIDO),
                Click.on(REALIZAR_PEDIDO),
                Enter.theValue("Pedrito").into(NOMBRE_TARJETA),
                Enter.theValue("1234567887654321").into(NUMERO_TARJETA),
                Enter.theValue("636").into(CVS_TARJETA),
                Enter.theValue("05").into(EXPIRACION_MES_TARJETA),
                Enter.theValue("2025").into(EXPIRACION_ANIO_TARJETA),
                Click.on(PAGAR)
        );
    }

    public static RealizarCompra realizarCompra(){
        return new RealizarCompra();
    }
}
