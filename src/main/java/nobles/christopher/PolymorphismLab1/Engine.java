package nobles.christopher.PolymorphismLab1;

/**
 * Created by christophernobles on 9/26/16.
 */
public class Engine {
    UserInput userInput = new UserInput();
    Display display = new Display();

    public void inputPetNumber(){
        display.printString("Hello user." +
                "\nHow many pets do you have?");
        int pets = userInput.promptInt();
        display.printString("I see. You have " + pets + "pets." +
                "\nIs that correct?" +
                "\n[[Y/N]]");
        String confirm = userInput.promptString().toUpperCase();
        if (confirm == "Y"){
            inputPetTypes();
        }
        else{
            display.printString("That isn't correct? How many pets do you have?");
            inputPetNumber();}


    }

    public void inputPetTypes(){
        display.printString("Specify pet type.");

    }
}
