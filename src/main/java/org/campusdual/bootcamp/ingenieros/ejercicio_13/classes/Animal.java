package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Animal implements ISexual, Cloneable {
    static ArrayList<Animal> listAnimals = new ArrayList<>();
    private String reino;
    private static  int ids_animal = 1;
    private Integer id_animal;
    private String type;
    private String raza;
    private MedioTypes medio;
    private SexType sexo;
    private Boolean clone;

    private int id_padre;
    private int id_madre;


    static final Integer  MAX_CRIAS  = 1;

    public Animal(String reino, String type, String raza, MedioTypes medio, SexType sexo){
            this.reino = reino;
            this.type = type;
            this.raza = raza;
            this.medio = medio;
            this.clone = false;
            this.sexo = sexo;
            this.id_animal = Animal.ids_animal;
            ids_animal ++;
            this.id_madre = 0;
            this.id_padre = 0;
            listAnimals.add(this);
    }
    public Animal(String reino, String type, String raza, MedioTypes medio, SexType sexo, int id_padre, int id_madre){
        this.reino = reino;
        this.type = type;
        this.raza = raza;
        this.medio = medio;
        this.clone = false;
        this.sexo = sexo;
        this.id_animal = Animal.ids_animal;
        this.id_padre = id_padre;
        this.id_madre = id_madre;
        ids_animal ++;
        listAnimals.add(this);
    }
    public Animal(int id_animal,String reino, String type, String raza, MedioTypes medio, SexType sexo, int id_padre, int id_madre){
        this.reino = reino;
        this.type = type;
        this.raza = raza;
        this.medio = medio;
        this.clone = false;
        this.sexo = sexo;
        this.id_animal = id_animal;
        this.id_padre = id_padre;
        this.id_madre = id_madre;
        ids_animal = id_animal +1;
        listAnimals.add(this);
    }
    public Animal(Animal animal){
        this.reino = animal.reino;
        this.type = animal.type;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.clone = true;
        this.sexo = animal.sexo;
        listAnimals.add(this);
    }

    public static ArrayList<Animal> getListAnimals() {
        return listAnimals;
    }

    public static void setListAnimals(ArrayList<Animal> listAnimals) {
        Animal.listAnimals = listAnimals;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public static int getIds_animal() {
        return ids_animal;
    }

    public static void setIds_animal(int ids_animal) {
        Animal.ids_animal = ids_animal;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public MedioTypes getMedio() {
        return medio;
    }

    public void setMedio(MedioTypes medio) {
        this.medio = medio;
    }

    public Boolean getClone() {
        return clone;
    }

    public void setClone(Boolean clone) {
        this.clone = clone;
    }

    public int getId_padre() {
        return id_padre;
    }

    public void setId_padre(int id_padre) {
        this.id_padre = id_padre;
    }

    public int getId_madre() {
        return id_madre;
    }

    public void setId_madre(int id_madre) {
        this.id_madre = id_madre;
    }



    public static ArrayList<Animal> obtenAncestros(Animal animal){
        ArrayList<Animal> ancestros = new ArrayList<>();
        int id_padre = animal.getId_padre();
        int id_madre = animal.getId_madre();
        if(id_padre == 0 && id_madre == 0){
            return ancestros;
        }else{
            Animal.getListAnimals().forEach(a ->{
                if(a.getId_animal() == id_padre || a.getId_animal() == id_madre){
                    ancestros.add(a);

                    if(a.getId_animal() == id_padre){
                        System.out.println("Padre de "+animal.getId_animal()+ " : " + id_padre);
                    }else{
                        System.out.println("Madre de "+animal.getId_animal()+ " : " + id_madre);
                    }
                    ancestros.addAll(obtenAncestros(a));
                }
            });
        }
        return ancestros;

    }


    public String toStringCSV() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", type='" + type + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                '}';
    }

    public String toStringJSON(){
        return "";
    }

    public String toStringXML(){
        return "";
    }

    @Override
    public SexType getSexo(){
        return this.sexo;
    }
    @Override
    public void setSexo(SexType sexo){
        this.sexo = sexo;
    }

    public abstract void reproducirSonido();
    public abstract void desplazarse();

    public abstract void criar(Animal madre);


    public int puedenCriar(Animal madre){
        Random r = new Random();
        ArrayList<Animal> list_crias = new ArrayList<Animal>();
        if(this.getId_animal() != madre.getId_animal()){
            //son distintos animales
            if(this.getSexo() == SexType.MACHO && madre.getSexo() == SexType.HEMBRA){
                //distinto sexo y this == macho y animal == hembra
                if(this.getType().equalsIgnoreCase(madre.getType())){
                    //mismo type ej: perro, perro
                    if(this.getId_animal() != madre.getId_padre()){
                        //no es su hija
                        if(!compruebaFamilia(this, madre)){
                            //no son hermanos

                            int num_crias_pareja = Animal.listAnimals.stream().filter(a ->(
                                    a.getId_padre() == this.getId_animal()
                                    && a.getId_madre() == madre.getId_animal()
                            )).toArray().length;

                            int max_crias_disponibles = Animal.MAX_CRIAS - num_crias_pareja;

                            if( max_crias_disponibles > 0 ){
                                //PUEDEN CRIAR
                                return max_crias_disponibles;
                            }

                        }
                    }

                }
            }
        }
        return 0;
    }
    public boolean compruebaFamilia(Animal p, Animal m){
        boolean padre = false, madre = false, hermanos = false, iniciales = false;
        if( ( p.getId_madre() == m.getId_madre() ) && ( p.getId_padre() == p.getId_madre() ) ){
            if(p.getId_madre() == 0 && p.getId_padre() == 0){
                iniciales = true; //son los iniciales
            }else{
                hermanos = true; //son hermanos, tienen mismos padres y los ID de los padres no son 0
                return true;
            }
        }
        if(p.getId_animal() == m.getId_padre()){
            padre = true; //padre de la madre
        }
        if(p.getId_madre() == m.getId_madre()){
            madre = true; //madre del padre
        }
        if(iniciales){
            return false;
        }
        if(padre || madre){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", id_animal=" + id_animal +
                ", type='" + type + '\'' +
                ", raza='" + raza + '\'' +
                ", medio=" + medio +
                ", sexo=" + sexo +
                ", clone=" + clone +
                ", id_padre=" + id_padre +
                ", id_madre=" + id_madre +
                '}';
    }
}
