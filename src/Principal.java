public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas();

        miPelicula.nombre = "Encantados";
        miPelicula.fechaDeLanzamiento = 2011;
        miPelicula.duracionEnMinutos = 135;

        System.out.println("Mi película es; "+miPelicula.nombre);
        System.out.println("Su fecha de Lanzamiento fue: "+miPelicula.fechaDeLanzamiento);

        Peliculas otraPelicula = new Peliculas();
        otraPelicula.nombre = "El Descenso";
        otraPelicula.fechaDeLanzamiento = 2003;
        otraPelicula.duracionEnMinutos = 140;

        System.out.println("Mi película es; "+otraPelicula.nombre);
        System.out.println("Su fecha de Lanzamiento fue: "+otraPelicula.fechaDeLanzamiento);
    }
}
