package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Granjero {
    private  String nombre;
    private int id_granjero;

    public static ArrayList<Granjero> list_granjeros = new ArrayList<>();
    private ArrayList<Animal> owned_Animals;
    public Granjero(String nombre , int id_granjero){
        this.nombre = nombre;
        this.id_granjero = id_granjero;
        this.owned_Animals = buscaAnimalesEnPropiedad();
        list_granjeros.add(this);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_granjero() {
        return id_granjero;
    }

    public void setId_granjero(int id_granjero) {
        this.id_granjero = id_granjero;
    }

    public ArrayList<Animal> getOwned_Animals() {
        return owned_Animals;
    }

    public void setOwned_Animals(ArrayList<Animal> owned_Animals) {
        this.owned_Animals = owned_Animals;
    }

    private ArrayList<Animal> buscaAnimalesEnPropiedad(){
        ArrayList<Animal> animals = new ArrayList<>();
        Mascota.list_mascotas.stream()
                .filter(m->m.getPropietario() == this.id_granjero)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(m-> animals.add(m));
        AnimalGranja.list_granja.stream()
                .filter(g->g.getPropietario() == this.id_granjero)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(g-> animals.add(g));

        return animals;
    }

}
