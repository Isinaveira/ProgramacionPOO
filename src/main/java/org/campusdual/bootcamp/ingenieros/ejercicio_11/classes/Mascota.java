package org.campusdual.bootcamp.ingenieros.ejercicio_11.classes;

public class Mascota extends Animal implements  Propietario{
    private String nombre;
    private String propietario;
    public Mascota(String reino, String type, String raza,String medio, String nombre, String propietario){
        super(reino, type, raza, medio);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}
