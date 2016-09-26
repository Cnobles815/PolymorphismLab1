package nobles.christopher.PolymorphismLab1;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by christophernobles on 9/26/16.
 */
public  class Pet {

    int petNumber = 0;
    String petType = "";
    String petName = "";

    public Pet (String name, String type){
        this.petName = name;
        this.petType = type;
    }





    static ArrayList<Pet> pets = new ArrayList<Pet>();

    public Pet addPetsToList(Pet pet){
        pets.add(pet);
        return pet;
    }


    //List<Pet> petList;


}
