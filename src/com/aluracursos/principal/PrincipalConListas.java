package com.aluracursos.principal;

import com.aluracursos.screenmacht.modelos.Peliculas;
import com.aluracursos.screenmacht.modelos.Serie;
import com.aluracursos.screenmacht.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {

        Peliculas miPelicula = new Peliculas("Encantados", 2011);
        Peliculas segundaPelicula = new Peliculas("Matrix", 1998);
        Peliculas peliculaDeBruno = new Peliculas("El seño de los anillos", 2001);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(segundaPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);


        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Peliculas pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println("lista de artistas  no ordenada: "+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("lista de artistas ordenada: "+listaDeArtistas);

        System.out.println("lista de títulos ordenada: "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
