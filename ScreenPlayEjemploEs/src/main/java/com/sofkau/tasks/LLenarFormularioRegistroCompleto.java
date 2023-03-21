package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRedireccionamientoRegistroCompleto.*;
import static com.sofkau.ui.PaginaRegistro.*;

public class LLenarFormularioRegistroCompleto   implements Task {


    private String  contrasenna;
    private String email;
    private String apellido;

    private String segundoApellido;
    private String state;
    private String city;
    private String zipCode;
    private  String numeroCelular;

    public LLenarFormularioRegistroCompleto conLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElCorreo(String correo){
        this.email =correo;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElApellido(String apellido){
        this.apellido =apellido;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElSegundoApellido(String segundoApellido){
        this.segundoApellido =segundoApellido;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElState(String state){
        this.state =state;
        return this;
    }


    public LLenarFormularioRegistroCompleto yElCity(String city){
        this.city =city;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElZipCode(String zipCode){
        this.zipCode =zipCode;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElNumeroCelular(String numeroCelular){
        this.numeroCelular =numeroCelular;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            //    Click.on(SELECCION_GENERO),
                //Enter.theValue(contrasenna).into(CAMPO_NAME_NEW_USER),
                //Enter.theValue(email).into(CAMPO_EMAIL_NEW_USER),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(segundoApellido).into(CAMPO_SEGUNDO_APELLIDO),
              //  Enter.theValue()
                Enter.theValue(state).into(CAMPO_STATE),
                Enter.theValue(city).into(CAMPO_CITY),
                Enter.theValue(zipCode).into(CAMPO_ZIP_CODE),
                Enter.theValue(numeroCelular).into(CAMPO_NUMERO_CELULAR),
                Click.on(BOTON_CREATE_ACCOUNT)



        );
    }



    public static LLenarFormularioRegistroCompleto lLenarFormularioRegistroCompleto(){
        return new LLenarFormularioRegistroCompleto();
    }
}
