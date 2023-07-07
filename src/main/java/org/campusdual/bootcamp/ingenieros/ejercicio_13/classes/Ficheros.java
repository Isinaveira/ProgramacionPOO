package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import java.io.*;
import java.util.ArrayList;

public class Ficheros {
    public static void generaFicheroAnimales(String nombreArchivo, FileTypes type){
        if(type == FileTypes.CSV){
            generaCSV(nombreArchivo +".csv");
        }
        if(type == FileTypes.JSON){
            generaJSON(nombreArchivo +".json");
        }
        if(type == FileTypes.XML){
            generaXML(nombreArchivo + ".xml");
        }
    }
    public static void generaCSV(String nombreArchivo){
        ArrayList<String> datosAnimales = new ArrayList<>();
        String cabecera = "ID_ANIMAL;TYPE;REINO;RAZA;SEXO;NOMBRE;ID_PADRE;ID_MADRE;PROPIETARIO";
        datosAnimales.add(cabecera);
        Animal.getListAnimals().forEach(animal -> datosAnimales.add(animal.toStringCSV()));


        File archivo =new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String fila : datosAnimales) {
                writer.write(fila);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fichero CSV creado correctamente \u2713 !!!");
        }


    }
    public static void generaJSON(String nombreArchivo){

        ArrayList <String> datosAnimales = new ArrayList<>();
        Animal.getListAnimals().forEach(animal -> datosAnimales.add(animal.toStringJSON()));


        File archivo =new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("[\n");
            for(int i = 0 ; i < datosAnimales.size(); i ++){

                writer.write(datosAnimales.get(i));
                if(i!= datosAnimales.size()-1){
                    writer.write(",");
                }
                writer.newLine();
            }
            writer.write("]");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fichero JSON creado correctamente \u2713 !!!");
        }
    }

    public static void generaXML(String nombreArchivo){
        ArrayList <String> datosAnimales = new ArrayList<>();
        Animal.getListAnimals().forEach(animal -> datosAnimales.add(animal.toStringXML()));
        File archivo =new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("<Animals>\n");
            for (String fila : datosAnimales) {
                writer.write(fila);
                writer.newLine();
            }
            writer.write("</Animals>");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fichero XML creado correctamente \u2713 !!!");
        }
    }

    public static void leerArchivoCSV(String archivo){
        ArrayList<String> lineas_fichero = new ArrayList<>();
        String cabecera = "ID_ANIMAL;TYPE;REINO;RAZA;SEXO;NOMBRE;ID_PADRE;ID_MADRE;PROPIETARIO";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea.trim();
                if(!linea.equalsIgnoreCase(cabecera))
                    lineas_fichero.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            System.out.println(lineas_fichero.size());
            procesaDatosCSV(lineas_fichero);
        }
    }
    public static void procesaDatosCSV(ArrayList<String> lineas_datos){

        lineas_datos.forEach(l->{
            String datos [] = l.split(";");
            if(datos[1].equalsIgnoreCase("Gato")){
                Gato g = new Gato(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7]),
                        datos[5],
                        Integer.parseInt(datos[8])
                );
            }
            if(datos[1].equalsIgnoreCase("Perro")){
                Perro p = new Perro(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7]),
                        datos[5],
                        Integer.parseInt(datos[8])
                );
            }
            if(datos[1].equalsIgnoreCase("Oveja")){
               Oveja o = new Oveja(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7]),
                        Integer.parseInt(datos[8])
               );
            }
            if(datos[1].equalsIgnoreCase("Vaca")){
                Vaca v = new Vaca(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7]),
                        Integer.parseInt(datos[8])
                );
            }
            if(datos[1].equalsIgnoreCase("Pez Payaso")){
                PezPayaso p = new PezPayaso(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7])

                );
            }
            if(datos[1].equalsIgnoreCase("Tucán")){
                Tucan t = new Tucan(
                        Integer.parseInt(datos[0]),
                        datos[3],
                        (datos[4].equalsIgnoreCase("macho"))? SexType.MACHO: SexType.HEMBRA,
                        Integer.parseInt(datos[6]),
                        Integer.parseInt(datos[7])

                );
            }


        });


    }

}
