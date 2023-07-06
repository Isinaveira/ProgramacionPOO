package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

public class AnimalSalvaje extends Animal{
    public static ArrayList<AnimalSalvaje>  list_salvajes = new ArrayList<>();
    public AnimalSalvaje(String reino, String type, String raza, MedioTypes medio, SexType sexo){
        super(reino, type, raza, medio, sexo);
        list_salvajes.add(this);
    }
    public AnimalSalvaje(String reino, String type, String raza, MedioTypes medio, SexType sexo, int id_padre, int id_madre){
        super(reino, type, raza, medio, sexo, id_padre, id_madre);
        list_salvajes.add(this);
    }
    public AnimalSalvaje(int id_animal,String reino, String type, String raza, MedioTypes medio, SexType sexo, int id_padre, int id_madre){
        super(id_animal,reino, type, raza, medio, sexo, id_padre, id_madre);
        list_salvajes.add(this);
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
                        "" + ";" +
                        this.getId_padre() + ";" +
                        this.getId_madre() + ";" +
                        "";
    }
    @Override
    public String toStringJSON(){
        return "{\n" +
                "\"id_animal\":" + this.getId_animal()+ ",\n" +
                "\"type\": \"" + this.getType()+ "\",\n"+
                "\"reino\":\"" + this.getReino()+ "\",\n" +
                "\"raza\":\"" + this.getRaza()+ "\",\n" +
                "\"sexo\":\"" + this.getSexo()+ "\",\n" +
                "\"nombre\":\"" + ""+ "\",\n" +
                "\"id_padre\":"+ this.getId_padre()+ ",\n" +
                "\"id_madre\":"+ this.getId_madre()+ ",\n" +
                "\"propietario\": \""+ ""+ "\"\n" +
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
                "\t\t<Nombre>" + ""+ "</Nombre>\n" +
                "\t\t<Id_padre>"+ this.getId_padre()+ "</Id_padre>\n" +
                "\t\t<Id_madre>"+ this.getId_madre()+ "</Id_madre>\n" +
                "\t\t<Propietario>"+ ""+ "</Propietario>\n" +
                "\t</Animal>";
    }
    @Override
    public void criar(Animal madre){
        try{
            AnimalSalvaje madre_m = (AnimalSalvaje) madre;
            Random r = new Random();
            int num_crias = super.puedenCriar(madre);
            for(int i = 0 ; i < num_crias; i++){
                int indexSex = r.nextInt(SexType.values().length);
                SexType sex = SexType.values()[indexSex];
                Constructor<? extends AnimalSalvaje> c = this.getClass().getConstructor(
                        String.class,
                        SexType.class,
                        int.class,
                        int.class
                );
                //String reino, String type, String raza, MedioTypes medio, SexType sexo, int id_madre, int id_padre
                c.newInstance(
                        this.getRaza(),
                        this.getSexo(),
                        this.getId_animal(),
                        madre.getId_animal()


                );

            }
        }catch (ClassCastException e){
            System.out.println("No pueden criar dos animales que no son mascotas");
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }

    }




}
