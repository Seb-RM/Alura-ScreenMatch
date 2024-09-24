package com.aluracursos.screenmacht.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Peliculas extends Titulo implements Clasificacion {

    public  Peliculas(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Película: "+this.getNombre()+"("+getFechaDeLanzamiento()+")";
    }
}
