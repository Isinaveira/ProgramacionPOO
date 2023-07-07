package org.campusdual.bootcamp.ingenieros.ejercicio_15;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]){
        generaAnimales();
        ArrayList<Mascota> list_mascotas = new ArrayList<>();
        ArrayList<AnimalSalvaje> list_salvajes = new ArrayList<>();
        ArrayList<AnimalGranja> list_granja = new ArrayList<>();

        Animal.getListAnimals().forEach(a->{
            if(a instanceof  Mascota){
                list_mascotas.add((Mascota) a);
            }
            if(a instanceof  AnimalSalvaje){
                list_salvajes.add((AnimalSalvaje) a);
            }
            if(a instanceof  AnimalGranja){
                list_granja.add((AnimalGranja) a);
            }
        });
        System.out.println("Tamaño salvajes: " +list_salvajes.size());
        System.out.println("Tamaño granja: " +list_granja.size());
        System.out.println("Tamaño mascotas: " +list_mascotas.size());
    }
    public static void generaAnimales(){

        Gato gato_m1 = new Gato( "siamesa", SexType.MACHO , "Garfield", 1);
        Gato gato_h1 = new Gato( "siamesa", SexType.HEMBRA , "Bella", 2 );


        Perro perro_m1 = new Perro( "Salchicha", SexType.MACHO, "Fuet", 3);
        Perro perro_h1 = new Perro( "Boxer", SexType.HEMBRA, "Perla", 3);


        Oveja oveja_m1 = new Oveja(  "Churra", SexType.MACHO, 2);
        Oveja oveja_h1 = new Oveja(  "Merina", SexType.HEMBRA, 2);


        Vaca vaca_m1 = new Vaca(  "Rubia", SexType.MACHO, 1);
        Vaca vaca_h1 = new Vaca(  "Manchega", SexType.HEMBRA, 2);


        Tucan tucan_m1 = new Tucan( "Tucan Hispanis", SexType.MACHO);
        Tucan tucan_h1 = new Tucan( "Tucan Hispanis", SexType.HEMBRA);


        PezPayaso pezPayaso_m1 = new PezPayaso( "Payasus Maximus", SexType.MACHO);
        PezPayaso pezPayaso_h1 = new PezPayaso("Payasus Maximus", SexType.HEMBRA);

    }
}
