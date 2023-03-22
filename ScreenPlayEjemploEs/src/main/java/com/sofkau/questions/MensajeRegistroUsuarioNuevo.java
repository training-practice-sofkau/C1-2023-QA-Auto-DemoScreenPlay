package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ConfirmarRegistroUsuarioNuevo.MENSAJE_FINAL_REGISTRO;

public class MensajeRegistroUsuarioNuevo implements Question<String> {



    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FINAL_REGISTRO.resolveFor(actor).getText();
    }

    public static MensajeRegistroUsuarioNuevo mensajeRegistroUsuarioNuevo(){
        return new MensajeRegistroUsuarioNuevo();
    }







}
