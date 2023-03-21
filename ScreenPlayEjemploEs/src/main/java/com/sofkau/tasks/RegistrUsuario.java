package com.sofkau.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.sofkau.ui.PaginaRegistro.*;

public class RegistrUsuario implements Task {
    private String usuario;
    private String email;
    private String nombre_registro_formulario;

    private String password;
    private String dia;
    private String mes;
    private String anio;
    private String firstName;
    private String lastName;
    private String direccion;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String numeroTelefono;


    public RegistrUsuario conNombre(String nombre){this.usuario = nombre;return this;}
    public RegistrUsuario conEmail(String email){this.email = email;return this;}
    public RegistrUsuario conNombreRegistroFormulario(String nombreFormulario){this.nombre_registro_formulario = nombreFormulario;return this;}
    public RegistrUsuario conPassword(String password){this.password = password;return this;}
    public RegistrUsuario conDia(String dia){this.dia = dia; return this;}
    public RegistrUsuario conMes(String mes){this.mes = mes; return this;}
    public RegistrUsuario conAnio(String anio){this.anio = anio; return this;}
    public RegistrUsuario conFirstName(String nombre){this.firstName = nombre;return this;}
    public RegistrUsuario conLastName(String apellido){this.lastName = apellido;return this;}
    public RegistrUsuario condireccion(String direccion){this.direccion = direccion;return this;}
    public RegistrUsuario conPais(String pais){this.pais = pais; return this;}
    public RegistrUsuario conEstado(String estado){this.estado = estado; return this;}
    public RegistrUsuario conCiudad(String ciudad){this.ciudad = ciudad; return this;}
    public RegistrUsuario conCodigoPostal(String codigoPostal){this.codigoPostal = codigoPostal; return this;}
    public RegistrUsuario conNumeroTelefono(String numeroTelefono){this.numeroTelefono = numeroTelefono; return this;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMP_CREAR_USUARIO_NOMBRE),
                Enter.theValue(email).into(CAMPO_EMAIL_CREAR_USUARIO),
                Click.on(BOTON_INSCRIBIRSE),
                Click.on(BOTON_GENERO),
                Enter.theValue(nombre_registro_formulario).into(CAMPO_FORMULARIO_NOMBRE),
                Enter.theValue(password).into(CAMPO_FORMULARIO_PASSWORD),
                SelectFromOptions.byValue(dia).from(CAMPO_FORMULARIO_DATEOFBIRT_DIA),
                SelectFromOptions.byValue(mes).from(CAMPO_FORMULARIO_DATEOFBIRT_MES),
                SelectFromOptions.byValue(anio).from(CAMPO_FORMULARIO_DATEOFBIRT_ANIO),
                Enter.theValue(firstName).into(CAMPO_FORMULARIO_FIRST_NAME),
                Enter.theValue(lastName).into(CAMPO_FORMULARIO_LAST_NAME),
                Enter.theValue(direccion).into(CAMPO_FORMULARIO_DIRECCION),
                Click.on(CAMPO_FORMULARIO_PAIS),
                Enter.theValue(estado).into(CAMPO_FORMULARIO_ESTADO),
                Enter.theValue(ciudad).into(CAMPO_FORMULARIO_CIUDAD),
                Enter.theValue(codigoPostal).into(CAMPO_FORMULARIO_CODIGO_POSTAL),
                Enter.theValue(numeroTelefono).into(CAMPO_FORMULARIO_NUM_TELEFONO),
               Click.on(BOTON_CREAR_CUENTA)


        );
    }
    public static RegistrUsuario registroUsuario(){
        return new RegistrUsuario();
    }

}
