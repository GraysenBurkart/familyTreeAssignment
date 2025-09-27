public abstract class PassiveAnimal extends Animal {
    protected int luck;

    PassiveAnimal (String name, double health){
        super(name, health);
        luck = 4;
    }

    protected void escape() {

        int escapeChance = (int)(Math.random() * luck);
        int escapeLuck = (int)(Math.random() * luck);

        if (escapeChance == escapeLuck){
           System.out.printf("%s has escaped!%n", name);
        }else{
            System.out.printf("You caught %s!%n", name);
        }
    }
}
