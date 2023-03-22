package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static com.sofkau.tasks.Registrarse.registrarse;
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
    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                registrarse().conElNombre("Ivan").conElApellido("Gutierrez")
                        .conElEmail("damir29305@etondy.com")
                        .conLaDireccion("Cra 23#13-17")
                        .conElTelefono("+65 6332 3659")
                        .yConLaContrasenna("Prueba.123")
        );
    }
    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        quitarDriver();
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
                seeThat(mensajeNombre(), equalTo("Logged in as Juan Esteban"))
        );
        quitarDriver();
    }
}