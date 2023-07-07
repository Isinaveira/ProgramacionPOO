package org.campusdual.bootcamp.ingenieros.ejercicio_21;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);

        Ficheros.leerArchivoCSV("animales.csv");

        menu();

    }
    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean valid = false;
            while(!valid){
                System.out.println("############# BIENVENIDO AL SERVICIO DE OBTENCION DE ANCESTROS #############");
                System.out.println("\t\tNumero de animales: " + Animal.getListAnimals().size());
                System.out.println("Introduce un valor entre 1 y " + (Animal.getListAnimals().size()-1) +"\n" +
                        "por el contrario pulsa una letra para salir.");
                System.out.print("## Tu eleccion: ");
                String texto = scanner.next();
                try{
                    int num_id = Integer.parseInt(texto);

                    if(num_id >= 1 && num_id <= Animal.getListAnimals().size()-1){
                        Animal animal = AnimalSalvaje.getListAnimals().stream()
                                .filter( a -> a.getId_animal() == num_id)
                                .toArray(Animal[]::new)[0];

                        System.out.println(animal.toString());
                        Animal.obtenAncestros(animal);
                        valid = true;
                    }if(num_id < 1 || num_id > Animal.getListAnimals().size()-1){
                        System.out.println("Introduce un id válido!!");
                    }
                }catch(NumberFormatException e){
                    System.exit(0);
                }
            }
        }


    }
}
