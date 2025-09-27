

public class Main {
    public static void main(String[] args){
        System.out.println("Family Tree");

        Newt bob = new Newt ("Bob", 100);
        System.out.println(bob);
        bob.escape();

        Bear karen = new Bear("Karen", 150, 20);
        System.out.println(karen);

        Player gray = new Player ("Gray");
        System.out.println(gray);

        karen.attack(bob.name, bob.health);

        karen.specialAttck(bob.name, bob.health);

        Rabbit sean = new Rabbit("Sean", 100);
        sean.rabbitFootType();

    }

}
