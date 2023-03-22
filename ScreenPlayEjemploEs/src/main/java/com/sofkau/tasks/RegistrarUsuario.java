package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.FormularioRegistro.*;
import static com.sofkau.ui.PaginaRegistro.*;


public class RegistrarUsuario implements Task {

    private String nombre;
    private String email;
    private String password;
    private String firstName;
    private String apellido;
    private String direccion;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String celular;

    public RegistrarUsuario conElNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public RegistrarUsuario conElCorreo(String email){
        this.email = email;
        return this;
    }

    public RegistrarUsuario conElPassword(String password){
        this.password = password;
        return this;
    }

    public RegistrarUsuario conElFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public RegistrarUsuario conElApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public RegistrarUsuario conLaDireccion(String direccion){
        this.direccion = direccion;
        return this;
    }

    public RegistrarUsuario conElPais(String pais){
        this.pais = pais;
        return this;
    }

    public RegistrarUsuario conElEstado(String estado){
        this.estado = estado;
        return this;
    }

    public RegistrarUsuario conLaCiudad(String ciudad){
        this.ciudad = ciudad;
        return this;
    }

    public RegistrarUsuario conElCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return this;
    }

    public RegistrarUsuario conElCelular(String celular){
        this.celular = celular;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(email).into(CAMPO_CORREO),
                Click.on(BOTON_REGISTRAR),
                Enter.theValue(password).into(PASSWORD),
                Scroll.to(NOMBRE),
                Enter.theValue(firstName).into(NOMBRE),
                Enter.theValue(apellido).into(APELLIDO),
                Enter.theValue(direccion).into(DIRECCION),
                Scroll.to(PAIS),
                Click.on(PAIS),
                Click.on(ELEGIR_PAIS),
                Enter.theValue(estado).into(ESTADO),
                Enter.theValue(ciudad).into(CIUDAD),
                Enter.theValue(codigoPostal).into(CODIGO_POSTAL),
                Enter.theValue(celular).into(CELULAR),
                Click.on(REGISTRAR)
        );
    }

    public static RegistrarUsuario registrarUsuario(){
        return new RegistrarUsuario();
    }
}
