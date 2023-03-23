package com.sofkau.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaCarrito.*;
import static com.sofkau.ui.PaginaPagos.*;

public class CompletarCompra implements Task {
    private String nombreTarjetaCredito;
    private String numeroTarjetaCredito;
    private String cvcTarjetaCredito;
    private String mesExpiracionTarjetaCredito;
    private String annoExpiracionTarjetaCredito;

    public CompletarCompra nombreTarjetaCreditoUsuario(String nombreTarjetaCredito) {
        this.nombreTarjetaCredito = nombreTarjetaCredito;
        return this;
    }

    public CompletarCompra numeroTarjetaCreditoUsuario(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        return this;
    }

    public CompletarCompra cvcTarjetaCreditoUsuario(String cvcTarjetaCredito) {
        this.cvcTarjetaCredito = cvcTarjetaCredito;
        return this;
    }

    public CompletarCompra mesExpiracionTarjetaCreditoUsuario(String mesExpiracionTarjetaCredito) {
        this.mesExpiracionTarjetaCredito = mesExpiracionTarjetaCredito;
        return this;
    }

    public CompletarCompra annoExpiracionTarjetaCreditoUsuario(String annoExpiracionTarjetaCredito) {
        this.annoExpiracionTarjetaCredito = annoExpiracionTarjetaCredito;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();
        String mensaje = faker.lorem().sentence();
        actor.attemptsTo(
                Click.on(PROCEDER_CHECKOUT),
                Scroll.to(COMENTARIO_PEDIDO),
                Click.on(COMENTARIO_PEDIDO),
                Enter.theValue(mensaje).into(COMENTARIO_PEDIDO),
                Click.on(GENERAR_PEDIDO),
                Enter.theValue(nombreTarjetaCredito).into(NOMBRE_TARJETA_CREDITO),
                Enter.theValue(numeroTarjetaCredito).into(NUMERO_TARJETA_CREDITO),
                Enter.theValue(cvcTarjetaCredito).into(CVC_TARJETA_CREDITO),
                Enter.theValue(mesExpiracionTarjetaCredito).into(MES_EXPIRACION_TARJETA_CREDITO),
                Enter.theValue(annoExpiracionTarjetaCredito).into(ANNO_EXPIRACION_TARJETA_CREDITO),
                Click.on(PAGAR_Y_CONTINUAR)
        );
    }

    public static CompletarCompra completarCompra() {
        return new CompletarCompra();
    }
}

