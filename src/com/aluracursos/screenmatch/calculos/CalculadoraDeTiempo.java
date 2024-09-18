package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmacht.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal+= titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
