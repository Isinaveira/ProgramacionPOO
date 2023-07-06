package org.campusdual.bootcamp.ingenieros.ejercicio_03;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String [] args ){


        System.out.print("Introduce un número: ");
        Integer num = Input.integer();
        Integer [] array_nums = IntStream.rangeClosed(1, num).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array_nums));
        Integer[] multiples = Arrays.stream(array_nums)
                .filter(n -> num % (Integer) n == 0)
                .map(n -> n)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(multiples));
        System.out.println(Arrays.toString(array_nums));
    }
}
