public abstract class Animal {
    protected String name;
    public double health;

    Animal (String name, double health){
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString(){
        return name + " has " + health + " health.";
    }

    public double getHealth(Object target){
        return health;
    }
}

