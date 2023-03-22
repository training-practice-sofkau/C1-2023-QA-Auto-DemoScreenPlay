package com.sofkau.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

import java.text.DateFormatSymbols;
import java.util.Locale;

import static com.sofkau.ui.PaginaDatosRegistro.*;
import static com.sofkau.ui.PaginaRegistro.*;


public class LlenarDatosRegistro implements Task {

    private String nombre;
    private String correoElectronico;
    private String contrasenna1;
    private String dia;
    private String mes;
    private String anio;
    private String nombrePrimero;
    private String apellido;
    private String compania;
    private String direccion;
    private String pais;
    private String estadoProvincia;
    private String ciudad;
    private String codigoPostal;
    private String numeroMovil;

    public LlenarDatosRegistro conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public LlenarDatosRegistro conCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }
    public LlenarDatosRegistro conContrasenna1(String contrasenna1) {
        this.contrasenna1 = contrasenna1;
        return this;
    }

    public LlenarDatosRegistro conDia(String dia) {
        this.dia = dia;
        return this;
    }

    public LlenarDatosRegistro conMes(String mes) {
        this.mes = mes;
        return this;
    }

    public LlenarDatosRegistro conAnio(String anio) {
        this.anio = anio;
        return this;
    }

    public LlenarDatosRegistro conNombrePrimero(String nombrePrimero) {
        this.nombrePrimero = nombrePrimero;
        return this;
    }

    public LlenarDatosRegistro conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public LlenarDatosRegistro conCompania(String compania) {
        this.compania = compania;
        return this;
    }

    public LlenarDatosRegistro conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public LlenarDatosRegistro conPais(String pais) {
        this.pais = pais;
        return this;
    }

    public LlenarDatosRegistro conEstadoProvincia(String estadoProvincia) {
        this.estadoProvincia = estadoProvincia;
        return this;
    }

    public LlenarDatosRegistro conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public LlenarDatosRegistro conCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    public LlenarDatosRegistro conNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();

        actor.attemptsTo(
                Enter.theValue(faker.name().firstName()).into(REGISTRO_USUARIO),
                Enter.theValue(faker.internet().emailAddress()).into(REGISTRO_EMAIL),
                Click.on(BOTON_REGISTRO2),
                Click.on(TITULO_GENERO_MASCULINO),
                Enter.theValue(faker.internet().password()).into(CAMPO_CONTRASENNA1),
                Click.on(MENU_DESPEGABLE_DIA),
                Click.on(By.xpath("//option[contains(text(),'"+faker.number().numberBetween(1, 31)+"')]")),
                Click.on(MENU_DESPEGABLE_MES),
                Click.on(By.xpath("//option[contains(text(),'July')]")),
                Click.on(MENU_DESPEGABLE_ANIO),
                Click.on(By.xpath("//option[contains(text(),'"+faker.number().numberBetween(1950, 2003)+"')]")),
                Enter.theValue(faker.name().firstName()).into(CAMPO_NOMBRE_PRIMERO),
                Enter.theValue(faker.name().lastName()).into(CAMPO_NOMBRE_APELLIDO),
                Enter.theValue(faker.company().name()).into(CAMPO_COMPANIA),
                Enter.theValue(faker.address().streetAddress()).into(CAMPO_DIRECCION),
                Click.on(MENU_DESPEGABLE_PAIS),
                Click.on(By.xpath("//option[contains(text(),'India')]")),
                Enter.theValue(faker.address().state()).into(CAMPO_ESTADO_PROVINCIA),
                Enter.theValue(faker.address().city()).into(CAMPO_CIUDAD),
                Enter.theValue(faker.address().zipCode()).into(CAMPO_CODIGO_POSTAL),
                Enter.theValue(faker.phoneNumber().cellPhone()).into(CAMPO_NUMERO_MOVIL),
                Click.on(BOTON_CREAR_CUENTA),
                Click.on(BOTON_CONTINUE)
        );
    }

    public static LlenarDatosRegistro llenarDatosRegistro() {
        return new LlenarDatosRegistro();
    }
}

