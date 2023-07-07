package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.stream.Collectors;

public  class Mascota extends Animal implements Propietario {
    private String nombre;
    private int propietario;
    public static ArrayList<Mascota>  list_mascotas = new ArrayList<>();
    public Mascota(String reino, String type, String raza, MedioTypes medio, SexType sex ,
                   String nombre, int propietario){
        super(reino, type, raza, medio, sex);
        this.nombre = nombre;
        this.propietario = propietario;

        list_mascotas.add(this);
    }
    public Mascota(String reino, String type, String raza, MedioTypes medio, SexType sex ,
                   int id_padre, int id_madre, String nombre, int propietario){
        super(reino, type, raza, medio, sex, id_padre, id_madre);
        this.nombre = nombre;
        this.propietario = propietario;



        list_mascotas.add(this);
    }
    public Mascota(int id_animal, String reino, String type, String raza, MedioTypes medio, SexType sex ,
                   int id_padre, int id_madre, String nombre, int propietario){
        super(id_animal,reino, type, raza, medio, sex, id_padre, id_madre);
        this.nombre = nombre;
        this.propietario = propietario;




        list_mascotas.add(this);
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public int getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(int propietario){
        this.propietario = propietario;
    }

    @Override
    public void reproducirSonido() {}

    @Override
    public void desplazarse() {}

    @Override
    public String toStringCSV(){
        return
                this.getId_animal() + ";" +
                        this.getType() + ";" +
                        this.getReino() + ";" +
                        this.getRaza() + ";" +
                        this.getSexo() + ";" +
                        this.getNombre() + ";" +
                        this.getId_padre() + ";" +
                        this.getId_madre() + ";" +
                        this.getPropietario();
    }

    @Override
    public String toStringJSON(){
        return "{\n" +
                "\"id_animal\":" + this.getId_animal()+ ",\n" +
                "\"type\": \"" + this.getType()+ "\",\n"+
                "\"reino\":\"" + this.getReino()+ "\",\n" +
                "\"raza\":\"" + this.getRaza()+ "\",\n" +
                "\"sexo\":\"" + this.getSexo()+ "\",\n" +
                "\"nombre\":\"" + this.getNombre()+ "\",\n" +
                "\"id_padre\":"+ this.getId_padre()+ ",\n" +
                "\"id_madre\":"+ this.getId_madre()+ ",\n" +
                "\"propietario\":"+ this.getPropietario()+ "\n" +
                "}";
    }
    @Override
    public String toStringXML(){
        return "\t<Animal>\n" +
                "\t\t<Id_animal>" + this.getId_animal()+ "</Id_animal>\n" +
                "\t\t<Type>" + this.getType()+ "</Type>\n"+
                "\t\t<Reino>" + this.getReino()+ "</Reino>\n" +
                "\t\t<Raza>" + this.getRaza()+ "</Raza>\n" +
                "\t\t<Sexo>" + this.getSexo()+ "</Sexo>\n" +
                "\t\t<Nombre>" + this.getNombre()+ "</Nombre>\n" +
                "\t\t<Id_padre>"+ this.getId_padre()+ "</Id_padre>\n" +
                "\t\t<Id_madre>"+ this.getId_madre()+ "</Id_madre>\n" +
                "\t\t<Propietario>"+ this.getPropietario()+ "</Propietario>\n" +
                "\t</Animal>";
    }

    @Override
    public void criar(Animal madre) {
        try{
            Mascota madre_m = (Mascota) madre;

            int num_crias = super.puedenCriar(madre);
            for(int i = 0 ; i < num_crias; i++){


                SexType sex = (Math.random()>0.5)? SexType.MACHO : SexType.HEMBRA;

               Constructor<? extends Mascota> c = this.getClass().getConstructor(

                       String.class,
                       SexType.class,
                       int.class,
                       int.class,
                       String.class,
                       int.class

               );
                c.newInstance(
            this.getRaza(),
                    sex,
                    this.getId_animal(),
                    madre.getId_animal(),
                    "",
                    madre_m.getPropietario()

                );

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
