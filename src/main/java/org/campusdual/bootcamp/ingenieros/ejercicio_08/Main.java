package org.campusdual.bootcamp.ingenieros.ejercicio_08;

import org.campusdual.bootcamp.ingenieros.Utilities.Input;


import java.util.Stack;

public class Main {
    static Stack<Double> numbers = new Stack<>();
    public static void main(String [] args){
        while(true){
            System.out.println("###############################################");
            System.out.println("Selecciona una opcion");
            System.out.println("a) Añadir un numero a la lista");
            System.out.println("s) Suma de los elementos de la lista");
            System.out.println("d) Elimina el ultimo elemento de la lista");
            System.out.print("Tu eleccion: ");
            char c = Input.character();
            System.out.println("-------------------------------------------------");

            if(c == 'a'){
                addNumber();
            }
            else if(c == 's'){
                sumNumberList();
            }
            else if(c == 'd'){
                deleteLast();
            }
            else if(c == 'c'){
                System.out.println("Hasta luego!!");
                System.exit(0);
            }
            else{
                System.out.println("Esa opcion no está en la lista, prueba otra");
            }
            showList();


        }
    }

    public static void addNumber(){
        System.out.print("Introduce un numero para añadirlo: ");
        double num = Input.real();
        Main.numbers.add(num);
    }

    public static void sumNumberList(){
        if(Main.numbers.size()!=0){
            Double sum = Main.numbers.stream().reduce(0.0, (a,b)-> a+b);
            System.out.println("La suma de los numeros de la lista es: " + sum);
        }
    }

    public static void deleteLast(){
        if(Main.numbers.size() != 0){
            Double last = Main.numbers.pop();
            System.out.println("el elemento borrado es: " + last);
        }
    }
    public static void showList(){
        System.out.println("Lista: " + Main.numbers.toString());
    }

}
