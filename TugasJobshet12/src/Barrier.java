public class Barrier implements Destroyable {
    public int Strength;

    public Barrier(int Strength){
        this.Strength = Strength;
    }

    public void setStrength(int Strength){
        this.Strength = Strength;
    }

    public int getStrength(){
        return Strength;
    }

    public void destroyed(){
        Strength *= 0.9;
    }

    public String getBarrierinfo(){
        String info = "Barrier Strength :"+Strength+"\n";
        return info;
    }
}
