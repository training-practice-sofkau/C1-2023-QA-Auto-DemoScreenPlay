package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.questions.MensajeAccountCreated.mensajeAccountCreated;
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
import java.util.logging.Logger;

public class StepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((StepDefinitions.class)));

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
    @Entonces("el usuario debe ver de confirmacion de el registro exitoso")
    public void elUsuarioDebeVerDeConfirmacionDeElRegistroExitoso() {
        LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de registro exitoso");
        theActorInTheSpotlight().should(
                seeThat(mensajeAccountCreated(), equalTo("ACCOUNT CREATED!"))
        );
        LOGGER.info("Mensaje de confirmacion de registro exitoso verificado correctamente");
        quitarDriver();
        LOGGER.info("Driver quitado");
    }
    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("james.munoz@gmail.com")
                        .yConLaContrasenna("12345678")
        );
    }
    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        LOGGER.info("Verificando que el usuario vea su nombre en la pagina principal");
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo("Logged in as James Munoz"))
        );
        LOGGER.info("Nombre del usuario verificado correctamente");
        quitarDriver();
        LOGGER.info("Driver quitado");
    }
    @Cuando("inicia sesion y completa los campos necesarios para realizar la compra")
    public void iniciaSesionYCompletaLosCamposNecesariosParaRealizarLaCompra() {
        Faker faker = new Faker();
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("james.munoz@gmail.com")
                        .yConLaContrasenna("12345678"),
                realizarCompra()
        );
    }
    @Entonces("el usuario debe ver un mensaje de confirmacion de la compra")
    public void elUsuarioDebeVerUnMensajeDeConfirmacionDeLaCompra() {
        LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de compra");
        theActorInTheSpotlight().should(
                seeThat(mensajeOrdenPlaced(), equalTo("ORDER PLACED!"))
        );
        LOGGER.info("Mensaje de confirmacion de compra verificado correctamente");
        quitarDriver();
        LOGGER.info("Driver quitado");
    }
}




