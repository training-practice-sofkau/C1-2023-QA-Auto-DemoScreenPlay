package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static com.sofkau.ui.PaginaFormularioRegistro.*;

public class FinalizarRegistro implements Task {

    private String password;
    private String nombre;
    private String apellido;
    private String direccion;
    private String dia;
    private String mes;
    private String anno;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String telefono;

    public FinalizarRegistro passwordUsuario(String password) {
        this.password = password;
        return this;
    }

    public FinalizarRegistro nombreUsuario(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public FinalizarRegistro apellidoUsuario(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public FinalizarRegistro direccionUsuario(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public FinalizarRegistro diaNacimiento(String dia) {
        this.dia = dia;
        return this;
    }

    public FinalizarRegistro mesNacimiento(String mes) {
        this.mes = mes;
        return this;
    }

    public FinalizarRegistro annoNacimiento(String anno) {
        this.anno = anno;
        return this;
    }

    public FinalizarRegistro paisUsuario(String pais) {
        this.pais = pais;
        return this;
    }

    public FinalizarRegistro estadoUsuario(String estado) {
        this.estado = estado;
        return this;
    }

    public FinalizarRegistro ciudadUsuario(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public FinalizarRegistro codigoPostalUsuario(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    public FinalizarRegistro telefonoUsuario(String telefono) {
        this.telefono = telefono;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(CAMPO_CONTRASENA),
                SelectFromOptions.byValue(dia).from(CAJA_DIA_NACIMIENTO),
                SelectFromOptions.byValue(mes).from(CAJA_MES_NACIMIENTO),
                SelectFromOptions.byValue(anno).from(CAJA_ANNO_NACIMIENTO),
                Scroll.to(CAMPO_NOMBRE),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(direccion).into(CAMPO_DIRECCION_1),
                SelectFromOptions.byValue(pais).from(CAJA_PAIS),
                Enter.theValue(estado).into(CAMPO_ESTADO),
                Enter.theValue(ciudad).into(CAMPO_CIUDAD),
                Enter.theValue(codigoPostal).into(CAMPO_CODIGO_POSTAL),
                Enter.theValue(telefono).into(CAMPO_TELEFONO),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static FinalizarRegistro completarRegistro() {
        return new FinalizarRegistro();
    }
}
