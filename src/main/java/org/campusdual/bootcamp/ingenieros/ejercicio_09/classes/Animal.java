package org.campusdual.bootcamp.ingenieros.ejercicio_09.classes;

public class Animal implements  Cloneable{
    private String reino;
    private String type;
    private String raza;
    private String medio;
    private boolean clone;
    public Animal(String reino, String type, String raza,String medio){
            this.reino = reino;
            this.type = type;
            this.raza = raza;
            this.medio = medio;
            this.clone = false;
    }
    //contructor de copia
    public Animal(Animal animal){
        this.reino = animal.reino;
        this.type = animal.type;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.clone = true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", type='" + type + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                ", clone='" + clone + '\'' +
                '}';
    }
    @Override
    public Animal clone() throws  CloneNotSupportedException {
        return (Animal) super.clone();
    }
}
