package com.sofkau.tasks;

import com.sofkau.models.Usuario;
import io.cucumber.java.an.E;
import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.UseAnAbility;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;


import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.PaginaRegistro.BOTON_SUBMIT;

public class LlenarRegistro implements Task {

    static Usuario usuario= new Usuario();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getNombre()).into(CAMPO_USUARIO),
                Enter.theValue(usuario.getEmailUsuario()).into(CAMPO_CORREO),
                Click.on(BOTON_SUBMIT),
                Click.on(GENERO),
                Scroll.to(PRIMERNOMBRE),
                Enter.theValue(usuario.getContrasenna()).into(CONTRASENNA),
                Click.on(DIA),
                Click.on(NUMEMRODIA),
                Click.on(ANNO),
                Click.on(NUMEROANNO),
                Scroll.to(DIRECCION),
                Enter.theValue(usuario.getNombre()).into(PRIMERNOMBRE),
                Enter.theValue(usuario.getApellido()).into(APELLIDO),
                Enter.theValue(usuario.getEmpresa()).into(COMPANNIA),
                Scroll.to(CODIGOZIP),
                Enter.theValue(usuario.getDireccion()).into(DIRECCION),
                Click.on(PAIS),
                Click.on(NOMBREPAIS),
                Enter.theValue(usuario.getEstado()).into(ESTADO),
                Enter.theValue(usuario.getCiudad()).into(CIUDAD),
                Enter.theValue(usuario.getCodigoZip()).into(CODIGOZIP),
                Enter.theValue(usuario.getCelular()).into(CELULAR),
                Scroll.to(CREARCUENNTA),
                Click.on(CREARCUENNTA),
                Click.on(BOTONCONTINUA),
                thePage(),
                Click.on(BOTONCONTINUA)

        );


    }
    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();}

    public static String nombreUsuario(){
      return usuario.getNombre();
    };
    public static String emailUsuario(){
        return usuario.getEmailUsuario();
    };
    public static String contrasennaUsuario(){
        return usuario.getContrasenna();
    };
}


