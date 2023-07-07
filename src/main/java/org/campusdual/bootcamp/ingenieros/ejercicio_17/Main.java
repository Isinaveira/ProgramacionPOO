package org.campusdual.bootcamp.ingenieros.ejercicio_17;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){
        generaAnimales();
        Granjero g1 = new Granjero("Isaac", 1);
        Granjero g2 = new Granjero("Laura", 2);
        Granjero g3 = new Granjero("Messi", 3);
        System.out.println("Animales iniciales: " + Animal.getListAnimals().size());
        //PARA MAS GENERACIONES CAMBIAR EN ANIMAL LA CONSTANTE MAX_NUM_CRIAS A UN NUMERO MENOR DE 3
        for(int i = 0; i < 3 ; i++)
            reproduction();
        System.out.println(Animal.getListAnimals().size());
    }
    public static void generaAnimales(){

        Gato gato_m1 = new Gato( "siamesa", SexType.MACHO , "Garfield", 1);
        Gato gato_h1 = new Gato( "siamesa", SexType.HEMBRA , "Bella", 2 );
        Gato gato_h2 = new Gato( "siamesa", SexType.HEMBRA , "Micha", 2 );

        Perro perro_m1 = new Perro( "Salchicha", SexType.MACHO, "Fuet", 3);
        Perro perro_h1 = new Perro( "Boxer", SexType.HEMBRA, "Perla", 3);
        Perro perro_h2 = new Perro( "Boxer", SexType.HEMBRA, "Gomi", 3);


        Oveja oveja_m1 = new Oveja(  "Churra", SexType.MACHO, 2);
        Oveja oveja_h1 = new Oveja(  "Merina", SexType.HEMBRA, 2);
        Oveja oveja_h2 = new Oveja("Merina",   SexType.HEMBRA,2);

        Vaca vaca_m1 = new Vaca(  "Rubia", SexType.MACHO, 1);
        Vaca vaca_h1 = new Vaca(  "Manchega", SexType.HEMBRA, 2);
        Vaca vaca_h2 = new Vaca(  "Manchega", SexType.HEMBRA, 2);

        Tucan tucan_m1 = new Tucan( "Tucan Hispanis", SexType.MACHO);
        Tucan tucan_h1 = new Tucan( "Tucan Hispanis", SexType.HEMBRA);
        Tucan tucan_h2 = new Tucan( "Tucan Hispanis", SexType.HEMBRA);

        PezPayaso pezPayaso_m1 = new PezPayaso( "Payasus Maximus", SexType.MACHO);
        PezPayaso pezPayaso_h1 = new PezPayaso("Payasus Maximus", SexType.HEMBRA);
        PezPayaso pezPayaso_h2 = new PezPayaso("Payasus Maximus", SexType.HEMBRA);
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
