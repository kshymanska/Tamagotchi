package MyApp;

public class Pig extends Animal {

    public void eat() {
        System.out.println("Pig is eating...");
        System.out.println("Pig is full-fed! And it's energy now is: " + energy + "%. Needs to sleep, to start growing a fat:)");
        isHungry = false;
        energy -= 90;
        incrementAge();
        energyStatus();
    }

    public void sleep() {
        System.out.println("Pig is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to  " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }
}
