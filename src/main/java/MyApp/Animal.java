package MyApp;

public abstract class Animal {

    private String name;
    private int age;
    protected int energy;
    protected boolean isHungry;

    public Animal() {
        age = 0;
        energy = 100;
        isHungry = true;
    }

    // NAME
    public void setName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // AGE
    public void incrementAge() {
        this.age++;
    }
    public int getAge() {
        return this.age;
    }

    // isHungry status
    public String isHungryStatus() {
        if (isHungry == true) {
            return "it's hungry.";
        } else {
            return "it's not hungry.";
        }
    }

    // Check, should we feed animal or now (if it's hungry)
    public void feedCheck() {
        if (age < 5) {
            if (isHungry == true) {
                System.out.println("Let's feed your pet? (Y/N):");
                if (App.getAnswer().equals("Y")) {
                    eat();
                } else {
                    App.performAction(App.getAction());
                }
            }
        } else {
            animalDie();
        }

    }

    // Check, should animal sleep or no
    public void energyStatus() {
        if (age < 5) {
            if (energy <= 30) {
                System.out.println("Your pet energy is " + energy + "%. Let's sleep a bit? (Y/N):");
                if (App.getAnswer().equals("Y")) {
                    sleep();
                } else {
                    App.performAction(App.getAction());
                }
            } else {
                System.out.println("Your pet energy is " + energy + "%");
                App.performAction(App.getAction());
            }
        } else {
            animalDie();
        }
    }

    public void animalDie() {
        if (age == 5) {
            System.out.println(getName() + "is " + age + " years ols now." +
                " It means that it's time to move to the sky. You can restart the app and create a new pet.");
        }
    }

    public abstract void eat();
    public abstract void sleep();
}
