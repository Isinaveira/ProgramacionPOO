package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Oveja extends AnimalGranja {

    public Oveja( String raza, SexType sex, int propietario) {
        super("Mamífero", "Oveja", raza, MedioTypes.TERRESTRE, sex, propietario);
    }
    public Oveja( String raza, SexType sex, int id_padre, int id_madre, int propietario) {
        super("Mamífero", "Oveja", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, propietario);
    }
    public Oveja(int id_animal, String raza, SexType sex, int id_padre, int id_madre, int propietario) {
        super(id_animal,"Mamífero", "Oveja", raza, MedioTypes.TERRESTRE, sex, id_padre, id_madre, propietario);
    }

    @Override
    public void reproducirSonido(){
        System.out.println("La oveja \\uD83D\\uDC11 hace: Beeeeeee!!!");
    }
    @Override
    public void desplazarse(){
        System.out.println("La oveja \\uD83D\\uDC11 se desplaza sobre 4 patas");
    }
}
