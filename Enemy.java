//Supclass of the character class, inherits and changes shared variables and basic methods for fights between players and enemies. 
public class Enemy extends Characters
{
    //main methods the creates and random enemy with a random name and random mantle
    public Enemy(int leveled){
        super("", "");
        this.level = 1;
        this.setName(randomName());
        this.setMantle(randomMantle());
        stats();
        this.currenthealth = maxhealth;
    }
    //pulls a random name from an array
    public String randomName(){
        String[] names = {"Frightening", "Terrifying","Bloodcurdling","Spinechilling","Sinister","Menacing","Ominous", "Spooky", "Scary", "Baleful"};
        int i = (int)(Math.random() * names.length);
        return names[i];

    }
    //pulls a random mantle from an array, these are pased to mantleToNumber
    public String randomMantle(){
        String[] mantles = {"Fiend", "Demon", "Hellhound"};
        int i = (int)(Math.random() * mantles.length);
        return mantles[i];
    }
    //rolls the enemy stats so as they are random every time
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