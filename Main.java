//imports java array lists
import java.util.ArrayList;
//the main game class the 'hub' that starts the game
public class Main {
    public static void main(String args[]) {
        // Title Screen
        System.out.println("Hellspawn: Damnation");
        System.out.println("A Text-based ARPG");
        System.out.println("");
        // Allows the user to input their character's name
        System.out.println("Please enter your name: ");
        String userName = Input.getInput();
        // Allows the user to input their character's mantle
        System.out.print("Choose your mantle (Duelist , Marauder, Templar): ");
        String userMantle = Input.getInput();
        // Once mantle is selected the main games starts 
        System.out.println("");
        //If statements to pick the correct start for the user's selected mantle
        if (userMantle.equalsIgnoreCase("Duelist")){
            //Substitution Principle
            //An instance of a subclass can take the place of an instance of any of its superclasses 
            //In Java, variables holding object types are polymorphic variables - they can hold objects of different acceptable types
            //A new player is being creates of the type Duelist as the user picked this mantle
            Player player = new Duelist(userName, userMantle);
            //Substitution Principle - using a polymorphic variable's Player one & String description - starts the fight scene and encounters first enemy
            new Fights().battleground(player, "the Maze of the Minotaur");
        }
        if (userMantle.equalsIgnoreCase("Marauder")){
            //Substitution Principle
            //An instance of a subclass can take the place of an instance of any of its superclasses 
            //In Java, variables holding object types are polymorphic variables - they can hold objects of different acceptable types
            //A new player is being creates of the type Marauder as the user picked this mantle
            Player player = new Marauder(userName, userMantle);
            //Substitution Principle - using a polymorphic variable's Player one & String description - starts the fight scene and encounters first enemy
            new Fights().battleground(player, "the Pit of the Chimera");
        }
        if (userMantle.equalsIgnoreCase("Templar")){
            //Substitution Principle
            //An instance of a subclass can take the place of an instance of any of its superclasses 
            //In Java, variables holding object types are polymorphic variables - they can hold objects of different acceptable types
            //A new player is being creates of the type Templar as the user picked this mantle
            Player player = new Templar(userName, userMantle);
            //Substitution Principle - using a polymorphic variable's Player one & String description - starts the fight scene and encounters first enemy
            new Fights().battleground(player, "the Forge of the Phoenix");
        }
    }
}
