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
        display.printString("Describe pet " + entryNum +
                "\n[[Name, Type]]");
        String name = userInput.promptString();
        String type = userInput.promptString();
        pet = new Pet(name, type);
        entryNum++;
        pet.addPetsToList(pet);
        if (entryNum <= petNumber){
            inputPetTypes();
        }

    }


}
