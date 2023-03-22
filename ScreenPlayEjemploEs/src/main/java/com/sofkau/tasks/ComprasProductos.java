package com.sofkau.tasks;

import com.sofkau.ui.PaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.CompraProducto.*;
import static com.sofkau.ui.PaginaRegistro.CAMP_CREAR_USUARIO_NOMBRE;


public class ComprasProductos implements Task{

    private String nombreUsuarioTarjeta;
    private String numeroTarjeta;
    private String cvc_tarjeta;
   private String mes_vigencia_tarjeta;
    private String anio_vigencia_tarjeta;

    public ComprasProductos conNombreUsuarioTarjeta(String nombreUsuarioTarjeta){
        this.nombreUsuarioTarjeta = nombreUsuarioTarjeta; return this;}
    public ComprasProductos comNumeroTarjeta(String numeroTarjeta){this.numeroTarjeta = numeroTarjeta; return this;}
    public ComprasProductos comCvc_tarjeta(String cvc_tarjeta){this.cvc_tarjeta = cvc_tarjeta; return this;}
    public ComprasProductos comMes_vigencia_tarjeta(String mes_vigencia_tarjeta){this.mes_vigencia_tarjeta = mes_vigencia_tarjeta; return this;}
    public ComprasProductos comAnio_vigencia_tarjeta(String anio_vigencia_tarjeta ){this.anio_vigencia_tarjeta = anio_vigencia_tarjeta; return this;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CATEGORIA_HOMBRE),
                Click.on(CATEGORIA_HOMBRE),
               Click.on(SECCION_JEANS)
                );

        actor.attemptsTo(
                thePage()
        );

        actor.attemptsTo(
                Click.on(CATEGORIA_HOMBRE),
                Click.on(SECCION_JEANS),
                Click.on(ELECCION_PRODUCTO),
                Click.on(CARRITO_COMPRA),
                Click.on(BOTON_VIEW_CART),
                Click.on(VERIFICAR_PEDIDO),
                Click.on(BOTON_REALIZAR_PEDIDO),
                Enter.theValue(nombreUsuarioTarjeta).into(NOMBRE_USUARIO_EN_TARJETA),
                Enter.theValue(numeroTarjeta).into(NUMERO_TARJETA),
                Enter.theValue(cvc_tarjeta).into(CVC_TARJETA),
                Enter.theValue(mes_vigencia_tarjeta).into(MES_VIGENCIA_TARJETA),
                Enter.theValue(anio_vigencia_tarjeta).into(ANIO_VIGENCIA_TARJETA),
                Click.on(BOTON_PAGAR_PRODUCTO)

        );

    }

    public static ComprasProductos comprasProductos(){
        return new ComprasProductos();
    }
}
