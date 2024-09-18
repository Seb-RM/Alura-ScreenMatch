package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmacht.modelos.Peliculas;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Peliculas pelicula){
        tiempoTotal+= pelicula.getDuracionEnMinutos();
    };
}
