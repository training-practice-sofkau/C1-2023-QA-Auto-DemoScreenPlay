package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionComentario.MENSAJE_COMENTARIO;

public class MensajeComentario  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_COMENTARIO.resolveFor(actor).getText();
    }
    public static MensajeComentario mensajeComentario(){
        return new MensajeComentario();
    }
}
