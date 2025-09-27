public class Bear extends AggressiveAnimal {
    private double heavyAttck;

    Bear(String name, double health, double attack) {
        super(name, health, attack);
        heavyAttck = attack + 10;
    }

    public void specialAttck(Object target, double targetHealth) {
        System.out.printf("%s has been dealt %f points of damage.%n%s has ", target, heavyAttck, target);
        targetHealth = targetHealth - heavyAttck;
        System.out.printf("%f health now.%n", targetHealth);
    }
}
