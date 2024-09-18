package com.aluracursos.screenmacht.modelos;

public class Serie extends Titulo {

    int temporadas;

    int episodiosPorTemporada;

    int minutosPorEpisodio;

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
