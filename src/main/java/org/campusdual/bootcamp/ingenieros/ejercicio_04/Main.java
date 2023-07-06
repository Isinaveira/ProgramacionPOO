package org.campusdual.bootcamp.ingenieros.ejercicio_04;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String [] args ){


        System.out.print("Introduce un número: ");
        Integer num = Input.integer();

        //Obtengo un array de enteros desde 1 hasta num ambos  incluidos
        Integer [] array_nums = IntStream.rangeClosed(1, num).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array_nums));
        //Utilizo reduce para ir acumulando las operaciones entre los elementos del array.
        /*
         El valor inicial del factorial se establece en 1.
         Luego, se aplica la multiplicación de cada elemento
         del flujo con el resultado parcial acumulado hasta
         el momento, comenzando por el valor inicial de 1.
        * */
        Integer factorial = Arrays.stream(array_nums).reduce(1,(a,b) -> a*b);
        System.out.println("El resultado es: " +  factorial);
    }
}
