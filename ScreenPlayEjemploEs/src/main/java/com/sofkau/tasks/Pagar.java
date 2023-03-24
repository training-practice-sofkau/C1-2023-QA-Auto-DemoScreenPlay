package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaPago.*;

public class Pagar implements Task {
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String cvc;
    private String mesExpiracion;
    private String anioExpiracion;

    public Pagar conLosDatos (String nombreTarjeta, String numeroTarjeta, String cvc, String mesExpiracion, String anioExpiracion) {
        this.nombreTarjeta = nombreTarjeta;
        this.numeroTarjeta= numeroTarjeta;
        this.cvc = cvc;
        this.mesExpiracion = mesExpiracion;
        this.anioExpiracion = anioExpiracion;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreTarjeta).into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(numeroTarjeta).into(CAMPO_NUMERO_TARJETA),
                Enter.theValue(cvc).into(CAMPO_CVC),
                Enter.theValue(mesExpiracion).into(CAMPO_MES),
                Enter.theValue(anioExpiracion).into(CAMPO_ANIO),
                Click.on(BOTON_PAGAR)
        );
    }

    public static Pagar pagar() {return new Pagar();}
}
