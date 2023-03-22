package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.RealizarCompra;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeOrdenPlaced.mensajeOrdenPlaced;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarDatosRegistro.llenarDatosRegistro;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.RealizarCompra.realizarCompra;
import static com.sofkau.tasks.Refrescar.thePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends Configuracion {
    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }

    @Cuando("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistro()
        );

    }

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        Faker faker = new Faker();
        theActorInTheSpotlight().attemptsTo(
                llenarDatosRegistro(),
                thePage()

        );
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        quitarDriver();
    }

    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("juan.pineda@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo("Logged in as Juan Esteban"))
        );
        quitarDriver();
    }

    @Cuando("inicia sesion y completa los campos necesarios para realizar la compra")
    public void iniciaSesionYCompletaLosCamposNecesariosParaRealizarLaCompra() {
        Faker faker = new Faker();
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("juan.pineda@gmail.com")
                        .yConLaContrasenna("123456"),
                realizarCompra()
        );
    }

    @Entonces("el usuario debe ver un mensaje de confirmación de la compra")
    public void elUsuarioDebeVerUnMensajeDeConfirmacionDeLaCompra() {
        theActorInTheSpotlight().should(
                seeThat(mensajeOrdenPlaced(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }
}

