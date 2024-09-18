import com.aluracursos.screenmacht.modelos.Peliculas;

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
    }
}
