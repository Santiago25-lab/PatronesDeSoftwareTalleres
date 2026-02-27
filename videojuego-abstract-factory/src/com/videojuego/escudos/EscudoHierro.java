package com.videojuego.escudos;

public class EscudoHierro implements Escudo {

    @Override
    public void proteger() {
        System.out.println("Escudo de hierro activado 🛡️");
    }
}