package com.example.formulariobasico;

public class Persona {

    private String usuario;
    private String clave;

    public Persona(String usuario,String clave){
        this.usuario=usuario;
        this.clave=clave;
    }

    public String getUsuario(){
        return usuario;
    }


}
