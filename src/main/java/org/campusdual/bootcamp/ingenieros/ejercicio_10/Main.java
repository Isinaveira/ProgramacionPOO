package org.campusdual.bootcamp.ingenieros.ejercicio_10;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.classes.Animal;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException {

        Animal a = new Animal("MAMIFERO", "GATO", "SIAMES", "TERRESTRE");
        Animal a2 = new Animal("MAMIFERO", "PERRO", "BOXER", "TERRESTRE");
        Animal copia_a = new Animal (a);
        Animal copia_a2 = new Animal (a2);

        Animal clone_a = a.clone();
        Animal clone_b = a2.clone();
        System.out.println(clone_a.toString());
        System.out.println(clone_b.toString());
    }
}
