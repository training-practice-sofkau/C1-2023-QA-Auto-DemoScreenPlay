package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.ProceedToPay;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeOrderPlaced.mensajeOrderPlaced;
import static com.sofkau.tasks.AgregarProductos.agregarProductos;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAProductos.navegarAProductos;
import static com.sofkau.tasks.NavegarAlCarrito.navegarAlCarrito;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.PayAndConfirmPage.payAndConfirmPage;
import static com.sofkau.tasks.PlaceOrder.placeOrder;
import static com.sofkau.tasks.ProceedToPay.proceedToPay;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class FlujoCompraStepDefinitions extends Configuracion {

    @Dado("que estoy loggeado en la pagina")
    public void queEstoyLoggeadoEnLaPagina() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial(),
                navegarAlRegistro(),
                iniciarSesion()
                        .conElUsuario("contactowaiterapp@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }
    @Cuando("Agrego los productos al carrito")
    public void agregoLosProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                navegarAProductos(),
                agregarProductos()
        );

    }
    @Cuando("procedo a pagar los productos del carrito")
    public void procedoAPagarLosProductosDelCarrito() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlCarrito(),
                proceedToPay(),
                placeOrder(),
                payAndConfirmPage().withNameOnCard("Juan")
                        .withCardNumber("123456789")
                        .withCVC("312")
                        .withExpirationMonth("02")
                        .withExpirationYear("2027")
        );
    }
    @Entonces("Deberia ver un mensaje indicando la compra exitosa")
    public void deberiaVerUnMensajeIndicandoLaCompraExitosa() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeOrderPlaced(), equalTo("ORDER PLACED!"))
            );
            quitarDriver();
        }catch (Exception e){
            e.getMessage();
        }

    }
}
