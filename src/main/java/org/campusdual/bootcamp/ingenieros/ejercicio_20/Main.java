package org.campusdual.bootcamp.ingenieros.ejercicio_20;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

public class Main {
    public static void main(String[] args) {
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);

        Ficheros.leerArchivoCSV("animales.csv");

        System.out.println(Animal.getListAnimals().size());
    }
}
