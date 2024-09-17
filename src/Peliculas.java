public class Peliculas {

    String nombre;

    int fechaDeLanzamiento;

    int duracionEnMinutos;

    boolean incluidoEnElPlan;

    double sumaDeLasEvaluaciones;

    int totalDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la película es; "+nombre);
        System.out.println("Su fecha de Lanzamiento fue: "+fechaDeLanzamiento);
        System.out.println("Su duración en minutos es: "+duracionEnMinutos);
    };

    void evalua(double nota){
        sumaDeLasEvaluaciones +=nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return  sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
