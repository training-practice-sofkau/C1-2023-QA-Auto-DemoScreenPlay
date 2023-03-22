package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.RefrescarPagina.refrescar;
import static com.sofkau.ui.CategoriaCompra.*;

public class FlujoCompra implements Task {

    private String nombreTarjeta;
    private String numeroTarjeta;
    private String cvc;
    private String expiracionMes;
    private String expiracionAnio;

    public FlujoCompra conElNombreDeTarjeta(String nombreTarjeta){
        this.nombreTarjeta=nombreTarjeta;
        return this;
    }

    public FlujoCompra yConElNumeroDeTarjeta(String numeroTarjeta){
        this.numeroTarjeta=numeroTarjeta;
        return this;
    }

    public FlujoCompra yConElCVC(String cvc){
        this.cvc=cvc;
        return this;
    }

    public FlujoCompra yConExpiracionMes(String expiracionMes){
        this.expiracionMes=expiracionMes;
        return this;
    }

    public FlujoCompra yConExpiracionAnnio(String expiracionAnio){
        this.expiracionAnio=expiracionAnio;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_CATEGORIA_MUJER),
                Click.on(OPCION_TOPS),
                refrescar(),
                Scroll.to(BOTON_AGREGAR_PRODUCTO1),
                Click.on(BOTON_AGREGAR_PRODUCTO1),
                Click.on(BOTON_AGREGAR_PRODUCTO),
                Click.on(BOTON_CONTINUAR_COMPRA),
                Click.on(OPCION_CATEGORIA_MUJER),
                Click.on(OPCION_TOPS),
                Click.on(BOTON_AGREGAR_PRODUCTO2),
                Click.on(BOTON_AGREGAR_PRODUCTO),
                Click.on(ENLACE_VER_CARRITO),
                Click.on(BOTON_REALIZAR_PAGO),
                Scroll.to(BOTON_REALIZAR_PEDIDO),
                Click.on(BOTON_REALIZAR_PEDIDO),
                Enter.theValue(nombreTarjeta).into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(numeroTarjeta).into(CAMPO_NUMERO_TARJETA),
                Enter.theValue(cvc).into(CAMPO_CVC),
                Enter.theValue(expiracionMes).into(CAMPO_EXPIRACION_MES),
                Enter.theValue(expiracionAnio).into(CAMPO_EXPIRACION_ANIO),
                Click.on(BOTON_PAGAR)
        );
    }

    public static FlujoCompra flujoCompra(){
        return new FlujoCompra();
    }
}