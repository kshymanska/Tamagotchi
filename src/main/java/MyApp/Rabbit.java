package MyApp;

public class Rabbit extends Animal implements Play, Walk {

    // EAT (cost 40 energy points)
    public void eat() {
        if (energy >= 40 && energy <= 100) {
            System.out.println("Rabbit is eating...");
            System.out.println("Rabbit is full-fed! And it's energy now is: " + energy + "%. It's enough energy to jump a bit:)");
            isHungry = false;
            energy -= 40;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to eat!");
            energyStatus();
        }
    }

    // SLEEP (cost anything, restored energy to 100 points)
    public void sleep() {
        System.out.println("Rabbit is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Rabbit can't make a sound:(");
        incrementAge();
        energyStatus();
    }

    // PLAY (cost 30 energy points)
    public void play() {
        if (energy >= 30 && energy <= 100) {
            System.out.println("Ok " + getName() + ", let's play!");
            System.out.println("Rabbit is playing with a wheel ...");
            energy -= 30;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to play!");
            incrementAge();
            energyStatus();
        }
    }

    // WALK (cost 20 energy points)
    public void walk() {
        if (energy >= 20 && energy <= 100) {
            System.out.println(getName() + "is walking in the garden...");
            energy -= 20;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to walk!");
            energyStatus();
        }
    }
}
