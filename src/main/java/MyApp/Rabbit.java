package MyApp;

public class Rabbit extends Animal {

    public void eat() {
        System.out.println("Rabbit is eating...");
        System.out.println("Rabbit is full-fed! And it's energy now is: " + energy + "%. It's enough energy to jump a bit:)");
        isHungry = false;
        energy -= 40;
        incrementAge();
        energyStatus();
    }

    public void sleep() {
        System.out.println("Rabbit is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }
}
