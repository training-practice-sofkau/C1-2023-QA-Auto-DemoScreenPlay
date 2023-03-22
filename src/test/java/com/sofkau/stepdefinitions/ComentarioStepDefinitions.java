package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.Comentar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


import static com.sofkau.questions.MensajeComentario.mensajeComentario;
import static com.sofkau.questions.MensajeOrder.mensajeOrder;
import static com.sofkau.tasks.Comentar.comentar;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ComentarioStepDefinitions extends Configuracion {

    @Dado("que estoy en la pagina web Automation")
    public void queEstoyEnLaPaginaWebAutomation() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()


        );

    }

    @Cuando("elijo el producto y hago el comentario")
    public void elijoElProductoYHagoElComentario() {
        theActorInTheSpotlight().attemptsTo(
                comentar()

        );

    }

    @Entonces("deberia ver un mensaje de agradecimiento por el comentario")
    public void deberiaVerUnMensajeDeAgradecimientoPorElComentario() {
        theActorInTheSpotlight().should(
                seeThat(mensajeComentario(), equalTo("Thank you for your review."))
        );
        quitarDriver();

    }
}
