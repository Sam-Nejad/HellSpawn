//imports java scanner to  get user input
import java.util.Scanner;
//This is the main gameplay element including battles between players and enemies
public class Fights extends Main
{
   //Outputs the battleground where  the fight will take place and what enemy the player encounters      
   public void battleground(Player one, String description){
        //Outputs the players name and the scene description
        System.out.println(one.getName() + " arrives at " + description);
        //Create a random enemy for the player to fight
        Enemy enemy = new Enemy(one.getLevel());
        System.out.println("\nYou stumble into " + enemy.getName() + " the " + enemy.getMantle());
        //Starts a battle between the player and the random enemy
        battle(one, enemy);
    }
   //Outputs the dammage the player delt to the enemy
   public String attack(Characters one, Characters two){
        int i = one.attack(two);
        return one.getName() + " hit " + two.getName() + " for " + i + " damage.";
    }
   //The main battle gameplay and how the user can input commands into the game i.e. Attack or Flee
   public void battle(Player one, Characters two){
        //outputs the enemy information
        System.out.println(two);
        while(true){
            Scanner readChoice = new Scanner(System.in);
            System.out.print("\nWhat do you want to do (Attack, Flee): ");
            String userChoice = readChoice.nextLine();
            while(true){
                if(!userChoice.equalsIgnoreCase("Flee") && !userChoice.equalsIgnoreCase("Attack")){
                    System.out.println("Please enter valid choice");
                    readChoice = new Scanner(System.in);
                    System.out.print("\nWhat do you want to do (Attack or Flee): ");
                    userChoice = readChoice.nextLine();
                }else{
                    break;
                }
            }
            if(userChoice.equalsIgnoreCase("Flee")){ 
                    System.out.println("You have fled the battle.");
                    break;
            }else if(userChoice.equalsIgnoreCase("Attack")){ 
                //Allows the player to attack the enemy
                System.out.println(attack(one, two));
            }
            if(!two.isDead()){
                //If the enemy is still alive it attacks ths player back
                System.out.println(attack(two, one));
                //Outputs the player's status
                System.out.println(one.status());
                break;
            }
        }
        }
}
