package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistro.mensajeRegistro;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Registrarse.registrarse;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {
    public static Logger LOGGER=Logger.getLogger(RegistroInicioSesionStepDefinitions.class);

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
                    registrarse()
                            .conElNombre("Jesus")
                            .conElCorreo("jesus.4000@gmail.com")
                            .conLaContrasenna("1234567890")
                            .conElDiaDeNacimiento("6")
                            .conElMesDeNacimiento("April")
                            .conElAnnoDeNacimiento("1996")
                            .conElPrimerNombre("Jesus")
                            .conElApellido("Molina")
                            .conLaCompannia("SofkaU")
                            .conLaDireccion("av 4 # 16")
                            .conElPais("United States")
                            .conElEstado("California")
                            .conLaCiudad("Los Angeles")
                            .conElCodigoPostal("90001")
                            .conElNumeroTelefonico("3101234567")
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
                    seeThat(mensajeRegistro(), equalTo("ACCOUNT CREATED!"))
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
