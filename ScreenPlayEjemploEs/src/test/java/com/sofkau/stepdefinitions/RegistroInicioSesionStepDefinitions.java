package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.RegistrarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeCompraExitosa.mensajeCompraExitosa;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistroUsuarioNuevo.mensajeRegistroUsuarioNuevo;
import static com.sofkau.tasks.CompletarCampos.completarCampos;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.SeleccionarProducto.seleccionarProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static com.sofkau.tasks.RegistrarUsuario.registrarUsuario;

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
                registrarUsuario()
                        .conElUsuarioNuevo("Yeison Osorio")
                        .yConLaContrasennaNueva("yeisonBuitrago@gmail.com"),


                completarCampos()
                        .yConElGenero("Hombre")
                        .yConElPaswword("123")
                        .yConElDia("7")
                        .yconElMes("12")
                        .yconElAnio("2020")
                        .yconElPrimerNombre(faker.name().firstName())
                        .yconElSegundoNombre(faker.name().lastName())
                        .yconLaCompania(faker.company().name())
                        .yConLaDireccion(faker.address().streetAddress())
                        .yConLaDireccion2(faker.address().streetAddress())
                        .yConElPais("India")
                        .yConElEstado(faker.country().name())
                        .yConLaCiudad(faker.country().name())
                        .yConLaZipcode("5505")
                        .yConElCelular("3105978412")
        );


    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeRegistroUsuarioNuevo(), equalTo("ACCOUNT CREATED!"))
        );

        quitarDriver();
    }


    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("yeisonBuitrago@gmail.com")
                        .yConLaContrasenna("123")

        );


    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo(" Logged in as Yeison Osorio"))
        );

        quitarDriver();
    }


    @Cuando("completa los campos para iniciar sesion y comprar productos y proceder a pagar")
    public void completaLosCamposParaIniciarSesionYComprarProductosYProcederAPagar() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("yeisonBuitrago@gmail.com")
                        .yConLaContrasenna("123"),

                seleccionarProducto()
                        .conLaNombreTarjeta("YEISON OSORIO")
                        .yConLaCardNumber("1234 6543 6354")
                        .yConLaCvc("234")
                        .yConLaExpiration("06")
                        .yConElYear("2020")
        );


    }

    @Entonces("el usuario debe ver un mensaje de compra exitosa")
    public void elUsuarioDebeVerUnMensajeDeCompraExitosa() {

        theActorInTheSpotlight().should(
                seeThat(mensajeCompraExitosa(), equalTo("ORDER PLACED!"))
        );

        quitarDriver();


    }


}
