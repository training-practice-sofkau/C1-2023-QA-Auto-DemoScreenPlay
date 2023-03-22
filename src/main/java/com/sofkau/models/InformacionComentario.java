package com.sofkau.models;

import com.github.javafaker.Faker;

public class InformacionComentario {
    private String nombre;
    private String email;
    private String mensaje;

    Faker faker = new Faker();

    public InformacionComentario() {
        this.nombre= faker.name().fullName();
        this.email = faker.internet().emailAddress();
        this.mensaje= faker.expression("Me encanto este producto para mi primita , es de muy buena calidad y le gusto tanto que no se lo quita de encima :)");

    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getMensaje() {
        return mensaje;
    }
}
