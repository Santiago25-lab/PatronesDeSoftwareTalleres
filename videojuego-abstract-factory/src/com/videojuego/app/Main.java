package com.videojuego.app;

import com.videojuego.factory.*;
import com.videojuego.enemigos.Enemigo;
import com.videojuego.armas.Arma;
import com.videojuego.escudos.Escudo;

public class Main {

    public static void main(String[] args) {

        MundoFactory factory;

        // Cambia aquí para probar diferentes mundos
        String mundo = "futurista";

        if (mundo.equalsIgnoreCase("medieval")) {
            factory = new MundoMedievalFactory();
        } else {
            factory = new MundoFuturistaFactory();
        }

        Enemigo enemigo = factory.crearEnemigo();
        Arma arma = factory.crearArma();
        Escudo escudo = factory.crearEscudo();

        enemigo.atacar();
        arma.usar();
        escudo.proteger();
    }
}