package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

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

    private String company;
    private String address;
    private String dia;
    private String mes;
    private String anio;
    private String pais;


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

    public LLenarFormularioRegistroCompleto yElCompany(String company){
        this.company =company;
        return this;
    }


    public LLenarFormularioRegistroCompleto yElAddress(String address){
        this.address =address;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElDia(String dia){
        this.dia =dia;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElMes(String mes){
        this.mes =mes;
        return this;
    }
    public LLenarFormularioRegistroCompleto yElAnio(String anio){
        this.anio =anio;
        return this;
    }

    public LLenarFormularioRegistroCompleto yElPais(String pais){
        this.pais =pais;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //  Click.on(SELECCION_GENERO),
                Enter.theValue(contrasenna).into(CAMPO_REGISTRO_PASSWORD),
                SelectFromOptions.byValue(dia).from(DESPLEGABLE_DIA),
                SelectFromOptions.byValue(mes).from(DESPLEGABLE_MES),
                SelectFromOptions.byValue(anio).from(DESPLEGABLE_ANIO),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(segundoApellido).into(CAMPO_SEGUNDO_APELLIDO),
                Enter.theValue(company).into(CAMPO_COMPANY),
                Enter.theValue(address).into(CAMPO_ADDRESS),
                SelectFromOptions.byValue(pais).from(SELECCION_PAIS),
             //   Enter.theValue(pais).into(SELECCION_PAIS),
                Enter.theValue(state).into(CAMPO_STATE),
                Enter.theValue(city).into(CAMPO_CITY),
                Enter.theValue(zipCode).into(CAMPO_ZIP_CODE),
                Enter.theValue(numeroCelular).into(CAMPO_NUMERO_CELULAR),
                Scroll.to(BOTON_CREATE_ACCOUNT),
                Click.on(BOTON_CREATE_ACCOUNT)
        );
    }



    public static LLenarFormularioRegistroCompleto lLenarFormularioRegistroCompleto(){
        return new LLenarFormularioRegistroCompleto();
    }
}
