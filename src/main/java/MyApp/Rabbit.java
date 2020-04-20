package MyApp;

public class Rabbit extends Animal {

    public String getGender() {
        if (getGender().equals("М")) {
            return "Кролик";
        } else {
            return "Крольчиха";
        }
    }

    public void eat() {
        System.out.println("Кролик кушает специальный корм для кроликов...");
        energy -= 40;
        System.out.println("Кролик сыт! И его энергия теперь: " + energy + "%. Можно еще немного попрыгать:)");
    }

    public void sleep() {
        System.out.println("Кролик спит...");
        energy = 100;
        System.out.println("Энергия восстановлена на " + energy + "%");
    }
}
