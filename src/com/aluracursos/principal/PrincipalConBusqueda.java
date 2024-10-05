package com.aluracursos.principal;
import com.aluracursos.screenmacht.excepcion.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmacht.modelos.Titulo;

import com.aluracursos.screenmacht.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public PrincipalConBusqueda() {
    }

    public static void main(String args[]) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una película: ");
        var busqueda = lectura.nextLine();

        String direccion = "https://www.omdbapi.com/?t="+
                busqueda.replace(" ", "+")+"&apikey=d76964c2";
        try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(response.body());

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        //Titulo miTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);


        //System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println(miTitulo);

            FileWriter escritura = new FileWriter("peliculas.text");
            escritura.write(miTitulo.toString());
            escritura.close();

        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la URI, verifique la dirección");
        } catch (ErrorEnConversionDeDuracionException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Ocurrió un error inesperado.");
        }
        System.out.println("Finalizó la ejecución del programa!");
    }
}
