public abstract class AggressiveAnimal extends Animal {
    protected double attack;

    AggressiveAnimal(String name, double health, double attack){
        super(name, health);
        this.attack = attack;
    }

    public void attack(Object target, double targetHealth){
        System.out.printf("%s has been dealt %f points of damage.%n%s has ", target, attack, target);
        targetHealth = targetHealth - attack;
        System.out.printf("%f health now.%n", targetHealth);
    }
}
