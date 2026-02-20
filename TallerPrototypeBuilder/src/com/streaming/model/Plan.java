package com.streaming.model;

import com.streaming.prototype.PlanPrototype;

public class Plan implements PlanPrototype {

    private String nombre;
    private String calidadVideo;
    private int dispositivos;
    private boolean contenidoExclusivo;
    private boolean descargas;
    private boolean sinPublicidad;
    private boolean soportePrioritario;

    public Plan(String nombre, String calidadVideo, int dispositivos,
                boolean contenidoExclusivo, boolean descargas,
                boolean sinPublicidad, boolean soportePrioritario) {

        this.nombre = nombre;
        this.calidadVideo = calidadVideo;
        this.dispositivos = dispositivos;
        this.contenidoExclusivo = contenidoExclusivo;
        this.descargas = descargas;
        this.sinPublicidad = sinPublicidad;
        this.soportePrioritario = soportePrioritario;
    }

    @Override
    public PlanPrototype clonar() {
        return new Plan(nombre, calidadVideo, dispositivos,
                contenidoExclusivo, descargas,
                sinPublicidad, soportePrioritario);
    }

    public void mostrar() {
        System.out.println("Plan: " + nombre);
        System.out.println("Calidad: " + calidadVideo);
        System.out.println("Dispositivos: " + dispositivos);
        System.out.println("Contenido Exclusivo: " + contenidoExclusivo);
        System.out.println("Descargas: " + descargas);
        System.out.println("Sin Publicidad: " + sinPublicidad);
        System.out.println("Soporte Prioritario: " + soportePrioritario);
        System.out.println("------------------------------");
    }

    // Setters para modificar después de clonar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDispositivos(int dispositivos) {
        this.dispositivos = dispositivos;
    }
}