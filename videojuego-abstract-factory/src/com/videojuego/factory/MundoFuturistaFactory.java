package com.videojuego.factory;

import com.videojuego.enemigos.*;
import com.videojuego.armas.*;
import com.videojuego.escudos.*;

public class MundoFuturistaFactory implements MundoFactory {

    @Override
    public Enemigo crearEnemigo() {
        return new Robot();
    }

    @Override
    public Arma crearArma() {
        return new Laser();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoEnergia();
    }
}