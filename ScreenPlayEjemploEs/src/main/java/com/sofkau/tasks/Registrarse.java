package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.Registro.*;

public class Registrarse implements Task{

    private String usuario;
    private String email;


    public Registrarse conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public Registrarse yConElEmail(String email){
        this.email = email;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_RESGISTRARSE)

        );

    }

    public static Registrarse registrarse(){
        return new Registrarse();
    }

}
