package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistro.mensajeRegistro;
import static com.sofkau.tasks.ComprarProducto.comprarProducto;
import static com.sofkau.tasks.FormularioRegistro.formularioRegistro;
import static com.sofkau.tasks.IniciarRegistro.iniciarRegistro;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistroInicioSesionStepDefinitions extends Configuracion {

    Faker faker = new Faker();

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
                        .conName(faker.name().username())
                        .conEmail(faker.internet().emailAddress()));
        theActorInTheSpotlight().attemptsTo(
                formularioRegistro()
                        .seleccionaGenero("Mujer")
                        .yPassword("123456")
                        .yDay(String.valueOf(faker.number().numberBetween(1,28)))
                        .yMonth(String.valueOf(faker.number().numberBetween(1,12)))
                        .yYear(String.valueOf(faker.number().numberBetween(1998,2003)))
                        .yFirstName(faker.name().firstName())
                        .yLastName(faker.name().lastName())
                        .yCompany(faker.company().name())
                        .yAddress1(faker.address().fullAddress().toLowerCase())
                        .yAddress2(faker.address().fullAddress().toLowerCase())
                        .yCountry("Canada")
                        .yState(faker.country().name())
                        .yCity(faker.country().capital())
                        .yZipcode(faker.address().zipCode())
                        .yMobile(faker.regexify("302[0-9]{7}"))

        );
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeRegistro(), equalTo("ACCOUNT CREATED!"))
        );
        quitarDriver();
    }
    @Cuando("Completa los campos para el login y selecciona producto")
    public void completaLosCamposParaElLoginYSeleccionaProducto() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("juan.pineda@gmail.com")
                        .yConLaContrasenna("123456"),
                comprarProducto()
                        .conNombreCard("12345")
                        .yNumeroCard("1234")
                        .yCvc("123")
                        .yMes("11")
                        .yAnio("2024")
        );
    }

    @Entonces("el usuario debe mirar un mensaje de compra exitosa")
    public void elUsuarioDebeMirarUnMensajeDeCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }
    //Inicio de sesion
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




