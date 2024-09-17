public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas();

        miPelicula.nombre = "Encantados";
        miPelicula.fechaDeLanzamiento = 2011;
        miPelicula.duracionEnMinutos = 135;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.0);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Peliculas otraPelicula = new Peliculas();
        otraPelicula.nombre = "El Descenso";
        otraPelicula.fechaDeLanzamiento = 2003;
        otraPelicula.duracionEnMinutos = 140;
//        otraPelicula.muestraFichaTecnica();
    }
}
