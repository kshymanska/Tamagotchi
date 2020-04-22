package MyApp;

public class Mouse extends Animal implements Play {

    public void eat() {
        if (energy >= 10 && energy <= 100) {
            System.out.println("Mouse is eating...");
            System.out.println("Mouse is full-fed! And it's energy now is: " + energy + "%. Needs to sleep, to start growing a fat:)");
            isHungry = false;
            energy -= 10;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to eat!");
            energyStatus();
        }
    }

    public void sleep() {
        System.out.println("Mouse is sleeping...");
        energy = 100;
        System.out.println("Energy is restored to  " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

    public void voice() {
        System.out.println("Pi-pi-pi-pi");
    }

    public void play() {
        if (energy >= 40 && energy <= 100) {
            System.out.println("Ok " + getName() + ", let's play!");
            System.out.println("Mouse is playing with a wheel ...");
            energy -= 40;
            incrementAge();
            energyStatus();
        } else {
            System.out.println("Not enough energy to play!");
            energyStatus();
        }
    }
}
