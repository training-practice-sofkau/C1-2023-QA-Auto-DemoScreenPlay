package com.sofkau.util;

import com.sofkau.models.Usuario;

public class InformacionFormulario {
    Usuario usuario = new Usuario();
    public void diligenciarFormulario(){
        usuario.setFirstName("Checho");
        usuario.setEmail("baniwir528@kaudat.com");
        usuario.setPassword("123456");
        usuario.setApellido("Yepes");
        usuario.setDireccion("Calle30A55-20");
        usuario.setEstado("Ontario");
        usuario.setCiudad("Toronto");
        usuario.setCodigoPostal("L4K");
        usuario.setCelular("5553214568");
    }

    public Usuario getUsuario(){
        return this.usuario;
    }
}
