package com.videojuego.factory;

import com.videojuego.enemigos.Enemigo;
import com.videojuego.armas.Arma;
import com.videojuego.escudos.Escudo;

public interface MundoFactory {
    Enemigo crearEnemigo();
    Arma crearArma();
    Escudo crearEscudo();
}