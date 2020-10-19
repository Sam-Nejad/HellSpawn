//Super class of both Marauder, Duelist, and Templar classes, sets shared variables and basic methods for the playable mantles. 
public class Player extends Characters{
    //constructor for new players
    public Player(String name, String mantle){
        super(name, mantle);
        stats();
        this.currenthealth = maxhealth;
    }    
    //prints status of player
    public String status(int attack){
        return name + " has " + currenthealth + "/" + maxhealth + " health." + name + " has " + attack + " attack.";
    }
    //rolling for intitial stats
    public void stats(){
        int health = 0;
        int attack = 0;
    }
}