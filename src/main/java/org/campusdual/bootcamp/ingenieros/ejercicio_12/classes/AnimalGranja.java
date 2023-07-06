package org.campusdual.bootcamp.ingenieros.ejercicio_12.classes;

public class AnimalGranja extends Animal implements Propietario {
    private String propietario;
    public AnimalGranja(String reino, String type, String raza, String medio, String propietario){
        super(reino, type, raza, medio);
        this.propietario = propietario;
    }
    @Override
    public String getPropietario(){
        return this.propietario;
    }
    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
}
