import com.aluracursos.screenmacht.modelos.Peliculas;
import com.aluracursos.screenmacht.modelos.Serie;

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
    }
}
