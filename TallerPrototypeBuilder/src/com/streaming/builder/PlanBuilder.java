package com.streaming.builder;

import com.streaming.model.Plan;

public class PlanBuilder {

    private String nombre;
    private String calidadVideo;
    private int dispositivos;
    private boolean contenidoExclusivo;
    private boolean descargas;
    private boolean sinPublicidad;
    private boolean soportePrioritario;

    public PlanBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PlanBuilder setCalidadVideo(String calidadVideo) {
        this.calidadVideo = calidadVideo;
        return this;
    }

    public PlanBuilder setDispositivos(int dispositivos) {
        this.dispositivos = dispositivos;
        return this;
    }

    public PlanBuilder setContenidoExclusivo(boolean contenidoExclusivo) {
        this.contenidoExclusivo = contenidoExclusivo;
        return this;
    }

    public PlanBuilder setDescargas(boolean descargas) {
        this.descargas = descargas;
        return this;
    }

    public PlanBuilder setSinPublicidad(boolean sinPublicidad) {
        this.sinPublicidad = sinPublicidad;
        return this;
    }

    public PlanBuilder setSoportePrioritario(boolean soportePrioritario) {
        this.soportePrioritario = soportePrioritario;
        return this;
    }

    public Plan build() {
        return new Plan(nombre, calidadVideo, dispositivos,
                contenidoExclusivo, descargas,
                sinPublicidad, soportePrioritario);
    }
}