package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistro.mensajeRegistro;
import static com.sofkau.tasks.IniciarRegistro.iniciarRegistro;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarRegistro.llenarRegistro;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {

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
        theActorInTheSpotlight().attemptsTo(
                iniciarRegistro()
                        .conElUsuario("Jose Nunez")
                        .yConElEmail("nunezjose@gmail.com")
        );
        theActorInTheSpotlight().attemptsTo(
                llenarRegistro()
                        .conElGenero("Hombre")
                        .laContrasenna("123456")
                        .elDia("5")
                        .elMonth("1")
                        .elYear("2000")
                        .elFirstName("Jose")
                        .elLastName("Rodriguez")
                        .laCompany("Sofka")
                        .laAddress("Calle 15")
                        .laAddress2("Cra 16")
                        .elPais("India")
                        .elEstado("Delhi")
                        .laciudad("Zipa")
                        .elZipCode("946512")
                        .yElNumeroCelular("3104598456")
        );
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeRegistro(), equalTo("ACCOUNT CREATED!"))
        );
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


}
