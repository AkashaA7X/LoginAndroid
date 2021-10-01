package com.example.formulariobasico;

public class Persona {

    private String user;
    private String clave;

    public Persona(String usuario, String clave) {
        this.user=usuario;
        this.clave=clave;
    }

    public Persona(String usuario) {
        this.user=usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String toString() {
        return "Usuario: "+user+"\tContraseña: "+clave;
    }

}
