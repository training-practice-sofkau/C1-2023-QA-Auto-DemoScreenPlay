package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Enter;
import static com.sofkau.questions.MensajeConfirmacionRegistro.mensajeConfirmacionRegistro;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LLenarFormularioRegistroCompleto.lLenarFormularioRegistroCompleto;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.RealizarRegistro.realizarRegistro;
import static com.sofkau.ui.PaginaRedireccionamientoRegistroCompleto.CAMPO_APELLIDO;
import static com.sofkau.ui.PaginaRegistro.CAMPO_EMAIL_NEW_USER;
import static com.sofkau.ui.PaginaRegistro.CAMPO_NAME_NEW_USER;
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
                realizarRegistro()
                        .conElNombre("Santy")
                        .yElCorreo("santiokami.23@gmail.com"),

                lLenarFormularioRegistroCompleto()
                        .conLaContrasenna("123456")
                        .yElDia("2")
                        .yElMes("2")
                        .yElAnio("2002")
                        .yElApellido("Ramirez")
                        .yElSegundoApellido("Arenas")
                        .yElCompany("SofkaU")
                        .yElAddress("Calle 123")
                        .yElPais("India")
                        .yElState("California")
                        .yElCity("Los Angeles")
                        .yElZipCode("90001")
                        .yElNumeroCelular("1234567890")

        );

    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeConfirmacionRegistro(), equalTo("ACCOUNT CREATED!"))
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
