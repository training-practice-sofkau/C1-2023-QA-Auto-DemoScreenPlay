package com.sofkau.Models;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;


public class TarjetaCredito {

    private String numeroTarjetaCredito;
    private String cvcTarjetaCredito;
    private String mesExpiracionTarjetaCredito;
    private String annoExpiracionTarjetaCredito;


    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public String getCvcTarjetaCredito() {
        return cvcTarjetaCredito;
    }

    public String getMesExpiracionTarjetaCredito() {
        return mesExpiracionTarjetaCredito;
    }

    public String getAnnoExpiracionTarjetaCredito() {
        return annoExpiracionTarjetaCredito;
    }

    public TarjetaCredito(String numeroTarjetaCredito, String cvcTarjetaCredito,
                          String mesExpiracionTarjetaCredito, String annoExpiracionTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.cvcTarjetaCredito = cvcTarjetaCredito;
        this.mesExpiracionTarjetaCredito = mesExpiracionTarjetaCredito;
        this.annoExpiracionTarjetaCredito = annoExpiracionTarjetaCredito;
    }

    public TarjetaCredito() {
    }

    public static TarjetaCredito generarTarjetaCredito() {
        Faker faker = new Faker();
        String numeroTarjetaCredito = faker.business().creditCardNumber();
        String cvcTarjetaCredito = String.valueOf(faker.random().nextInt(100, 999));
        String mesExpiracionTarjetaCredito = String.format("%02d", Faker.instance().number().numberBetween(1, 13));
        String annoExpiracionTarjetaCredito = String.valueOf(faker.random().nextInt(2023, 2035));
        return new TarjetaCredito(numeroTarjetaCredito, cvcTarjetaCredito, mesExpiracionTarjetaCredito,
                annoExpiracionTarjetaCredito);
    }

    public Map<String, String> mapTarjetaCredito() {
        Map<String, String> map = new HashMap<>();
        map.put("numero tarjeta credito", numeroTarjetaCredito);
        map.put("cvc tarjeta credito", cvcTarjetaCredito);
        map.put("mes expiracion tarjeta credito", mesExpiracionTarjetaCredito);
        map.put("anno expiracion tarjeta credito", annoExpiracionTarjetaCredito);
        return map;
    }
}
