package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.tasks.BuscarProductos1.buscarProductos1;
import static com.sofkau.tasks.BuscarProductos2.buscarProductos2;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarDatosDePago.llenarDatosDePago;
import static com.sofkau.tasks.RefrescarPagina.refrescarPagina;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraStepDefinition extends Configuracion {

    Faker faker = new Faker();

    @Cuando("Inicio sesion en la pagina")
    public void inicioSesionEnLaPagina() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("123@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }

    @Cuando("Seleccione y pague un producto")
    public void seleccioneYPagueUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                buscarProductos1(),
                refrescarPagina(),
                buscarProductos2(),
                llenarDatosDePago()
                        .conElNombre(faker.name().firstName())
                        .conCardNumber(faker.numerify("#########"))
                        .conElCVC(faker.numerify("###"))
                        .conElMes(String.valueOf(faker.number().numberBetween(1,12)))
                        .conElYear(String.valueOf(faker.number().numberBetween(2023,2030)))
        );
    }
    @Entonces("el usuario debera ver un mensaje de compra exitosa")
    public void elUsuarioDeberaVerUnMensajeDeCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }
}
