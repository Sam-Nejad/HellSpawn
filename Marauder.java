//Supclass of Player class, uses shared variables and basic methods for the playable mantles. 
class Marauder extends Player 
{
    //constructor for new Marauder
    public Marauder(String name, String mantle) 
    {
        super(name, "Marauder");
        stats();
    }
    //Dynamic binding is happening since these methods are not static, private and final.
    //rolling for intitial stats
    public void stats(){
        int health = 13;
        int attack = 13;
        maxhealth = (roll(7) + health);
        maxattack = (roll(7) + attack); 
        minattack = (maxattack - 3); 
    }
    //the random roll function used in the above method
    private int roll(int s){
        int roll = (int)(Math.random() * s + 1);
        return roll;
    }
}
