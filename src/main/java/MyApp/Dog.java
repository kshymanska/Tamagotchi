package MyApp;

public class Dog extends Animal implements Play {

    public void eat() {
        if (energy >= 30 && energy <= 100) {
            System.out.println("Dog is eating...");
            System.out.println("Dog is full-fed! And it's energy now is: " + energy +
                    "%. It's enough energy to play ball a bit:)");
            isHungry = false;
            energy -= 30;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to eat!");
            energyStatus();
        }
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

    public void voice() {
        System.out.println("Woof, woof!");
        energyStatus();
    }

    public void play() {
        if (energy >= 50 && energy <= 100) {
            System.out.println("Ok " + getName() + ", let's play!");
            System.out.println("Dog is playing with a ball...");
            energy -= 50;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to play!");
            energyStatus();
        }
    }
}
