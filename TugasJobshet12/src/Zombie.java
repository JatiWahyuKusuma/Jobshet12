public class Zombie implements Destroyable{
    public int health;
    public int level;

    public Zombie(){

    }

    public Zombie(int health, int level){
        this.health = health;
        this.level = level;
    }
   
    public void Heal(){

    }
    
    public void destroyed(){

    }

    public String getZombieInfo(){
        return "Health  :"+health+"\n"+"level   :"+level;
    }
}
