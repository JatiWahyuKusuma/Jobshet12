public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level){
        super(health, level);
    }

    public void health(){
        switch(level){
            case 1 : health *= 1.1; break;
            case 2 : health *= 2.2; break;
            case 3 : health *= 3.3; break;
        }
    }

    public void destroyed(){
        health -= 10/100*health; 
    }

    public String getZombieInfo(){
        return "Jumping Zombie data    :\n"+super.getZombieInfo();
    }
}
