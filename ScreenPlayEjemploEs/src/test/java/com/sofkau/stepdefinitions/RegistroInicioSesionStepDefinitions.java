package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.EscogerProductos.escogerProductos;
import static com.sofkau.tasks.HacerPago.hacerPago;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarRegistro.llenarRegistro;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Refrescar.thePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {

    @Dado("que el usuario esta en la pagina de inicio")
    public void que_el_usuario_esta_en_la_pagina_de_inicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );

    }


    @Cuando("navega hasta el formulario de registro")
    public void navega_hasta_el_formulario_de_registro() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistro()
        );
    }

    @Cuando("Llena todos los campos de resgistro")
    public void llena_todos_los_campos_de_resgistro() {
        theActorInTheSpotlight().attemptsTo(
                llenarRegistro(),
                thePage()
        );
    }


    @Cuando("elige tres productos en su carrito de compras")
    public void elige_tres_productos_en_su_carrito_de_compras() {
        theActorInTheSpotlight().attemptsTo(
                escogerProductos()
        );

    }

    @Cuando("completa los campos de la tarjeta de credito")
    public void completa_los_campos_de_la_tarjeta_de_credito() {
        theActorInTheSpotlight().attemptsTo(
                hacerPago()
        );
    }


    @Entonces("deberia ver un mensaje que la  orden fue aceptada")
    public void deberia_ver_un_mensaje_que_la_orden_fue_aceptada() {

    }



}
