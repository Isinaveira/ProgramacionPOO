package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Vaca extends AnimalGranja {

    public Vaca(String raza, SexType sex, int propietario) {
        super("Mamífero", "Vaca", raza, MedioTypes.TERRESTRE, sex, propietario);
    }
    public Vaca(String raza, SexType sex,  int id_padre, int id_madre, int propietario) {
        super("Mamífero", "Vaca", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, propietario);
    }
    public Vaca(int id_animal, String raza, SexType sex,  int id_padre, int id_madre, int propietario) {
        super(id_animal, "Mamífero", "Vaca", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, propietario);
    }

    @Override
    public void reproducirSonido(){
        System.out.println("La vaca \uD83D\uDC04 hace: Muuuuuuu!!! ");
    }
    @Override
    public void desplazarse(){
        System.out.println("La vaca \uD83D\uDC04 se desplaza sobre 4 patas \uD83D\uDC04");
    }
}
