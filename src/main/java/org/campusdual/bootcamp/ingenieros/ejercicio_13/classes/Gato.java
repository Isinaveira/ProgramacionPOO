package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Gato extends Mascota {
    public Gato(String raza, SexType sex, String nombre, int propietario) {
        super("Mamífero", "Gato", raza, MedioTypes.TERRESTRE, sex, nombre, propietario);
    }
    public Gato(String raza, SexType sex, int id_padre, int id_madre, String nombre, int propietario) {
        super("Mamífero", "Gato", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, nombre, propietario);
    }
    public Gato(int id_animal,String raza, SexType sex, int id_padre, int id_madre, String nombre, int propietario) {
        super(id_animal, "Mamífero", "Gato", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, nombre, propietario);
    }

    @Override
    public void reproducirSonido(){
        System.out.println("El gato hace: Miaaaaauuu \uD83D\uDC31!!!");
    }
    @Override
    public void desplazarse(){
        System.out.println("El gato se desplaza sobre 4 patas");
    }



}
