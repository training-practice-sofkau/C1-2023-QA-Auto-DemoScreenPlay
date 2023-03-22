package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.EscogerProductos.escogerProductos;
import static com.sofkau.tasks.HacerPago.hacerPago;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarRegistro.llenarRegistro;
import static com.sofkau.tasks.LlenarRegistro.nombreUsuario;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Refrescar.thePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(RegistroInicioSesionStepDefinitions.class);
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


    @Cuando("Llena todos los campos del resgistro")
    public void llena_todos_los_campos_del_resgistro() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistro(),
                llenarRegistro()

        );
    }

    @Entonces("puede ver un mensaje con su nombre")
    public void puede_ver_un_mensaje_con_su_nombre() {
        try {
            String nombreUsuario = nombreUsuario();
            theActorInTheSpotlight().should(
                    seeThat(mensajeNombre(), equalTo(nombreUsuario)));
            LOGGER.info(mensajeNombre()+ " = " + nombreUsuario  );
        }catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }

        quitarDriver();
}}
