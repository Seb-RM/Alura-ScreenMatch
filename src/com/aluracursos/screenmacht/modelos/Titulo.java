package com.aluracursos.screenmacht.modelos;

public class Titulo {

    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la película es; "+nombre);
        System.out.println("Su fecha de Lanzamiento fue: "+fechaDeLanzamiento);
        System.out.println("Su duración en minutos es: "+ getDuracionEnMinutos());
    };

    public void evalua(double nota){
        sumaDeLasEvaluaciones +=nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return  sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

}
