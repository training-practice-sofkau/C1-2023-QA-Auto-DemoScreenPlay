package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistroUsuario.mensajeRegistroUsuario;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.RegistroUsuario.registroUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinitios.class);

    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try{
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    navegarAlRegistro()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    registroUsuario()
                            .conElNombreDeUsuario("GrettyM")
                            .yConLaCorreo("fato8@etondy.com")
                            .yConLaContrasenna("Q12345+")
                            .yConElDia("12")
                            .yConElMes("January")
                            .yConElAnio("1990")
                            .yConElNombre("Gretty")
                            .yConElApellido("Mosquera")
                            .yConLaEmpresa("SofkaU")
                            .yConLaDireccion1("Cll 78 B #34-45")
                            .yConLaDireccion2("Apt. 104")
                            .yConElPais("Canada")
                            .yConElEstado("California")
                            .yConLaCiudad("San Diego")
                            .yConElCodigoPostal("91911")
                            .yConElTelefono("3102147200")
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        try{
            theActorInTheSpotlight().should(
                    seeThat(mensajeRegistroUsuario(), equalTo("ACCOUNT CREATED!"))
            );
            quitarDriver();
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario("juan.pineda@gmail.com")
                            .yConLaContrasenna("123456")
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        try{
            theActorInTheSpotlight().should(
                    seeThat(mensajeNombre(), equalTo("Logged in as Juan Esteban"))
            );
            quitarDriver();
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }
}