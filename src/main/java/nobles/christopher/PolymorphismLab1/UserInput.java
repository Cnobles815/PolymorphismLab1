package nobles.christopher.PolymorphismLab1;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/26/16.
 */
public class UserInput {
    Scanner userInput1 = new Scanner(System.in);


    public String promptString(){
        String output = userInput1.next();
        return output;
    }

    public int promptInt() {
        int output = userInput1.nextInt();
        return output;
    }

    public double promptDouble(){
        double output = userInput1.nextDouble();
        return output;
    }
}
