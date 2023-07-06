package org.campusdual.bootcamp.ingenieros.ejercicio_01;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;

public class Main {
    public static void main( String [] args){

        System.out.print("Introduce un caracter: ");
        Integer i = Input.integer();
        boolean flag = false;
        flag = (i%2 == 0)? true : false;
        System.out.println("¿Es par? " + flag);
    }
}
