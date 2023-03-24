package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.Refrescar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.log4j.Logger;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.ComprarProductos.comprar;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.tasks.Registrarse.registrarse;
import static com.sofkau.ui.PaginaFlujoCompra.BOTON_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static com.sofkau.questions.MensajeOrder.mensajeOrder;

public class FlujoDeCompraStepDefinitions extends Configuracion {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(FlujoDeCompraStepDefinitions.class));

    @Dado("que estoy en la pagina web Automation Exercise")
    public void queEstoyEnLaPaginaWebAutomationExercise() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial(),
                navegarAlRegistro()

        );

    }

    @Dado("me he registrado correctamente")
    public void meHeRegistradoCorrectamente() {
        theActorInTheSpotlight().attemptsTo(
                registrarse()
                        .conElNombre("Ana Maria Salazar")
                        .conElEmail("AnaSala20@gmail.com")
                        .conLaContrasennaEnRegistro("amoMiperritaLupi20")
                        .conElNombreDeDireccion("Fatima")
                        .conElApellidoDeDireccion("Parte Alta")
                        .conLaCompannia("Industrias Colombina")
                        .conLaDireccion1("calle 50a #35-115")
                        .conLaDireccion2("apto 401- edificio los Arboles")
                        .conElEstado("Waikato")
                        .conLaCiudad("Hamilton")
                        .conElZipCode("06001")
                        .conElCelular("3127357845")
        );
        thePage();

    }

    @Cuando("agrego productos a mi carrito y continuo todo el flujo de la compra")
    public void agregoProductosAMiCarritoYContinuoTodoElFlujoDeLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                comprar()
                        .yModificoLaCantidad("2")
                        .llenoElNombre("Ana Maria Salazar")
                        .llenoElEmail("AnaSala20@gmail.com")
                        .yLlenoLaDescripcion("Me encanto este jean , de verdad que es super comodo y de buena calidad. Por eso regreso a comprarlo ;)")
                        .creoElMensajeDeAnexo("Por favor entregar a la señora Pepita , muchas gracias.")
                        .ingresoElNombreTarjeta("BBVA")
                        .ingresoElNumeroTarjeta("4263-7896-5263-0023")
                        .ingresoElCVCTarjeta("2320")
                        .ingresoElMMTarjeta("06")
                        .ingresoElYYTarjeta("2026")

        );

    }

    @Entonces("deberia ver un mensaje de confirmacion de compra exitosa")
    public void deberiaVerUnMensajeDeConfirmacionDeCompraExitosa() {

        theActorInTheSpotlight().should(
                seeThat(mensajeOrder(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();

    }
}