import com.aluracursos.screenmacht.modelos.Episodio;
import com.aluracursos.screenmacht.modelos.Peliculas;
import com.aluracursos.screenmacht.modelos.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas();

        miPelicula.setNombre("Encantados");
        miPelicula.setFechaDeLanzamiento(2011);
        miPelicula.setDuracionEnMinutos(135);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.0);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("******************************");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());
        System.out.println("******************************");

        Peliculas segundaPelicula = new Peliculas();
        segundaPelicula.setNombre("Matrix");
        segundaPelicula.setFechaDeLanzamiento(1998);
        segundaPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(segundaPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones: "+calculadora.getTiempoTotal());
        System.out.println("******************************");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Episodio Número uno");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(30);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Peliculas();
        peliculaDeBruno.setNombre("El seño de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Peliculas> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(segundaPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: "+listaDePeliculas.size());
        System.out.println("La primera película es: "+listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);
        System.out.println("toString de la película: "+listaDePeliculas.get(0).toString());
    }
}
