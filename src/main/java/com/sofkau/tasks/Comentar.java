package com.sofkau.tasks;

import com.sofkau.models.InformacionComentario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.PaginaComentar.*;

public class Comentar implements Task {


    InformacionComentario i = new InformacionComentario();

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(OPCION_PRODUCTOS),
            thePage(),
            Scroll.to(OPCION_KIDS),
            Click.on(OPCION_KIDS),
            Scroll.to(VER_PRODUCTO_BUSITOROSADO),
            Click.on(VER_PRODUCTO_BUSITOROSADO),
            Enter.theValue(i.getNombre()).into(CAMPO_NOMBRE_COMENTARIO),
            Enter.theValue(i.getEmail()).into(CAMPO_EMAIL_COMENTARIO),
            Enter.theValue(i.getMensaje()).into(CAMPO_MENSAJE_COMENTARIO),
            Click.on(BOTON_ENVIAR)

    );

    }
    public static Comentar comentar(){
        return new Comentar();
    }





}
