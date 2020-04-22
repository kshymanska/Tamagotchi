package MyApp;

public class Dog extends Animal implements Play, Walk {

    // EAT (cost 30 energy points)
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

    // SLEEP (cost anything, restored energy to 100 points)
    public void sleep() {
        System.out.println("Dog is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Woof, woof!");
        incrementAge();
        energyStatus();
    }

    // PLAY (cost 50 energy points)
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

    // WALK (cost 50 energy points)
    public void walk() {
        if (energy >= 50 && energy <= 100) {
            System.out.println(getName() + "is walking in the garden...");
            energy -= 50;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to walk!");
            energyStatus();
        }
    }
}
