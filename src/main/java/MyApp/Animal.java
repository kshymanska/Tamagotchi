package MyApp;

public abstract class Animal {

    private String name;
    private String gender;
    protected int energy;
    protected boolean isHungry;

    public Animal() {
        energy = 100;
        isHungry = true;
    }

    // Name set, get
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // Gender set, get
    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract String getGender();

    public abstract void eat();
    public abstract void sleep();
}
