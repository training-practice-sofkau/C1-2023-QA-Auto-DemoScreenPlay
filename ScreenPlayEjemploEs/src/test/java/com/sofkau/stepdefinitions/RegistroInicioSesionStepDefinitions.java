package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.log4j.Logger;
import org.junit.Assert;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeOrder.mensajeOrder;
import static com.sofkau.tasks.Comprar.comprar;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarCamposRegistro.llenarCamposRegistro;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Registrarse.registrarse;
import static com.sofkau.ui.PaginaCamposRegistro.ACCOUNT_CREATED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroInicioSesionStepDefinitions extends Configuracion {

    public static Logger LOGGER= Logger.getLogger(RegistroInicioSesionStepDefinitions.class);

    Faker faker = new Faker();

    private String name = faker.name().firstName();
    private String email = faker.internet().emailAddress();
    private String password = faker.regexify("[A-Za-z0-9]{8}");

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
                registrarse()
                    .conElUsuario(name)
                    .yConElEmail(email)
        );
        theActorInTheSpotlight().attemptsTo(
                llenarCamposRegistro()
                        .withGender(faker.demographic().sex())
                        .withPassword(password)
                        .withDay(String.valueOf(faker.number().numberBetween(1, 28)))
                        .withMonth(String.valueOf(faker.number().numberBetween(1, 12)))
                        .withYear(String.valueOf(faker.number().numberBetween(1900, 2021)))
                        .withFirstName(name)
                        .withLastName(faker.name().lastName())
                        .withAddress1(faker.address().fullAddress())
                        .withCountry("United States")
                        .withState(faker.address().state())
                        .withCity(faker.address().city())
                        .withZipcode(faker.address().zipCode())
                        .withMobil("31" + faker.number().digits(8))

        );

    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {

        try {
            String expectedMessage = "ACCOUNT CREATED!";
            String actualMessage = Text.of(ACCOUNT_CREATED).viewedBy(theActorInTheSpotlight()).asString();
            LOGGER.info(actualMessage);

            Assert.assertEquals(expectedMessage, actualMessage);
            LOGGER.info("La prueba ha pasado. Se encontro el mensaje esperado: " + actualMessage);

        } catch (AssertionError e) {
            LOGGER.error("La prueba fallo. Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error durante la ejecucion de la prueba. Error: " + e.getMessage());
            throw e;
        }
        //quitarDriver();
    }

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
                seeThat(mensajeNombre(), equalTo("Logged in as Jessica"))
        );

        //quitarDriver();
    }

    @Cuando("completa los campos del formulario para iniciar sesion")
    public void completaLosCamposDelFormularioParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("jessica@gmail.com")
                        .yConLaContrasenna("123456")
        );

    }

    @Entonces("el usuario puede acceder a realizar compras")
    public void elUsuarioPuedeAccederARealizarCompras() {
        theActorInTheSpotlight().attemptsTo(
                comprar()
                        .witchNameOnCard("Jessica")
                        .withCardNumber(faker.number().digits(6))
                        .withCvc(faker.number().digits(3))
                        .withExpiration("06")
                        .withYear("2027")
        );

        theActorInTheSpotlight().should(
                seeThat(mensajeOrder(), equalTo("ORDER PLACED!"))
        );

    }


}
