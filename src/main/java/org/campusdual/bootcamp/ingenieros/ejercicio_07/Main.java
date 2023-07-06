package org.campusdual.bootcamp.ingenieros.ejercicio_07;

public class Main {
    public static void main(String [] args){
        int i = 10;
        double d = 4.00000000000000000003;
        boolean b = true;
        char c = 'a';
        String s  = "Soy un string";
        obtainVariableType(i);
        obtainVariableType(d);
        obtainVariableType(c);
        obtainVariableType(b);
        obtainVariableType(s);

        variableType(i);
        variableType(d);
        variableType(c);
        variableType(s);
    }


    public static void obtainVariableType(Object objeto){
        Class c = objeto.getClass();
        String type = "";
        switch(c.getSimpleName()){
            case "Integer":
                type = "entero";
                break;
            case "Long":
                type = "entero largo";
                break;
            case "Float":
                type = "decimal";
                break;
            case "Double":
                type = "decimal largo";
                break;
            case "Character":
                type = "caracter";
                break;
            case "String":
                type = "cadena";
                break;
            case "Boolean":
                type = "boleano";
                break;

        }
        System.out.println("El tipo de dato es " + type + " y su valor es " + objeto.toString());
    }

    public static void variableType(int i ){
        System.out.println("El tipo de dato es entero y su valor es: " + i);
    }
    public static void variableType(float  f ){
        System.out.println("El tipo de dato es decimal y su valor es: " + f);
    }
    public static void variableType(double d){
        System.out.println("El tipo de dato es decimal largo y su valor es: " + d);
    }
    public static void variableType(boolean b ){
        System.out.println("El tipo de dato es booleano y su valor es: " + b);
    }
    public static void variableType(String s ){
        System.out.println("El tipo de dato es entero y su valor es: " + s);
    }
    public static void variableType(char c ){
        System.out.println("El tipo de dato es entero y su valor es: " + c);
    }
}
