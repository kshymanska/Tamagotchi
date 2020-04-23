package MyApp;

public class Dog extends Animal implements Play, Walk {

    public Dog(String type) {
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
        System.out.println("Your dog " + getName() + " is sleeping...");
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
        System.out.println("Woof, woof!");
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

    // PLAY (cost 50 energy points)
    public void play() {
        if (energy >= 50 && energy <= 100) {
            System.out.println(getName() + " is playing with a ball...");
            energy -= 50;
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

    // WALK (cost 50 energy points)
    public void walk() {
        if (energy >= 50 && energy <= 100) {
            System.out.println(getName() + "is walking in the garden...");
            energy -= 50;
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
