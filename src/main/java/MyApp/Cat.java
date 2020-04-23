package MyApp;

public class Cat extends Animal implements Play, Walk {

    public Cat(String type) {
        super(type);
    }

    // EAT (costs anything)
    public void eat() {
        System.out.println(getName() + " is eating...");
        isHungry = false;
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

    // SLEEP (cost anything, restores energy to 100 points)
    public void sleep() {
        System.out.println("Your cat " + getName() + " is sleeping...");
        energy = 100;
        incrementAge();
        System.out.println("Energy restored to " + energy + "%. " + printAge());
        if (getAge() < 7) {
            App.performAction(App.getAction());
        } else {
            animalDie();
        }
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Meow, meow!");
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
        if (energy >= 80 && energy <= 100) {
            System.out.println(getName() + " is playing with a bow...");
            energy -= 80;
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

    // WALK (cost anything)
    public void walk() {
        System.out.println("Cats don't walk!");
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }
}
