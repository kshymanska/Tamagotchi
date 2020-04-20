package MyApp;

public class Dog extends Animal {

    public String getGender() {
        if (getGender().equals("М")) {
            return "Пёс";
        } else {
            return "Собака";
        }
    }

    public void eat() {
        System.out.println("Собака кушает собачий корм...");
        energy -= 30;
        System.out.println("Собака сыта! И ее энергия теперь: " + energy + "%. Хватит чтобы немного поиграть в мячик:)");
    }

    public void sleep() {
        System.out.println("Собака спит и похрапывает...");
        energy = 100;
        System.out.println("Энергия восстановлена на " + energy + "%");
    }
}
