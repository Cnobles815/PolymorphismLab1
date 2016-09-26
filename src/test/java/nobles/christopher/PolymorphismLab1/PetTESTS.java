package nobles.christopher.PolymorphismLab1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/26/16.
 */
public class PetTESTS {
    @Test
    public void getPetNameTEST(){
        Pet pet = new Pet("Jack", "Rat");
        String expectedValue = "Jack";
        String actualValue = pet.getPetName();
        assertEquals("The value should be Jack", expectedValue, actualValue);
    }

    @Test
    public void getPetTypeTEST(){
        Pet pet = new Pet("Jack", "Rat");
        String expectedValue = "Jack";
        String actualValue = pet.getPetType();
        assertEquals("The value should be Rat", expectedValue, actualValue);
    }

    @Test
    public void speakTEST(){
        Pet pet = new Pet("Jack", "Rat");
        String expectedValue = "Noise";
        String actualValue = pet.speak();
        assertEquals("The value should be Noise", expectedValue, actualValue);
    }

}
