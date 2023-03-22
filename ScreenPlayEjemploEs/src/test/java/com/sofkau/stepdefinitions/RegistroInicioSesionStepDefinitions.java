package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.Refrescar;
import com.sofkau.tasks.RegistrUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeConfirmacionCompra.mensajeConfirmacionCompra;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.ComprasProductos.comprasProductos;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.RegistrUsuario.registroUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion  {

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
                registroUsuario().conNombre("Antonio")
                .conEmail("naoz@gmail.com")
                        .conNombreRegistroFormulario("Antonio")
                        .conPassword("1234567")
                        .conDia("12")
                        .conMes("11")
                        .conAnio("2000")
                        .conFirstName("Jesus")
                        .conLastName("Ospina")
                        .condireccion("Mz 23")
                        //.conPais("4")
                        .conEstado("Columbia")
                        .conCiudad("Burnaby")
                        .conCodigoPostal("29044")
                        .conNumeroTelefono("324553")
        );
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
       // quitarDriver();
    }

    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
               iniciarSesion()
                     .conElUsuario("naoz@gmail.com")
                        .yConLaContrasenna("1234567")
       );

    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo("Logged in as Antonio"))
        );

       // quitarDriver();
    }


    //Escenario Comprar producto
    @Cuando("selecciona el producto a comprar")
    public void selecciona_el_producto_a_comprar() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("naoz@gmail.com")
                        .yConLaContrasenna("1234567")

        );
        theActorInTheSpotlight().attemptsTo(
                comprasProductos()
                        .conNombreUsuarioTarjeta("Jorge Lopez")
                        .comNumeroTarjeta("234564355")
                        .comCvc_tarjeta("145")
                        .comMes_vigencia_tarjeta("10")
                        .comAnio_vigencia_tarjeta("2026")
        );

    }
    @Entonces("el usuario debe ver un mensaje pago exitoso")
    public void el_usuario_debe_ver_un_mensaje_pago_exitoso() {
        theActorInTheSpotlight().should(
                seeThat(mensajeConfirmacionCompra(), equalTo("ORDER PLACED!"))
        );

    }

}
