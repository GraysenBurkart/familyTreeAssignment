public class Rabbit extends PassiveAnimal{
    private String rabbitFoot;
    private int footValue;
    private String luckyFoot;
    private int luckyFootValue = footValue * 3;
    private int luck2 = 10;

    Rabbit (String name, double health) {
        super(name, health);
        footValue = 5;
    }

    public void rabbitFootType() {
        int luckyChance1 = (int)(Math.random() * luck2);
        int luckyChance2 = (int)(Math.random() * luck2);

        if (luckyChance1 == luckyChance2){
            System.out.println("This rabbit's foot is lucky! I bet if I craft with it, it'll make me really fast");
        }else{
            System.out.println("This is a rabbit's foot. Maybe if I craft with it, it'll make me faster.");
        }
    }
}
