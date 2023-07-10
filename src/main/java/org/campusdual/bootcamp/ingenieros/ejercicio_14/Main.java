package org.campusdual.bootcamp.ingenieros.ejercicio_14;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

public class Main {
    public static void main(String[] args) {
        generaAnimales();
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
