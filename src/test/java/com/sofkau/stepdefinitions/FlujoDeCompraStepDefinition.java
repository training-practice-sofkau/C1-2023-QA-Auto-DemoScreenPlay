package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.tasks.FormularioRegistro.formularioRegistro;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sofkau.tasks.ComprarProductos.comprarProductos;


public class FlujoDeCompraStepDefinition extends Configuracion {

    @Dado("que el usuario esta en la pagina de inicio de web automation exercise")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeWebAutomationExercise() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial(),
                navegarAlRegistro()

        );
    }
    @Dado("el usuario ha iniciado sesion")
    public void el_usuario_ha_iniciado_sesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("bryan2321@hotmail.com")
                        .yConLaContrasenna("bryan12345")
        );

        thePage();
    }
    @Cuando("agrego productos al carrito y los compro")
    public void agregoProductosAlCarritoYLosCompro() {
        theActorInTheSpotlight().attemptsTo(
                comprarProductos()
                        .cantidad("2")
                        .nombreTarjeta("Brayan David Polo Cohen")
                        .numeroTarjeta("4729-5937-3758-1187")
                        .CVC("365")
                        .mesTarjeta("11")
                        .annoTarjeta("2024")


        );

    }
    @Entonces("el usuario debe recibir el siguiente mensaje {string}")
    public void elUsuarioDebeRecibirElSiguienteMensaje(String string) {

    }


}
