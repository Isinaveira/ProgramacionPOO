package org.campusdual.bootcamp.ingenieros.ejercicio_05;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String [] args ){


        System.out.print("Introduce un número: ");
        String num = Input.string();
        //Forma 1:
        String [] pa = num.split("\\.");
        float num_decimal = 0;
        int num_entero = Integer.parseInt(pa[0]);
        if(pa.length > 1){
            System.out.println(Arrays.toString(pa));
            num_decimal = Float.parseFloat("0." +pa[1]);
        }
        System.out.println("Método 1 : String...");
        System.out.println("Parte decimal: " + num_decimal);
        System.out.println("Parte entera: " +  num_entero);

        System.out.println("--------------------------------");
        System.out.println("Método 2: modulo");
        System.out.print("Introduce un número: ");
        double number = Input.real();
        int number_entera = (int) number;
        System.out.println("Parte decimal: " + number % 1);
        System.out.println("Parte entera: " + (int) number);
        System.out.println("--------------------------------");
        System.out.println("Método 3: resta");
        System.out.print("Introduce un número: ");
        double number2 = Input.real();
        System.out.println("Parte decimal: " + (number2 - (int) number2));
        System.out.println("Parte entera: " + (int) num_entero);
        System.out.println("--------------------------------");
        System.out.println("Comprobación de error de coma flotante");
        System.out.println("¿Resultado de la operacion String ==  resultado operacion modulo?");
        System.out.println(num_decimal == (number2-(int)number2));
        System.out.println("El resultado debería ser 0 pero es: " + (num_decimal-(number2-(int)number2)));
    }
}
