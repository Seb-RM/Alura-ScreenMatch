package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en la plataforma");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en este momento");
        } else {
            System.out.println("Agrégalo a tu lista para verlo después");
        }
    }
}
