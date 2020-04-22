package MyApp;

public class Cat extends Animal implements Play {

    public void eat() {
        if (energy >= 80 && energy <=100) {
            System.out.println("Cat is eating...");
            System.out.println("Cat is full-fed!");
            isHungry = false;
            energy -= 80;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to eat!");
            energyStatus();
        }
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
        energy = 100;
        System.out.println("Energy restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

    public void voice() {
        System.out.println("Meow, meow");
        energyStatus();
    }

    public void play() {
        if (energy >= 30 && energy <= 100) {
            System.out.println("Ok " + getName() + ", let's play!");
            System.out.println("Cat is playing with a bow...");
            energy -= 30;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to play!");
//            energyStatus();
        }
    }
}
