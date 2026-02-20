package com.streaming;

import com.streaming.builder.PlanBuilder;
import com.streaming.model.Plan;

public class Main {

    public static void main(String[] args) {

        // 🔹 Crear plan Premium usando Builder
        Plan premium = new PlanBuilder()
                .setNombre("Premium")
                .setCalidadVideo("4K")
                .setDispositivos(4)
                .setContenidoExclusivo(true)
                .setDescargas(true)
                .setSinPublicidad(true)
                .setSoportePrioritario(true)
                .build();

        System.out.println("Plan Premium Original:");
        premium.mostrar();

        // 🔹 Clonar usando Prototype
        Plan premiumEstudiantil = (Plan) premium.clonar();
        premiumEstudiantil.setNombre("Premium Estudiantil");
        premiumEstudiantil.setDispositivos(2);

        System.out.println("Plan Clonado y Modificado:");
        premiumEstudiantil.mostrar();
    }
}