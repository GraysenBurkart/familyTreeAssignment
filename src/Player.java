public class Player {
    private String name;
    private double health;
    private double attack;

    Player(String name){
        this.name = name;
        health = 100;
        attack = 15;
    }

    @Override
    public String toString(){
        return name + " has " + health + " health and " + attack + " attack.";
    }

    public double getHealth(){
        return health;
    }
}
