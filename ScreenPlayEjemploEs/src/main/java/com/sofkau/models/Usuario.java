package com.sofkau.models;

import com.github.javafaker.Faker;

public class Usuario {
    private String nombre;
    private String apellido;
    private String emailUsuario;
    private String empresa;
    private String estado;
    private String ciudad;
    private String codigoZip;
    private String celular;
    private String direccion;
    private String contrasenna;

    Faker faker = new Faker();

    public Usuario() {
        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.emailUsuario = faker.internet().emailAddress();
        this.celular = faker.phoneNumber().cellPhone();
        this.contrasenna = faker.internet().password();
        this.estado = faker.nation().capitalCity();
        this.ciudad =  faker.nation().capitalCity();
        this.codigoZip = faker.idNumber().invalid();
        this.empresa = faker.company().name();
        this.direccion = faker.address().city();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoZip() {
        return codigoZip;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContrasenna() {
        return contrasenna;
    }
}
