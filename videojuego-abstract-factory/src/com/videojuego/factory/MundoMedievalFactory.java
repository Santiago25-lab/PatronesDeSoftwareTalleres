package com.videojuego.factory;

import com.videojuego.enemigos.*;
import com.videojuego.armas.*;
import com.videojuego.escudos.*;

public class MundoMedievalFactory implements MundoFactory {

    @Override
    public Enemigo crearEnemigo() {
        return new Dragon();
    }

    @Override
    public Arma crearArma() {
        return new Espada();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHierro();
    }
}