package MyApp;

public class Rabbit extends Animal implements Play, Walk {

    public Rabbit(String type) {
        super(type);
    }

    // EAT (cost anything)
    public void eat() {
        System.out.println(getName() + " is eating...");
        isHungry = false;
        incrementAge();
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

    // SLEEP (cost anything, restores energy to 100 points)
    public void sleep() {
        System.out.println("Your rabbit " + getName() + " is sleeping...");
        energy = 100;
        incrementAge();
        System.out.println("Energy is restored to " + energy + "%. " + printAge());
        if (getAge() < 7) {
            App.performAction(App.getAction());
        } else {
            animalDie();
        }
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Rabbit can't make a sound:(");
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

    // PLAY (cost 30 energy points)
    public void play() {
        if (energy >= 30 && energy <= 100) {
            System.out.println(getName() + " is playing with a wheel ...");
            energy -= 30;
            isHungry = true;
            incrementAge();
            System.out.println(printAge());
            if (getAge() < 7) {
                feedCheck();
            } else {
                animalDie();
            }
        } else {
            System.out.println("Not enough energy to play!");
            energyStatus();
        }
    }

    // WALK (cost 20 energy points)
    public void walk() {
        if (energy >= 20 && energy <= 100) {
            System.out.println(getName() + "is walking in the garden...");
            energy -= 20;
            incrementAge();
            System.out.println(printAge());
            if (getAge() < 7) {
                energyStatus();
            } else {
                animalDie();
            }
        } else {
            System.out.println("Not enough energy to walk!");
            energyStatus();
        }
    }
}
