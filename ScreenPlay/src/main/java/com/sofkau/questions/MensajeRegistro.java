package com.sofkau.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_REGISTRO;

public class MensajeRegistro implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_REGISTRO.resolveFor(actor).getText();
    }

    public static MensajeRegistro mensajeRegistro(){
        return new MensajeRegistro();
    }
}
