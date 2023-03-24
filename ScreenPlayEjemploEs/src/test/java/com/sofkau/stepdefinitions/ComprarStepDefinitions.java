package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.AgregarProductosCarrito.agregarProductosCarrito;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Pagar.pagar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ComprarStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(ComprarStepDefinitions.class);

    @Dado("que el usuario esta logueado en la pagina principal")
    public void queElUsuarioEstaLogueadoEnLaPaginaPrincipal() {

        try {
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );

            theActorInTheSpotlight().attemptsTo(
                    navegarAlRegistro(),
                    iniciarSesion()
                            .conElUsuario("juan.pineda@gmail.com")
                            .yConLaContrasenna("123456")
            );

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @Cuando("realiza una orden de compra con productos en el carrito")
    public void realizaUnaOrdenDeCompraConProductosEnElCarrito() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    agregarProductosCarrito()
            );

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @Cuando("completa la informacion de pago")
    public void completaLaInformacionDePago() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    pagar().conLosDatos("Mastercard", "1234567", "123", "07", "2025")
            );

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @Entonces("debera observar un mensaje de confirmacion de la compra")
    public void deberaObservarUnMensajeDeConfirmacionDeLaCompra() {

        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
            );
            quitarDriver();
        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

}
