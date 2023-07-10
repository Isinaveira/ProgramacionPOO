package org.campusdual.bootcamp.ingenieros.ejercicio_06;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;


import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]){
        System.out.println("Introduce el numero de iteraciones: ");
        int iteraciones =  Input.integer();
        Integer [] fibonacci = new Integer[iteraciones];
        fibonacci[0] = 0; fibonacci[1]=1;
        for(int i = 2 ; i < fibonacci.length; i ++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(Arrays.toString(fibonacci));
        /*
        1 .Stream.iterate genera una secuencia infinita de pares de numeros (a,b) en la que
        a,b representan los dos numeros anteriores a la serie.
        new int[]{0,1} significa que la serie empieza con {0,1} y va generando los nuevos
        pares partir de ahi.
        2 .limitamos a iteraciones el numero de iteraciones que queremos.
        3 .mapeamos el resultado a solo el primer numero de cada par de numeros.
        con for each generamos un println por cada elemento de la serie.
         */
         Integer [] fibbo_series = Stream.iterate(new int[]{0,1}, fib-> new int[]{fib[1], fib[0] + fib[1]})
                .limit(iteraciones)
                .map(fib->fib[0])
                .toArray(Integer[]::new);

         System.out.println(Arrays.toString(fibbo_series));

    }
}
