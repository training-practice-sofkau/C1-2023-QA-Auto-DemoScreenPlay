package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.sofkau.ui.PaginaCompletarRegistro.*;
import static com.sofkau.ui.PaginaRegistro.*;

public class CompletarRegistro implements Task {

    private String password;
    private String firstName;
    private String lastName;
    private String direccion;
    private String dia;
    private String mes;
    private String anio;
    private String pais;
    private String estado;
    private String ciudad;
    private String zipcode;
    private String telefono;

    public CompletarRegistro conLaPasword(String password){
        this.password=password;
        return this;
    }

    public CompletarRegistro conElFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public CompletarRegistro conElLastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public CompletarRegistro conLaDireccion(String direccion){
        this.direccion=direccion;
        return this;
    }

    public CompletarRegistro conElDia(String dia){
        this.dia=dia;
        return this;
    }

    public CompletarRegistro conElMes(String mes){
        this.mes=mes;
        return this;
    }

    public CompletarRegistro conElAnio(String anio){
        this.anio=anio;
        return this;
    }

    public CompletarRegistro conElPais(String pais){
        this.pais=pais;
        return this;
    }

    public CompletarRegistro conElEstado(String estado){
        this.estado=estado;
        return this;
    }

    public CompletarRegistro conLaCiudad(String ciudad){
        this.ciudad=ciudad;
        return this;
    }

    public CompletarRegistro conElZipcode(String zipcode){
        this.zipcode=zipcode;
        return this;
    }

    public CompletarRegistro conElTelefono(String telefono){
        this.telefono=telefono;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(CAMPO_PASSWORD),
                SelectFromOptions.byValue(dia).from(COMBOBOX_DAY),
                SelectFromOptions.byValue(mes).from(COMBOBOX_MONTH),
                SelectFromOptions.byValue(anio).from(COMBOBOX_YEAR),
                Scroll.to(CAMPO_FIRST_NAME),
                Enter.theValue(firstName).into(CAMPO_FIRST_NAME),
                Enter.theValue(lastName).into(CAMPO_LAST_NAME),
                Enter.theValue(direccion).into(CAMPO_DIRECCION1),
                SelectFromOptions.byValue(pais).from(COMBOBOX_PAIS),
                Enter.theValue(estado).into(CAMPO_ESTADO),
                Enter.theValue(ciudad).into(CAMPO_CITY),
                Enter.theValue(zipcode).into(CAMPO_CODE),
                Enter.theValue(telefono).into(CAMPO_TELEFONO),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }


    public static CompletarRegistro completarRegistro(){
      return new CompletarRegistro();
    }
}
