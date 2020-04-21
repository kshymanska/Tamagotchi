package MyApp;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating...");
        System.out.println("Dog is full-fed! And it's energy now is: " + energy +
                "%. It's enough energy to play ball a bit:)");
        isHungry = false;
        energy -= 30;
        incrementAge();
        energyStatus();
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }
}
