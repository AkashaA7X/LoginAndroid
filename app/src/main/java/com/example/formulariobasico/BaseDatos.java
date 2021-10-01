package com.example.formulariobasico;

import java.util.ArrayList;

public class BaseDatos {
    static ArrayList<Persona> lista= new ArrayList<>();

    BaseDatos() {
        lista.add(new Persona("user1","1111"));
        lista.add(new Persona("user2","2222"));
        lista.add(new Persona("user3","3333"));
    }
}
