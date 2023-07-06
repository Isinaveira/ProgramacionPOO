package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;


public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza, SexType sex) {
        super("Pez", "Pez Payaso", raza, MedioTypes.ACUATICO, sex);
    }
    public PezPayaso(String raza, SexType sex , int id_padre, int id_madre) {
        super("Pez", "Pez Payaso", raza, MedioTypes.ACUATICO, sex, id_padre, id_madre);
    }
    public PezPayaso(int id_animal,String raza, SexType sex , int id_padre, int id_madre) {
        super(id_animal, "Pez", "Pez Payaso", raza, MedioTypes.ACUATICO, sex, id_padre, id_madre);
    }

    @Override
    public void reproducirSonido(){
        System.out.println("El pez payaso  \\uD83D\\uDC20 hace : glouppp!!! ");
    }
    @Override
    public void desplazarse(){
        System.out.println("El pez payaso  \\uD83D\\uDC20 se desplaza nadando");
    }
}
