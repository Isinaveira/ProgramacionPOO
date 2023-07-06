package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;


public class Tucan extends AnimalSalvaje {
    public Tucan(String raza, SexType sex) {
        super("Aves", "Tucán", raza, MedioTypes.AEREO, sex);
    }
    public Tucan(String raza, SexType sex, int id_padre, int id_madre) {
        super("Aves", "Tucán", raza, MedioTypes.AEREO, sex, id_padre, id_madre);
    }
    public Tucan(int id_animal,String raza, SexType sex, int id_padre, int id_madre) {
        super(id_animal, "Aves", "Tucán", raza, MedioTypes.AEREO, sex, id_padre, id_madre);
    }

    @Override
    public void reproducirSonido(){
        System.out.println("El tucán hace: Pio, Pio!!! \\uD83E\\uDD82");
    }
    @Override
    public void desplazarse(){
        System.out.println("El tucán\\uD83E\\uDD82 se desplaza volando o sobre 2 patas");
    }
}
