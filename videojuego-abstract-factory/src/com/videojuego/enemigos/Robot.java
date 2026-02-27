package com.videojuego.enemigos;

public class Robot implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El Robot dispara rayos láser 🤖");
    }
}