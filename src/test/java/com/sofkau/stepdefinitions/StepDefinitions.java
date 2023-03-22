package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarDatosRegistro.llenarDatosRegistro;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
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
                llenarDatosRegistro()
                        .conNombre(faker.name().firstName())
                        .conCorreoElectronico(faker.internet().emailAddress())
                        .conContrasenna1(faker.internet().password())
                        .conDia(String.valueOf(faker.number().numberBetween(1, 28)))
                        .conMes("July")
                        .conAnio(String.valueOf(faker.number().numberBetween(1900, 2022)))
                        .conNombrePrimero(faker.name().firstName())
                        .conApellido(faker.name().lastName())
                        .conCompania(faker.company().name())
                        .conDireccion(faker.address().streetAddress())
                        .conPais("Canada")
                        .conEstadoProvincia(faker.address().state())
                        .conCiudad(faker.address().city())
                        .conCodigoPostal(faker.address().zipCode())
                        .conNumeroMovil(faker.phoneNumber().cellPhone())
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
}
