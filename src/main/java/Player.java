public class Player {

    protected int id;
    protected String name;
    protected int strength;

    public Player(int id, String name, int strength){
        this.strength = strength;
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}