package org.campusdual.bootcamp.ingenieros.ejercicio_18;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

public class Main {
    public static void main(String[] args) {
        generaAnimales();
        /*
        * Como se puede ver no le paso a cada animal el id del animal
        * por tanto si imprimo ahora el Animal.getIds_animal() me debe dar el nºde animales+1
        * este id se asigna al siguiente animal creado.
        * */
        System.out.println("Next id_animal: " + Animal.getIds_animal());
        System.out.println("Numero de animales: " + Animal.getListAnimals().size());

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
}
