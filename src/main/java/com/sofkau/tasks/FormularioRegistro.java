package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaRegistro.*;

public class FormularioRegistro implements Task {
    private String nombreInicial;
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private String company;
    private String direccion;
    private String direccionComplemento;
    private String estado;
    private String ciudad;
    private String zipCode;
    private String celular;
    public FormularioRegistro nombreInicial(String nombreInicial){
        this.nombreInicial = nombreInicial;
        return this;
    }

    public FormularioRegistro email (String email){
        this.email = email;
        return this;
    }
    public FormularioRegistro password (String password){
        this.password = password;
        return this;
    }

    public FormularioRegistro nombre (String nombre){
        this.nombre = nombre;
        return this;
    }
    public FormularioRegistro apellido (String apellido){
        this.apellido = apellido;
        return this;
    }
    public FormularioRegistro company (String company){
        this.company = company;
        return this;
    }
    public FormularioRegistro direccion (String direccion){
        this.direccion = direccion;
        return this;
    }
    public FormularioRegistro direccionComplemento(String direccionComplemento){
        this.direccionComplemento = direccionComplemento;
        return this;
    }
    public FormularioRegistro estado (String estado){
        this.estado = estado;
        return this;
    }
    public FormularioRegistro ciudad (String ciudad){
        this.ciudad = ciudad;
        return this;
    }
    public FormularioRegistro zipCode (String zipCode){
        this.zipCode = zipCode;
        return this;
    }

    public FormularioRegistro celular (String celular){
        this.celular = celular;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreInicial).into(CAMPO_NOMBRE),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_SIGNUP),
                Click.on(BOTON_TITLE_MR),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Scroll.to(BOX_DAY),
                Click.on(BOX_DAY),
                Click.on(CAMPO_DAY),
                Click.on(BOX_MONTH),
                Click.on(CAMPO_MONTH),
                Click.on(BOX_YEAR),
                Click.on(CAMPO_YEAR),
                Click.on(BOTON_NEWSLETTER),
                Click.on(BOTON_OFERTAS_ESPECIALES),
                Enter.theValue(nombre).into(CAMPO_NOMBREE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(company).into(CAMPO_COMPANY),
                Enter.theValue(direccion).into(CAMPO_DIRECCION),
                Scroll.to(CAMPO_DIRECCION),
                Enter.theValue(direccionComplemento).into(CAMPO_COMPLEMENTO_DIRECCION),
                Click.on(BOX_COUNTRY),
                Click.on(CAMPO_COUNTRY),
                Enter.theValue(estado).into(CAMPO_ESTADO),
                Enter.theValue(ciudad).into(CAMPO_CITY),
                Enter.theValue(zipCode).into(CAMPO_ZIPCODE),
                Enter.theValue(celular).into(CAMPO_CELULAR),
                Click.on(BOTON_CREAR_CUENTA),
                Click.on(BOTON_CONTINUAR)

        );
    }
    public static FormularioRegistro formularioRegistro(){
        return new FormularioRegistro();
    }
}

