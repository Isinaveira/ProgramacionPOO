package org.campusdual.bootcamp.ingenieros.ejercicio_02;


import org.campusdual.bootcamp.ingenieros.Utilities.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {


    public static void main(String [] args ){
        Integer [] primes = {2,3,5,7};
        System.out.println(Arrays.toString(primes));
        System.out.print("Introduce un número: ");
        Integer num = Input.integer();
        Integer[] multiples = Arrays.stream(primes)
                .filter(prime -> num % (Integer) prime == 0)
                .map(prime -> prime)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(multiples));



    }


}
