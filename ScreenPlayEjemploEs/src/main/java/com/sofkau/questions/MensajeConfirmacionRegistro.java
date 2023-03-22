package com.sofkau.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmacionMensajeDespuesDeRealizarRegistros.MENSAJE_REGISTRO_EXITOSO;


public class MensajeConfirmacionRegistro  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_REGISTRO_EXITOSO.resolveFor(actor).getText();
    }

    public static MensajeConfirmacionRegistro  mensajeConfirmacionRegistro(){
        return new MensajeConfirmacionRegistro();
    }
}
