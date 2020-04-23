package MyApp;

public class Mouse extends Animal implements Play, Walk {

    public Mouse(String type) {
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
        System.out.println("Your mouse " + getName() + " is sleeping...");
        energy = 100;
        incrementAge();
        System.out.println("Energy is restored to  " + energy + "%. " + printAge());
        if (getAge() < 7) {
            App.performAction(App.getAction());
        } else {
            animalDie();
        }
    }

    // VOICE (cost anything, just gives voice)
    public void voice() {
        System.out.println("Pi-pi-pi-pi!");
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

    // PLAY (cost 40 energy points)
    public void play() {
        if (energy >= 40 && energy <= 100) {
            System.out.println(getName() + " is playing with a wheel ...");
            energy -= 40;
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
        System.out.println("Mouses don't walk! They live all their life inside of the house");
        incrementAge();
        System.out.println(printAge());
        if (getAge() < 7) {
            energyStatus();
        } else {
            animalDie();
        }
    }

}
