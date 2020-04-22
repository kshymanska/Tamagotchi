package MyApp;

public class Cat extends Animal implements Play, Walk {

    // EAT (cost 80 energy points)
    public void eat() {
        if (energy >= 80 && energy <=100) {
            System.out.println("Cat is eating...");
            System.out.println("Cat is full-fed!");
            isHungry = false;
            energy -= 80;
            incrementAge();
            printAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to eat!");
            energyStatus();
        }
    }

    // SLEEP (cost anything, restored energy to 100 points)
    public void sleep() {
        System.out.println("Cat is sleeping...");
        energy = 100;
        System.out.println("Energy restored to " + energy + "%");
        incrementAge();
        printAge();
        App.performAction(App.getAction());
        energyStatus();
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Meow, meow");
        incrementAge();
        printAge();
        energyStatus();
    }

    // PLAY (cost 30 energy points)
    public void play() {
        if (energy >= 30 && energy <= 100) {
            System.out.println("Ok " + getName() + ", let's play!");
            System.out.println("Cat is playing with a bow...");
            energy -= 30;
            incrementAge();
            printAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to play!");
            energyStatus();
        }
    }

    // WALK (cost anything)
    public void walk() {
        System.out.println("Cats don't walk! They live all their life inside of the house!");
        incrementAge();
        printAge();
        energyStatus();
    }
}
