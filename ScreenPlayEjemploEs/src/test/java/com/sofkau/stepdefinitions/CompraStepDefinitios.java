package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.tasks.FlujoCompra.flujoCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraStepDefinitios extends Configuracion {

    @Dado("que el cliente esta logueado en la pagina principal")
    public void queElClienteEstaLogueadoEnLaPaginaPrincipal() {
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
    }

    @Cuando("agrega varios productos al carrito")
    public void agregaVariosProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

    @Cuando("completa la informacion del formulario del pago")
    public void completaLaInformacionDelFormularioDelPago() {
        theActorInTheSpotlight().attemptsTo(
                flujoCompra()
                        .conElNombreDeTarjeta("Bancolombia")
                        .yConElNumeroDeTarjeta("16125547821")
                        .yConElCVC("302")
                        .yConExpiracionMes("02")
                        .yConExpiracionAnnio("2026")
        );
    }

    @Entonces("mostrara un mensaje confirmando la compra")
    public void mostraraUnMensajeConfirmandoLaCompra() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }
}