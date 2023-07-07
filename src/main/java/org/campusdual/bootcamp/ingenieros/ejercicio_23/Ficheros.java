package org.campusdual.bootcamp.ingenieros.ejercicio_23;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.AnimalGranja;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.AnimalSalvaje;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.Mascota;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {

    public static void animalsToJSONFile(String filename){

        JSONArray jsonAnimales = new JSONArray();

        Mascota.list_mascotas.forEach(a->{

            JSONObject animal = new JSONObject();
            animal.put("id_animal", a.getId_animal());
            animal.put("type", a.getType());
            animal.put("reino", a.getReino());
            animal.put("raza", a.getRaza());
            animal.put("sexo", a.getSexo());
            animal.put("nombre", a.getNombre());
            animal.put("id_padre", a.getId_padre());
            animal.put("id_madre", a.getId_madre());
            animal.put("propietario", a.getPropietario());
            jsonAnimales.put(animal);
        });

        AnimalGranja.list_granja.forEach(a->{

            JSONObject animal = new JSONObject();
            animal.put("id_animal", a.getId_animal());
            animal.put("type", a.getType());
            animal.put("reino", a.getReino());
            animal.put("raza", a.getRaza());
            animal.put("sexo", a.getSexo());
            animal.put("nombre", "\"\"");
            animal.put("id_padre", a.getId_padre());
            animal.put("id_madre", a.getId_madre());
            animal.put("propietario", a.getPropietario());
            jsonAnimales.put(animal);
        });

        AnimalSalvaje.list_salvajes.forEach(a->{

            JSONObject animal = new JSONObject();
            animal.put("id_animal", a.getId_animal());
            animal.put("type", a.getType());
            animal.put("reino", a.getReino());
            animal.put("raza", a.getRaza());
            animal.put("sexo", a.getSexo());
            animal.put("nombre", "\"\"");
            animal.put("id_padre", a.getId_padre());
            animal.put("id_madre", a.getId_madre());
            animal.put("propietario", "\"\"");
            jsonAnimales.put(animal);
        });
            String jsonString = jsonAnimales.toString();
        try (FileWriter fileWriter = new FileWriter("datos.json")) {
            fileWriter.write(jsonString);
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo JSON: " + e.getMessage());
        }
    }
}
