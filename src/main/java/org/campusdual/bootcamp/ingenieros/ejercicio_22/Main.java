package org.campusdual.bootcamp.ingenieros.ejercicio_22;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);

        Ficheros.leerArchivoCSV("animales.csv");

        asignaAnimalesGranjeros();

    }
    public static void asignaAnimalesGranjeros(){

        Granjero.list_granjeros.forEach( granjero -> {
            int id_granjero = granjero.getId_granjero();
            ArrayList<Animal> animales_granjero = new ArrayList<>();

            animales_granjero.addAll(
                    Mascota.list_mascotas.stream()
                            .filter(animal -> animal.getPropietario() == id_granjero)
                            .collect(Collectors.toCollection(ArrayList::new))
            );
            animales_granjero.addAll(
                    AnimalGranja.list_granja.stream()
                            .filter(animal -> animal.getPropietario() == id_granjero)
                            .collect(Collectors.toCollection(ArrayList::new))
            );
            granjero.setOwned_Animals(animales_granjero);
            System.out.println("Granjero " + id_granjero + " tiene: " + granjero.getOwned_Animals().size());
        });

    }
}
