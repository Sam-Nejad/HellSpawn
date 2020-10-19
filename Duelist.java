//Supclass of Player class, uses shared variables and basic methods for the playable mantles. 
class Duelist extends Player 
{
    //constructor for new Duelist
    public Duelist(String name, String mantle) 
    {
        super(name, "Duelist");
        stats();
    }
    //Dynamic binding is happening since these methods are not static, private and final.
    //rolling for intitial stats
    public void stats(){
        int health = 16;
        int attack = 10;
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