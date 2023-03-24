package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeConfirmacion.mensajeConfirmacion;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.EscogerProductos.escogerProductos;
import static com.sofkau.tasks.HacerPago.hacerPago;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarRegistro.nombreUsuario;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.NavegarProductos.navegarProductos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AgregarProductos extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(RegistroInicioSesionStepDefinitions.class);
    @Dado("que el usuario se logea")
    public void que_el_usuario_se_logea() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial(),
                navegarAlRegistro(),
                iniciarSesion()

        );
    }

    @Cuando("navega hasta productos")
    public void navega_hasta_productos() {
        theActorInTheSpotlight().attemptsTo(
                navegarProductos()
        );
    }


    @Cuando("escoge  productos en su carrito y pagar con su tarjeta de credito")
    public void escoge_productos_en_su_carrito_y_pagar_con_su_tarjeta_de_credito() {
        theActorInTheSpotlight().attemptsTo(
                escogerProductos(),
                hacerPago()
        );
    }


    @Entonces("puede ver un mensaje de confirmacion de compra")
    public void puede_ver_un_mensaje_de_confirmacion_de_compra() {
        try {
            String nombreUsuario = nombreUsuario();
            theActorInTheSpotlight().should(
                    seeThat(mensajeConfirmacion(), equalTo("Congratulations! Your order has been confirmed!")));
            LOGGER.info(mensajeConfirmacion() + " =  Congratulations! Your order has been confirmed!"  );
        }catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }

        quitarDriver();
    }


}
