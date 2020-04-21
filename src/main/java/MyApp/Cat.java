package MyApp;

public class Cat extends Animal {

    public void eat() {
        System.out.println("Cat is eating...");
        System.out.println("Cat is full-fed!");
        isHungry = false;
        energy -= 80;
        incrementAge();
        energyStatus();
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
        energy = 100;
        System.out.println("Energy restored to " + energy + "%");
        incrementAge();
        App.performAction(App.getAction());
    }

}
