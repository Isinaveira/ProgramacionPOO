package org.campusdual.bootcamp.ingenieros.ejercicio_12;

import org.campusdual.bootcamp.ingenieros.ejercicio_12.classes.*;

public class Main {
    public static void main(String [] args){
        Gato g1 = new Gato("Mamífero", "Gato", "siamesa", "TERRESTRE", "Garfield","Pepe");
        Gato g2 = new Gato("Mamífero", "Gato", "siamesa", "TERRESTRE", "Garfield","Pepe");
        Perro p1 = new Perro("Mamífero", "Perro", "Boxer", "TERRESTRE", "Argo","Pepe");
        Perro p2 = new Perro("Mamífero", "Perro", "Boxer", "TERRESTRE", "Perla","Pepe");
        Oveja o1 = new Oveja("Mamífero", "Oveja", "Merina", "TERRESTRE", "Pepe");
        Oveja o2 = new Oveja("Mamífero", "Oveja", "Merina", "TERRESTRE", "Pepe");
        Vaca v1 = new Vaca("Mamífero", "Vaca", "Rubia", "TERRESTRE", "Pepe");
        Vaca v2 = new Vaca("Mamífero", "Vaca", "Rubia", "TERRESTRE", "Pepe");
        PezPayaso pp1 = new PezPayaso("Pez", "Pez payaso", "Payasus", "ACUATICO");
        PezPayaso pp2 = new PezPayaso("Pez", "Pez payaso", "Payasus", "ACUATICO");

        System.out.println(g1.toString());
        System.out.println(p1.toString());
        System.out.println(v1.toString());
        System.out.println(o1.toString());
        System.out.println(pp1.toString());
        System.out.println(pp2.toString());

    }
}
