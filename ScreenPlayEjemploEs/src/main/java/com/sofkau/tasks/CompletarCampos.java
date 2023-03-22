package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.sofkau.ui.RegistraCampos.*;

public class CompletarCampos implements Task {


    private String genero;
    private String passwword;
    private String dia;
    private String mes;
    private String anio;
    private String noticias;
    private String primeroNombre;
    private String segundoNombre;
    private String compania;
    private String direccion;
    private String direccion2;
    private String pais;
    private String estado;
    private String ciudad;
    private String zipcode;
    private String celular;


    public CompletarCampos yConElGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public CompletarCampos yConElPaswword(String passwword) {
        this.passwword = passwword;
        return this;
    }


    public CompletarCampos yConElDia(String dia) {
        this.dia = dia;
        return this;
    }

    public CompletarCampos yconElMes(String mes) {
        this.mes = mes;
        return this;
    }

    public CompletarCampos yconElAnio(String anio) {
        this.anio = anio;
        return this;
    }

    public CompletarCampos yconLaNoticias(String noticias) {
        this.noticias = noticias;
        return this;
    }

    public CompletarCampos yconElPrimerNombre(String primeroNombre) {
        this.primeroNombre = primeroNombre;
        return this;
    }

    public CompletarCampos yconElSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
        return this;
    }

    public CompletarCampos yconLaCompania(String compania) {
        this.compania = compania;
        return this;
    }

    public CompletarCampos yConLaDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public CompletarCampos yConLaDireccion2(String direccion2) {
        this.direccion2 = direccion2;
        return this;
    }

    public CompletarCampos yConElPais(String pais) {
        this.pais = pais;
        return this;
    }

    public CompletarCampos yConElEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public CompletarCampos yConLaCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public CompletarCampos yConLaZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public CompletarCampos yConElCelular(String celular) {
        this.celular = celular;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (genero) {
            case "Hombre":
                actor.attemptsTo(
                        Click.on(CAMPO_GENERO_HOMBRE)
                );
                break;
            case "Mujer":
                actor.attemptsTo(
                        Click.on(CAMPO_GENERO_MUJER)
                );


        }

        actor.attemptsTo(
                Enter.theValue(passwword).into(CAMPO_PASSWORD),
                Scroll.to(CAMPO_DAYS),
                SelectFromOptions.byValue(dia).from(CAMPO_DAYS),
                SelectFromOptions.byValue(mes).from(CAMPO_MONTHS),
                SelectFromOptions.byValue(anio).from(CAMPO_YEAR),
                Click.on(CAMPO_NEWSTLETTER),
                Enter.theValue(primeroNombre).into(CAMPO_FIRST_NAME),
                Enter.theValue(segundoNombre).into(CAMPO_LAST_NAME),
                Enter.theValue(compania).into(CAMPO_COMPANY),
                Enter.theValue(direccion).into(CAMPO_ADDRESS),
                Enter.theValue(direccion2).into(CAMPO_ADDRESS2),
                Scroll.to(CAMPO_ADDRESS),
                SelectFromOptions.byValue(pais).from(CAMPO_PAIS),
                Enter.theValue(estado).into(CAMPO_STATE),
                Enter.theValue(ciudad).into(CAMPO_CITY),
                Enter.theValue(zipcode).into(CAMPO_ZIPCODE),
                Enter.theValue(celular).into(CAMPO_MOBILE_NUMBER),
                Click.on(CAMPO_CREATE_ACCOUNT)

        );
    }


    public static CompletarCampos completarCampos() {
        return new CompletarCampos();
    }

}
