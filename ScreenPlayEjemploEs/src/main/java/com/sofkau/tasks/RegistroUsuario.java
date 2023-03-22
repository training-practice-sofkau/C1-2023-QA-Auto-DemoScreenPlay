package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import static com.sofkau.ui.CrearUsuario.*;

public class RegistroUsuario implements Task {
    private String nombreUsuario;
    private String correo;
    private String contrasenna;
    private String opcionDia;
    private String opcionMes;
    private String opcionAnio;
    private String nombre;
    private String apellido;
    private String empresa;
    private String direccion1;
    private String direccion2;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String telefono;

    public RegistroUsuario conElNombreDeUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
        return this;
    }

    public RegistroUsuario yConLaCorreo(String correo){
        this.correo=correo;
        return this;
    }

    public RegistroUsuario yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    public RegistroUsuario yConElDia(String opcionDia){
        this.opcionDia=opcionDia;
        return this;
    }

    public RegistroUsuario yConElMes(String opcionMes){
        this.opcionMes=opcionMes;
        return this;
    }

    public RegistroUsuario yConElAnio(String opcionAnio){
        this.opcionAnio=opcionAnio;
        return this;
    }

    public RegistroUsuario yConElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public RegistroUsuario yConElApellido(String apellido){
        this.apellido=apellido;
        return this;
    }

    public RegistroUsuario yConLaEmpresa(String empresa){
        this.empresa=empresa;
        return this;
    }

    public RegistroUsuario yConLaDireccion1(String direccion1){
        this.direccion1=direccion1;
        return this;
    }

    public RegistroUsuario yConLaDireccion2(String direccion2){
        this.direccion2=direccion2;
        return this;
    }

    public RegistroUsuario yConElPais(String pais){
        this.pais=pais;
        return this;
    }

    public RegistroUsuario yConElEstado(String estado){
        this.estado=estado;
        return this;
    }

    public RegistroUsuario yConLaCiudad(String ciudad){
        this.ciudad=ciudad;
        return this;
    }

    public RegistroUsuario yConElCodigoPostal(String codigoPostal){
        this.codigoPostal=codigoPostal;
        return this;
    }

    public RegistroUsuario yConElTelefono(String telefono){
        this.telefono=telefono;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(correo).into(CAMPO_CORREO),
                Click.on(BOTON_REGISTRO_USUARIO),
                Click.on(RADIO_GENERO),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(SELECT_DIA),
                Click.on(By.cssSelector("select[id='days'] option[value='"+opcionDia+"']")),
                Click.on(SELECT_MES),
                Click.on(By.xpath("//option[normalize-space()='"+opcionMes+"']")),
                Click.on(SELECT_ANIO),
                Click.on(By.cssSelector("select[id='years'] option[value='"+opcionAnio+"']")),
                Scroll.to(CAMPO_NOMBRE),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(empresa).into(CAMPO_EMPRESA),
                Enter.theValue(direccion1).into(CAMPO_DIRECCION1),
                Enter.theValue(direccion2).into(CAMPO_DIRECCION2),
                Click.on(CAMPO_PAIS),
                Click.on(By.xpath("//option[normalize-space()='"+pais+"']")),
                Enter.theValue(estado).into(CAMPO_ESTADO),
                Enter.theValue(ciudad).into(CAMPO_CIUDAD),
                Enter.theValue(codigoPostal).into(CAMPO_CODIGO_POSTAL),
                Enter.theValue(telefono).into(CAMPO_NUMERO_TELEFONO),
                Scroll.to(BOTON_CREATE_CUENTA),
                Click.on(BOTON_CREATE_CUENTA)
        );
    }

    public static RegistroUsuario registroUsuario(){
        return new RegistroUsuario();
    }
}
