package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.PaginaFlujoCompra.*;

public class ComprarProductos implements Task {
    private String cantidadLiana;
    private String name;
    private String email;
    private String descripcion;
    private String mensaje;
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String cvc;
    private String mm;
    private String yy;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Refrescar.thePage(),
                Click.on(BOTON_PRODUCTS),
                Click.on(OPCION_MADAME),
                Click.on(VER_PRODUCTO_LIANA_PAVO_REAL),
                Enter.theValue(cantidadLiana).into(CAMPO_CANT_LIANA),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_SEGUIR_COMPRANDO),
                Click.on(OPCION_POLO),
                Click.on(VER_PRODUCTO_JEAN),
                Enter.theValue(name).into(OPCION_NAME),
                Enter.theValue(email).into(OPCION_EMAIL),
                Enter.theValue(descripcion).into(OPCION_DESCRIPCION),
                Click.on(BOTON_SUBMIT),
                Click.on(BOTON_AGREGAR_CARRITO_JEAN),
                Click.on(BOTON_VER_CARRITO_JEAN),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue(mensaje).into(CAMPO_MENSAJE_ANEXO),
                Click.on(BOTON_HACER_ORDEN),
                Enter.theValue(nombreTarjeta).into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(numeroTarjeta).into(CAMPO_NUMERO_TARJETA),
                Enter.theValue(cvc).into(CAMPO_CVC),
                Enter.theValue(mm).into(CAMPO_MM),
                Enter.theValue(yy).into(CAMPO_YY),
                Click.on(BOTON_PAY)
        );

    }
    public  ComprarProductos cliqueandoEnProductos(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos enLaOpcionMadame(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos veoElProductoLiana(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos yModificoLaCantidad(String cantidadLiana){
        this.cantidadLiana= cantidadLiana;
        return this;
    }
    public  ComprarProductos enLaOpcionPolo(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos veoElJean(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos llenoElNombre(String name){
        this.name= name;
        return this;
    }
    public  ComprarProductos llenoElEmail(String email){
        this.email= email;
        return this;
    }
    public  ComprarProductos yLlenoLaDescripcion(String descripcion){
        this.descripcion= descripcion;
        return this;
    }
    public  ComprarProductos creoElMensajeDeAnexo(String mensaje){
        this.mensaje= mensaje;
        return this;
    }
    public  ComprarProductos ingresoElNombreTarjeta(String nombreTarjeta){
        this.nombreTarjeta= nombreTarjeta;
        return this;
    }
    public  ComprarProductos ingresoElNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta= numeroTarjeta;
        return this;
    }
    public  ComprarProductos ingresoElCVCTarjeta(String cvc){
        this.cvc= cvc;
        return this;
    }
    public  ComprarProductos ingresoElMMTarjeta(String mm){
        this.mm= mm;
        return this;
    }
    public  ComprarProductos ingresoElYYTarjeta(String yy){
        this.yy= yy;
        return this;
    }
    public static ComprarProductos comprar(){
        return new ComprarProductos();
    }

}
