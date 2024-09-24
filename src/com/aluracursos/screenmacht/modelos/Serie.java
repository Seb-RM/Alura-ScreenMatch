package com.aluracursos.screenmacht.modelos;

public class Serie extends Titulo {

    public  Serie(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }

    int temporadas;

    int episodiosPorTemporada;

    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporadas;
    }

    public void setTemporada(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
