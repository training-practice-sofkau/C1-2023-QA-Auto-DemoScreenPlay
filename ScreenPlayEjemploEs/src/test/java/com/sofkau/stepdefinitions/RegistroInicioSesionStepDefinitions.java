package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeConfirmacionRegistro.mensajeConfirmacionRegistro;
import static com.sofkau.questions.MensajeConfirmarCompra.mensajeConfirmarCompra;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.RealizarCompra.realizarCompra;
import static com.sofkau.tasks.Registrarse.registrarse;

import static com.sofkau.tasks.AgregarProductos.agregarProductos;
import static com.sofkau.tasks.CompletarRegistro.completarRegistro;
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

//________________________________________________REGISTRO______________________________________________

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                registrarse()
                        .conElName("Pedrito")
                        .conElEmail("Pedrito3@gmail.com"),
                completarRegistro()
                        .conLaPasword("654321")
                        .conElDia("3")
                        .conElMes("1")
                        .conElAnio("1990")
                        .conElFirstName("Ash")
                        .conElLastName("Ketchum")
                        .conLaDireccion("Calle falsa 123")
                        .conElPais("Canada")
                        .conElEstado("Pueblo paleta")
                        .conLaCiudad("Ciudad verde")
                        .conElZipcode("123456789")
                        .conElTelefono("3136399654")
        );

    }

    @Entonces("recibe un mensaje de confirmacion")
    public void recibeUnMensajeDeConfirmacion() {
        theActorInTheSpotlight().should(
                seeThat(mensajeConfirmacionRegistro(), equalTo("ACCOUNT CREATED!"))
        );
        quitarDriver();
    }

//_______________________________________________INICIO_DE_SESION____________________________________________

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

//__________________________________COMPRAS____________________________________________________
    @Cuando("inicia sesion y navega para comprar un producto")
    public void iniciaSesionYNavegaParaComprarUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("juan.pineda@gmail.com")
                        .yConLaContrasenna("123456"),
                agregarProductos(),
                realizarCompra()
        );
    }

    @Entonces("recibe un mensaje de confirmacion de compra")
    public void recibeUnMensajeDeConfirmacionDeCompra() {
        theActorInTheSpotlight().should(
                seeThat(mensajeConfirmarCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }


}
