package MyApp;

public class Pig extends Animal {

    public String getGender() {
        if (getGender().equals("М")) {
            return "Кабанчик";
        } else {
            return "Свинка";
        }
    }

    public void eat() {
        System.out.println("Свинка кушает... Что хозяин даст, то и кушает!:)");
        energy -= 90;
        System.out.println("Свинка сыта! И ее энергия теперь: " + energy + "%. Нужно поспать, чтобы жирок завязался:)");
    }

    public void sleep() {
        System.out.println("Свинка спит и изредка похрюкивает...");
        energy = 100;
        System.out.println("Энергия восстановлена на " + energy + "%");
    }
}
