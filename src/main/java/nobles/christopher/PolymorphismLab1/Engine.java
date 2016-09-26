package nobles.christopher.PolymorphismLab1;

/**
 * Created by christophernobles on 9/26/16.
 */
public class Engine {
    UserInput userInput = new UserInput();
    Display display = new Display();
    Pet pet;

    static int petNumber = 0;
    static int entryNum = 1;


    public void inputPetNumber(){
        display.printString("How many pets do you have?");
        int pets = userInput.promptInt();
        display.printString("I see. You have " + pets + " pets." +
                "\nIs that correct?" +
                "\n[[Y/N]]");
        String confirm = userInput.promptString().toUpperCase();
        if (confirm.equals("Y")){
            petNumber = pets;
            inputPetTypes();}
        else{
            display.printString("That isn't correct?");
            inputPetNumber();}


    }

    public void inputPetTypes(){
        display.printString("Give pet " + entryNum +
                "'s name and type.");
        pet = new Pet(userInput.promptString(), userInput.promptString());
        pet.addPetsToList(pet);
        //display.printString(pet.petsList.get(0).getPetName() + pet.petsList.get(0).getPetType());
        entryNum++;

        if (entryNum <= petNumber){
            inputPetTypes();
        }
        else
            displayPetList();
    }

    public void displayPetList(){
        for (int i = 0; i < petNumber; i++) {
            display.printString(pet.petsList.get(i).getPetName() + " " + pet.petsList.get(i).getPetType() + " " );
        }
    }
}
