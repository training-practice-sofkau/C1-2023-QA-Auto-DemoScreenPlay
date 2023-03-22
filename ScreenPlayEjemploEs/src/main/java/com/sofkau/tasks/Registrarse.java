package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import static com.sofkau.ui.PaginaRegistro.*;

public class Registrarse implements Task {
    private String nombre;
    private String correo;
    private String contrasenna;
    private String dia;
    private String mes;
    private String anno;
    private String primerNombre;
    private String apellido;
    private String compannia;
    private String direccion;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String numeroTelefonico;

    public Registrarse conElNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Registrarse conElCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public Registrarse conLaContrasenna(String contrasenna){
        this.contrasenna = contrasenna;
        return this;
    }

    public Registrarse conElDiaDeNacimiento(String dia){
        this.dia = dia;
        return this;
    }

    public Registrarse conElMesDeNacimiento(String mes){
        this.mes = mes;
        return this;
    }

    public Registrarse conElAnnoDeNacimiento(String anno){
        this.anno = anno;
        return this;
    }

    public Registrarse conElPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
        return this;
    }

    public Registrarse conElApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public Registrarse conLaCompannia(String compannia){
        this.compannia = compannia;
        return  this;
    }

    public Registrarse conLaDireccion(String direccion){
        this.direccion = direccion;
        return  this;
    }

    public Registrarse conElPais(String pais){
        this.pais = pais;
        return  this;
    }

    public Registrarse conElEstado(String estado){
        this.estado = estado;
        return  this;
    }

    public Registrarse conLaCiudad(String ciudad){
        this.ciudad = ciudad;
        return  this;
    }

    public Registrarse conElCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return  this;
    }
    public Registrarse conElNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
        return  this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(correo).into(CAMPO_CORREO),
                Click.on(BOTON_REGISTRARSE),
                Click.on(TITULO),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(DIA),
                Click.on(By.cssSelector("select[id='days'] option[value='"+dia+"']")),
                Click.on(MES),
                Click.on(By.xpath("//option[normalize-space()='"+mes+"']")),
                Click.on(ANNO),
                Click.on(By.cssSelector("select[id='years'] option[value='"+anno+"']")),
                Scroll.to(PRIMER_NOMBRE),
                Enter.theValue(primerNombre).into(PRIMER_NOMBRE),
                Enter.theValue(apellido).into(APELLIDO),
                Enter.theValue(compannia).into(COMPANNIA),
                Enter.theValue(direccion).into(DIRECCION),
                Click.on(PAIS),
                Click.on(By.cssSelector("option[value='"+pais+"']")),
                Enter.theValue(estado).into(ESTADO),
                Enter.theValue(ciudad).into(CIUDAD),
                Enter.theValue(codigoPostal).into(CODIGO_POSTAL),
                Enter.theValue(numeroTelefonico).into(NUMERO_TELEFONICO),
                Scroll.to(BOTON_CREAR_CUENTA),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static Registrarse registrarse(){
        return new Registrarse();
    }
}
