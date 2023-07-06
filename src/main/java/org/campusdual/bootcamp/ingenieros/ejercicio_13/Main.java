package org.campusdual.bootcamp.ingenieros.ejercicio_13;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    //static ArrayList<Animal> list_animals = new ArrayList<>();
    static ArrayList<AnimalGranja> list_granja = new ArrayList<>();
    static ArrayList<Mascota> list_mascotas = new ArrayList<>();
    static ArrayList<Animal> list_salvajes = new ArrayList<>();

    public static void main(String [] args){

        //generaAnimalesPadres();
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);

        //for (int i = 0; i<4; i ++)reproduction();
        Ficheros.leerArchivoCSV("animals.csv");
        Ficheros.generaFicheroAnimales("animals", FileTypes.CSV);
        Ficheros.generaFicheroAnimales("animals", FileTypes.JSON);
        Ficheros.generaFicheroAnimales("animals", FileTypes.XML);



        System.out.println(Animal.getListAnimals().size());
        Animal a = Animal.getListAnimals().get(Animal.getListAnimals().size()-1);
        System.out.println(a.getId_animal());
        Animal.obtenAncestros(a).forEach( an-> System.out.println(an.toString()));
    }

    public static void generaAnimalesPadres(){

        Gato gato_m1 = new Gato( "siamesa", SexType.MACHO , "Garfield", 1);
        Gato gato_h1 = new Gato( "siamesa", SexType.HEMBRA , "Bella", 2 );
        Gato gato_h2 = new Gato( "siamesa", SexType.HEMBRA , "Micha", 2 );

        Perro perro_m1 = new Perro( "Salchicha", SexType.MACHO, "Fuet", 3);
        Perro perro_h1 = new Perro( "Boxer", SexType.HEMBRA, "Perla", 3);
        Perro perro_h2 = new Perro( "Boxer", SexType.HEMBRA, "Gomi", 1);

        Oveja oveja_m1 = new Oveja(  "Churra", SexType.MACHO, 2);
        Oveja oveja_h1 = new Oveja(  "Merina", SexType.HEMBRA, 2);
        Oveja oveja_h2 = new Oveja(  "Asturiana", SexType.HEMBRA, 3);

        Vaca vaca_m1 = new Vaca(  "Rubia", SexType.MACHO, 1);
        Vaca vaca_h1 = new Vaca(  "Manchega", SexType.HEMBRA, 2);
        Vaca vaca_h2 = new Vaca(  "India", SexType.HEMBRA, 1);

        Tucan tucan_m1 = new Tucan( "Tucan Hispanis", SexType.MACHO);
        Tucan tucan_h1 = new Tucan( "Tucan Hispanis", SexType.HEMBRA);
        Tucan tucan_h2 = new Tucan( "Tucan Hispanis", SexType.HEMBRA);

        PezPayaso pezPayaso_m1 = new PezPayaso( "Payasus Maximus", SexType.MACHO);
        PezPayaso pezPayaso_h1 = new PezPayaso("Payasus Maximus", SexType.HEMBRA);
        PezPayaso pezPayaso_h2 = new PezPayaso("Payasus Maximus", SexType.HEMBRA);

        /*
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);
        */

        Ficheros.generaFicheroAnimales("fatherAnimals", FileTypes.CSV);
        Ficheros.generaFicheroAnimales("fatherAnimals", FileTypes.JSON);
        Ficheros.generaFicheroAnimales("fatherAnimals", FileTypes.XML);


    }



    public static void reproduction(){
        //lista de clases e iterar sobre clases optimizar

        ArrayList<Animal> males = Animal.getListAnimals().stream()
                                        .filter(animal -> animal.getSexo() == SexType.MACHO)
                                        .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Animal> females = Animal.getListAnimals().stream()
                                        .filter(animal -> animal.getSexo() == SexType.HEMBRA)
                                        .collect(Collectors.toCollection(ArrayList::new));


        males.forEach( male-> {

            ArrayList <Animal> candidates = (ArrayList<Animal>) females.stream().filter(female -> (
                    female.getType().equalsIgnoreCase(male.getType()) &&
                    female.getClass() == male.getClass()
            )).collect(Collectors.toList());

            candidates.forEach( mother ->{
                male.criar(mother);
            });
        });

    }


}
