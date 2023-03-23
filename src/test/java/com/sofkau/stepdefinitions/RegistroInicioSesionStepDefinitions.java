package com.sofkau.stepdefinitions;

import com.sofkau.Models.TarjetaCredito;
import com.sofkau.Models.Usuario;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

import static com.sofkau.questions.MensajeCompraExitosa.mensajeCompraExitosa;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeRegistroExitoso.mensajeRegistroExitoso;
import static com.sofkau.tasks.AdicionarProducto.adicionarProducto;
import static com.sofkau.tasks.CompletarCompra.completarCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.FinalizarRegistro.completarRegistro;
import static com.sofkau.tasks.Registro.registrarse;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistroInicioSesionStepDefinitions extends Configuracion {
    private static final Logger logger = LogManager.getLogger(RegistroInicioSesionStepDefinitions.class);
    private static Map<String, String> datosUsuario;
    private static Map<String, String> datosTarjetaCredito;


    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        logger.info("Step - que el usuario esta en la pagina de inicio");
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
            logger.info("Step finalizado satisfactoriamente");

        } catch (Exception e) {
            logger.error("Error en el step que el usuario esta en la pagina de inicio: " + e.getMessage());
            quitarDriver();
        }
    }

    @Cuando("navega hasta el formulario de registro")
    public void navegaHastaElFormularioDeRegistro() {
        logger.info("Step - navega hasta el formulario de registro");
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAlRegistro()
            );
            logger.info("Step finalizado satisfactoriamente");

        } catch (Exception e) {
            logger.error("Error en el step navega hasta el formulario de registro: " + e.getMessage());
            quitarDriver();
        }
    }

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        Usuario usuario = Usuario.generarUsuario();
        datosUsuario = usuario.mapUsuario();
        String nombreCompleto = datosUsuario.get("nombre") + " " + datosUsuario.get("apellido");
        logger.info("Step - Llena todos los campos");
        try {
            theActorInTheSpotlight().attemptsTo(
                    registrarse()
                            .nombreCompletoUsuario(nombreCompleto)
                            .correoUsuario(datosUsuario.get("email")),
                    completarRegistro()
                            .passwordUsuario(datosUsuario.get("password"))
                            .diaNacimiento(datosUsuario.get("dia"))
                            .mesNacimiento(datosUsuario.get("mes"))
                            .annoNacimiento(datosUsuario.get("anno"))
                            .nombreUsuario(datosUsuario.get("nombre"))
                            .apellidoUsuario(datosUsuario.get("apellido"))
                            .direccionUsuario(datosUsuario.get("direccion"))
                            .paisUsuario(datosUsuario.get("pais"))
                            .estadoUsuario(datosUsuario.get("estado"))
                            .ciudadUsuario(datosUsuario.get("ciudad"))
                            .codigoPostalUsuario(datosUsuario.get("codigoPostal"))
                            .telefonoUsuario(datosUsuario.get("telefono"))

            );
            logger.info("Step finalizado satisfactoriamente");
        } catch (Exception e) {
            logger.error("Error en el step Llena todos los campos: " + e.getMessage());
            quitarDriver();
        }
    }


    @Entonces("recibe un mensaje de finalizacion del registro")
    public void recibe_un_mensaje_de_finalizacion_del_registro() {
        logger.info("Step - recibe un mensaje de finalizacion del registro");
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeRegistroExitoso(), equalTo("ACCOUNT CREATED!"))
            );
            logger.info("Step finalizado satisfactoriamente");
            quitarDriver();
        } catch (AssertionError e) {
            logger.error("Error en el step recibe un mensaje de finalizacion del registro: " + e.getMessage());
            quitarDriver();
            throw new AssertionError("La asercion del mensaje final fallo", e);
        }
    }

    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        logger.info("Step - completa los campos para iniciar sesion");
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(datosUsuario.get("email"))
                            .yConLaContrasenna(datosUsuario.get("password"))
            );
            logger.info("Step finalizado satisfactoriamente");
        } catch (Exception e) {
            logger.error("Error en el step completa los campos para iniciar sesion: " + e.getMessage());
            quitarDriver();
        }

    }

    @Entonces("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        logger.info("Step - el usuario debe ver su nombre en la pagina principal");
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeNombre(), equalTo("Logged in as " + datosUsuario.get("nombre") + " " + datosUsuario.get("apellido")))
            );
            logger.info("Step finalizado satisfactoriamente");
            quitarDriver();
        } catch (AssertionError e) {
            logger.error("Error en el step el usuario debe ver su nombre en la pagina principal: " + e.getMessage());
            quitarDriver();
            throw new AssertionError("La asercion del mensaje final fallo", e);
        }
    }

    @Cuando("ha iniciado sesion")
    public void ha_iniciado_sesion() {
        logger.info("Step - ha iniciado sesion");
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(datosUsuario.get("email"))
                            .yConLaContrasenna(datosUsuario.get("password"))
            );
            logger.info("Step finalizado satisfactoriamente");
        } catch (Exception e) {
            logger.error("Error en el step ha iniciado sesion: " + e.getMessage());
            quitarDriver();
        }

    }

    @Cuando("Selecciona los productos a comprar")
    public void selecciona_los_productos_a_comprar() {
        logger.info("Step - Selecciona los productos a comprar");
        try {
            TarjetaCredito tarjetaCredito = TarjetaCredito.generarTarjetaCredito();
            datosTarjetaCredito = tarjetaCredito.mapTarjetaCredito();
            String nombreCompleto = datosUsuario.get("nombre") + " " + datosUsuario.get("apellido");
            theActorInTheSpotlight().attemptsTo(
                    adicionarProducto(),
                    completarCompra()
                            .nombreTarjetaCreditoUsuario(nombreCompleto)
                            .numeroTarjetaCreditoUsuario(datosTarjetaCredito.get("numero tarjeta credito"))
                            .cvcTarjetaCreditoUsuario(datosTarjetaCredito.get("cvc tarjeta credito"))
                            .mesExpiracionTarjetaCreditoUsuario(datosTarjetaCredito.get("mes expiracion tarjeta credito"))
                            .annoExpiracionTarjetaCreditoUsuario(datosTarjetaCredito.get("anno expiracion tarjeta credito"))
            );
            logger.info("Step finalizado satisfactoriamente");
        } catch (Exception e) {
            logger.error("Error en el step Selecciona los productos a comprar: " + e.getMessage());
            quitarDriver();
        }
    }

    @Entonces("Recibe una confirmacion de su compra")
    public void recibe_una_confirmacion_de_su_compra() {
        logger.info("Step - Recibe una confirmacion de su compra");
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeCompraExitosa(), equalTo("Congratulations! Your order has been confirmed!"))
            );
            logger.info("Step finalizado satisfactoriamente");
            quitarDriver();
        } catch (AssertionError e) {
            logger.error("Error en el step Recibe una confirmacion de su compra: " + e.getMessage());
            quitarDriver();
            throw new AssertionError("La asercion del mensaje final fallo", e);

        }
    }
}

