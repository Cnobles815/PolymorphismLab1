package nobles.christopher.PolymorphismLab1;
import java.util.ArrayList;

/**
 * Created by christophernobles on 9/26/16.
 */
public  class Pet {

    int petNumber = 0;
     String petType = "";
     String petName = "";

    public  Pet (String name, String type){
        final String naName = name;
        final String tyType = type;
        this.petName = naName;
        this.petType = tyType;
    }

    public Pet (){

    }





    static ArrayList<Pet> petsList = new ArrayList<Pet>();

    public Pet addPetsToList(Pet pet){
        petsList.add(pet);
        return pet;
    }

    public String getPetType(){
        return this.petType;
    }

    public String getPetName(){
        return this.petName;
    }

    public void setPetName(String newName){
        this.petName = newName;
    }

    public void setPetType(String newType){
        this.petType = newType;
    }

    public String speak(){
        return "noise";
    }



    //List<Pet> petList;


}
