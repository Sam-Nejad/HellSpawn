//imports java scanner to get user input for the game
import java.util.Scanner;
public class Input {
    //method that prints a spacer and returns the user input to other classes
    public static String getInput() {
        System.out.print("");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input.toLowerCase();
        return input;
    }
}
