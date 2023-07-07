package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Perro extends Mascota {
    public Perro(String raza, SexType sex, String nombre, int propietario) {
        super("Mamífero", "Perro", raza, MedioTypes.TERRESTRE, sex, nombre, propietario);
    }
    public Perro(String raza, SexType sex, int id_padre, int id_madre, String nombre, int propietario) {
        super("Mamífero", "Perro", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, nombre, propietario);
    }
    public Perro(int id_animal, String raza, SexType sex, int id_padre, int id_madre, String nombre, int propietario) {
        super(id_animal,"Mamífero", "Perro", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, nombre, propietario);
    }
    @Override
    public void reproducirSonido(){
        System.out.println("El perro\uD83D\uDC15 hace: Guauuuuuu!!! ");
    }
    @Override
    public void desplazarse(){
        System.out.println("El perro\uD83D\uDC15 se desplaza sobre 4 patas");
    }
}
