package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.sofkau.ui.PaginaIngresoDatosRegistro.*;

public class Registrarse implements Task {
    private String name;
    private String email;
    private String contrasennaRegistro;
    private String nombreDireccion;
    private String apellidoDireccion;
    private String compannia;
    private String direccion1;
    private String direccion2;
    private String estado;
    private String ciudad;
    private String zipcode;
    private String celular;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CAMPO_NAME),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_SIGNUP),
                        Click.on(CHECK_GENERO),
                Enter.theValue(contrasennaRegistro).into(CAMPO_CONTRASENNA_REGISTRO),
                Scroll.to(CAMPO_DIA),
                Click.on(CAMPO_DIA),
                        Click.on(CAMPO_DIA_6),
                Click.on(CAMPO_MES),
                        Click.on(CAMPO_MES_9),
                        Click.on(CAMPO_ANNO),
                        Click.on(CAMPO_ANNO_2002),
                Click.on(CAMPO_NEWSLETTER),
                        Click.on(CAMPO_OFFERS),
                Enter.theValue(nombreDireccion).into(CAMPO_NAME_ADDRESS),
                Enter.theValue(apellidoDireccion).into(CAMPO_LASTNAME_ADDRESS),
                Enter.theValue(compannia).into(CAMPO_COMPANNIA),
                Enter.theValue(direccion1).into(CAMPO_ADDRESS1),
                Scroll.to(CAMPO_ADDRESS2),
                Enter.theValue(direccion2).into(CAMPO_ADDRESS2),
                Click.on(CAMPO_COUNTRY),
                        Click.on(CAMPO_COUNTRY_NEW_ZEALAND),
                Enter.theValue(estado).into(CAMPO_STATE),
                Enter.theValue(ciudad).into(CAMPO_CITY),
                Enter.theValue(zipcode).into(CAMPO_ZIPCODE),
                Enter.theValue(celular).into(CAMPO_MOBILENUMBER),
                        Click.on(BOTON_CREATE_ACCOUNT),
                Click.on(BOTON_CONTINUE)
        );



    }
    public  Registrarse conElNombre(String name){
        this.name= name;
        return this;
    }
    public  Registrarse conElEmail(String email){
        this.email= email;
        return this;
    }

    public  Registrarse conLaContrasennaEnRegistro(String contrasennaRegistro){
        this.contrasennaRegistro= contrasennaRegistro;
        return this;
    }

    public  Registrarse conElNombreDeDireccion(String nombreDireccion){
        this.nombreDireccion= nombreDireccion;
        return this;
    }
    public  Registrarse conElApellidoDeDireccion(String apellidoDireccion){
        this.apellidoDireccion= apellidoDireccion;
        return this;
    }
    public  Registrarse conLaCompannia(String compannia){
        this.compannia= compannia;
        return this;
    }
    public  Registrarse conLaDireccion1(String direccion1){
        this.direccion1= direccion1;
        return this;
    }
    public  Registrarse conLaDireccion2(String direccion2){
        this.direccion2= direccion2;
        return this;
    }

    public  Registrarse conElEstado(String estado){
        this.estado= estado;
        return this;
    }
    public  Registrarse conLaCiudad(String ciudad){
        this.ciudad= ciudad;
        return this;
    }
    public  Registrarse conElZipCode(String zipcode){
        this.zipcode= zipcode;
        return this;
    }
    public  Registrarse conElCelular(String celular){
        this.celular= celular;
        return this;
    }
    public static Registrarse registrarse(){
        return new Registrarse();
    }






}
