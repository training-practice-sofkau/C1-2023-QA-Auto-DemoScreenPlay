package com.sofkau.Models;

import com.github.javafaker.Faker;


import java.util.*;


public class Usuario {
    private String nombre;
    private String apellido;
    private String dia;
    private String mes;
    private String anno;
    private String direccion;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String telefono;
    private String password;
    private String email;


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAnno() {
        return anno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Usuario(String nombre, String apellido, String dia, String mes, String anno,
                   String direccion, String pais, String estado, String ciudad, String codigoPostal,
                   String telefono, String password, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.direccion = direccion;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.password = password;
        this.email = email;

    }

    public Usuario() {

    }

    public static Usuario generarUsuario() {
        Faker faker = new Faker(new Locale("en", "CA"));
        String nombre = faker.name().firstName();
        String apellido = faker.name().lastName();
        String dia = String.valueOf(faker.random().nextInt(1, 28));
        String mes = String.valueOf(faker.random().nextInt(1, 12));
        String anno = String.valueOf(faker.random().nextInt(1900, 2021));
        String direccion = faker.address().streetAddress();
        String[] paises = {"India","United States","Canada","Australia","Israel","New Zealand","Singapore"};
        String pais = paises[new Faker().random().nextInt(paises.length)];
        String estado = faker.address().state();
        String ciudad = faker.address().cityName();
        String codigoPostal = faker.address().zipCode();
        String telefono = faker.phoneNumber().phoneNumber();
        String password = faker.internet().password();
        String email = faker.internet().emailAddress();
        return new Usuario(nombre, apellido, dia, mes, anno, direccion, pais, estado, ciudad,
                codigoPostal, telefono, password, email);


    }

    public Map<String, String> mapUsuario() {
        Map<String, String> map = new HashMap<>();
        map.put("nombre", nombre);
        map.put("apellido", apellido);
        map.put("dia", dia);
        map.put("mes", mes);
        map.put("anno", anno);
        map.put("direccion", direccion);
        map.put("pais", pais);
        map.put("estado", estado);
        map.put("ciudad", ciudad);
        map.put("codigoPostal", codigoPostal);
        map.put("telefono", telefono);
        map.put("password", password);
        map.put("email", email);
        return map;
    }
}
