package MyApp;

public class Cat extends Animal {

    public String getGender() {
        if (getGender().equals("М")) {
            return "Кот";
        } else {
            return "Кошка";
        }
    }


    public void eat() {
        System.out.println("Кот кушает кошачий корм...");
        energy -= 80;
        System.out.println("Кот сыт! И его энергия теперь: " + energy + "%. Помоему пора немного поспать:)");

    }

    public void sleep() {
        System.out.println("Кот спит и сладко посапывает...");
        energy = 100;
        System.out.println("Энергия восстановлена на " + energy + "%");
    }

}
