package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
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
    Faker faker = new Faker();
    private String nameUser = faker.name().username();
    private String password = faker.numerify("#######");
    private String email = faker.internet().emailAddress();

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
                        .conElUsuario(nameUser)
                        .yConElEmail(email)
        );
        theActorInTheSpotlight().attemptsTo(
                llenarRegistro()
                        .conElGenero("Hombre")
                        .laContrasenna(password)
                        .elDia(String.valueOf(faker.number().numberBetween(1,28)))
                        .elMonth(String.valueOf(faker.number().numberBetween(1,12)))
                        .elYear(String.valueOf(faker.number().numberBetween(1975,2005)))
                        .elFirstName(faker.name().firstName())
                        .elLastName(faker.name().lastName())
                        .laCompany(faker.company().name())
                        .laAddress(faker.address().streetAddress())
                        .laAddress2(faker.address().streetAddress())
                        .elPais("Israel")
                        .elEstado(faker.country().name())
                        .laciudad(faker.country().name())
                        .elZipCode(faker.numerify("######"))
                        .yElNumeroCelular(faker.numerify("##########"))
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
                        .conElUsuario("123@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo("Logged in as Pruebas123"))
        );
        quitarDriver();
    }


}
