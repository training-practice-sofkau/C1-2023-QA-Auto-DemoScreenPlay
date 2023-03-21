package com.sofkau.tasks;

import io.cucumber.java.an.E;
import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.PaginaRegistro.BOTON_SUBMIT;

public class LlenarRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GENERO),
                Scroll.to(PRIMERNOMBRE),
                Enter.theValue("123456").into(CONTRASENNA),
                Click.on(DIA),
                Click.on(NUMEMRODIA),
                Click.on(ANNO),
                Click.on(NUMEROANNO),
                Enter.theValue("Efrain").into(PRIMERNOMBRE),
                Enter.theValue("Solorzano").into(APELLIDO),
                Enter.theValue("sofkaU").into(COMPANNIA),
                Scroll.to(CODIGOZIP),
                Enter.theValue("CR50").into(DIRECCION),
                Click.on(PAIS),
                Click.on(NOMBREPAIS),
                Enter.theValue("Uttar Pradesh").into(ESTADO),
                Enter.theValue(" Lucknow").into(CIUDAD),
                Enter.theValue("435433").into(CODIGOZIP),
                Enter.theValue("7879878989").into(CELULAR),
                Scroll.to(CREARCUENNTA),
                Click.on(CREARCUENNTA)


        );
    }

    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();
    }
}
