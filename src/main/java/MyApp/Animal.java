package MyApp;

public abstract class Animal implements Play, Walk {

    private String name;
    private int age;
    private final String ANIMAL_TYPE;
    protected int energy;
    protected boolean isHungry;

    public Animal(String type) {
        age = 0;
        energy = 100;
        isHungry = true;
        this.ANIMAL_TYPE = type;
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
    public String printAge() {
        if (getAge() <= 1) {
            return getName() + " is " + age + " year old now.";
        } else {
            return getName() + " is " + age + " years old now.";
        }
    }

    // ANIMAL TYPE
    public String getUserAnimalType() {
        return ANIMAL_TYPE;
    }

    // HUNGER CHECK
    public void feedCheck() {
        if (age < 7) {
            if (isHungry) {
                System.out.println(getName() + " is hungry. Let's feed your pet? (Y/N):");
                String answer = App.getAnswer();
                if (answer.equals("Y") || answer.equals("y")) {
                    eat();
                } else {
                    App.performAction(App.getAction());
                }
            } else {
                App.performAction(App.getAction());
            }
        }
    }

    // ENERGY CHECK
    public void energyStatus() {
        if (age < 7) {
            if (energy <= 20) {
                System.out.println("Your pet energy is " + energy + "%. Let's sleep a bit? (Y/N):");
                String answer = App.getAnswer();
                if (answer.equals("Y") || answer.equals("y")) {
                    sleep();
                } else {
                    App.performAction(App.getAction());
                }
            } else {
                System.out.println("Your pet energy is " + energy + "%.");
                App.performAction(App.getAction());
            }
        }
    }

    // ANIMAL DIE
    public void animalDie() {
        if (age == 7) {
            System.err.println(getName() + " became an old " + getUserAnimalType() +
                ". It means that it's time to move to the sky. You can restart the app and create a new pet.");
        }
    }

    // EAT
    public abstract void eat();
    // SLEEP
    public abstract void sleep();
    // VOICE
    public abstract void voice();
}
