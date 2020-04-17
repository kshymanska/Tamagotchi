package MyApp;

public abstract class Animal {

    protected String name;
    protected static String animalType;

//    public void eat() {
//
//    }
//    public abstract void sleep();
//    public abstract void walk();
//    public abstract void voice();
    public static void allActions() {
        System.out.println("Кушать, Спать, Гулять, Голос");
    }
}
