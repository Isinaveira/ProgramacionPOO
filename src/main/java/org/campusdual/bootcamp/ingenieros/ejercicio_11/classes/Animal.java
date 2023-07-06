package org.campusdual.bootcamp.ingenieros.ejercicio_11.classes;

public class Animal {
    private String reino;
    private String type;
    private String raza;
    private String medio;

    public Animal(String reino, String type, String raza,String medio){
            this.reino = reino;
            this.type = type;
            this.raza = raza;
            this.medio = medio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", type='" + type + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                '}';
    }
}
