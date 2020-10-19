//Super mantle of both Player and Enemy mantlees, sets shared variables and basic methods for fights between players and enemies. 
public class Characters{
    // instance variables
    public String name;
    public String mantle;
    public int maxhealth;
    public int maxattack;
    public int minattack;
    public int level;
    public int currenthealth;
    // for the characters name and mantle
    public Characters(String name, String mantle){
        this.name = name;
        this.mantle = mantle;
    }
    // returns current hp
    public int getcurrenthealth(){
        return currenthealth;
    }
    // sets current hp
    public void setcurrenthealth(int hp){
            currenthealth = hp;
    }
    // gets characters name
    public String getName(){
         return name;
     }
    // sets characters name
    public void setName(String name){
         this.name = name; 
    }
    // get characters mantle
    public String getMantle(){
        return mantle;
    }
    // sets characters name
    public void setMantle(String mantle){
        this.mantle = mantle;
    }
    // get characters max hp
    public int getmaxhealth(){
        return maxhealth;
    }
    // get chracters level
    public int getLevel(){
        return level;
    }
    // returns characters status
    public String status(){
        return name + " has " + currenthealth + "/" + maxhealth + " health" + " and has " + minattack + "/" + maxhealth+ " attack.";
    }
    public String toString(){
        return name +  " the " + mantle + " has " + currenthealth + "/" + maxhealth + " health and an attack of " + minattack + "-" + maxattack;
    }
    // to determine attackack in fights
    public int attack(Characters other){
        int attack = (int)(Math.random() * (this.maxattack - this.minattack + 1) + this.minattack);
        return attack;
    }
    // to determine if character is dead
    public boolean isDead(){
        if(this.currenthealth <= 0){
            return true;
        }else{
            return false;
        }
    }
}