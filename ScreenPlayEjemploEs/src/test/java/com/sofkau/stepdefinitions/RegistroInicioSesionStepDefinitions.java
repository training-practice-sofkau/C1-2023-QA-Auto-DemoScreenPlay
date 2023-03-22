package com.sofkau.stepdefinitions;

import com.sofkau.models.Usuario;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.util.InformacionFormulario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistroExitoso.mensajeRegistroExitoso;
import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.RegistrarUsuario.registrarUsuario;
import static com.sofkau.tasks.ElegirProducto.elegirProducto;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {

    public static final String MENSAJE_CONFIRMACION_REGISTRO = "ACCOUNT CREATED!";
    public static final String CONFIRMACION_COMPRA = "ORDER PLACED!";

    //Background
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

    //Registro

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                registrarUsuario()
                        .conElNombre("Andres")
                        .conElCorreo("kibedos810@oniecan.com")
                        .conElPassword("123456")
                        .conElFirstName("Andres")
                        .conElApellido("Yepes")
                        .conLaDireccion("calle30A76-49")
                        .conElEstado("Ontario")
                        .conLaCiudad("Toronto")
                        .conElCodigoPostal("L4K")
                        .conElCelular("55523654780")

        );
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeRegistroExitoso(), equalTo(MENSAJE_CONFIRMACION_REGISTRO))
        );
        quitarDriver();
    }

    // Iniciar sesion

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

    // Compra productos

    @Cuando("completa el formulario para iniciar sesion")
    public void completaElFormularioParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("legasi4530@oniecan.com")
                        .yConLaContrasenna("123456")
        );
    }

    @Cuando("elige un producto para comprar")
    public void eligeUnProductoParaComprar() {
        theActorInTheSpotlight().attemptsTo(
                elegirProducto()
                        .conElNombreTarjeta("Andres")
                        .conElNumeroTarjeta("1234567890")
                        .conCvcTarjeta("311")
                        .conMesTarjeta("03")
                        .conYearTarjeta("2024")
        );
    }

    @Entonces("el usuario debe recibir un mensaje de confirmacion de compra")
    public void elUsuarioDebeRecibirUnMensajeDeConfirmacionDeCompra() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo(CONFIRMACION_COMPRA))
        );
        quitarDriver();
    }


}
