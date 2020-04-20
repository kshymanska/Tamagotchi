package MyApp;

import java.util.Scanner;

public class App {

    static Animal userAnimal;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Выбираем питомца
        System.out.println("Выберите питомца (Кот, Собака, Свинка, Кролик):");
        String animal = getUserAnimal();

        if (animal.equals("Кот")) {
            userAnimal = new Cat();
        } else if (animal.equals("Собака")) {
            userAnimal = new Dog();
        } else if (animal.equals("Свинка")) {
            userAnimal = new Pig();
        } else if (animal.equals("Кролик")) {
            userAnimal = new Rabbit();
        }

        //Выбираем пол питомца
        System.out.println("Выберите пол своего питомца (М/Ж):");
        userAnimal.setGender(userAnimalGender());

        //Выбираем имя питомца
        System.out.println("Введите имя своего питомца:");
        userAnimal.setName(userInput.next());

        System.out.println("Ваш питомец - " + userAnimal.getGender() + ". Кличка - " + userAnimal.getName());
        System.out.println();

        System.out.println("Давайте выполним какое-нибудь действие (Кушать, Спать):");
        String action = getAction();
        switch (action) {
            case "Кушать":
                userAnimal.eat();
            case "Спать":
                userAnimal.sleep();
        }
    }

    public static String getUserAnimal() {
        String animalType;
        if(userInput.hasNext("Кот") || userInput.hasNext("Собака") || userInput.hasNext("Свинка") || userInput.hasNext("Кролик")){
            animalType = userInput.next();
        } else {
            System.err.println("У нас пока нет такого животного, пожалуйства выберите животное из списка:");
            userInput.next();
            animalType = getUserAnimal();
        }
        return animalType;
    }

    public static String getAction() {
        String action;
        if(userInput.hasNext("Кушать") || userInput.hasNext("Спать")){
            action = userInput.next();
        } else {
            System.err.println("Ваш питомец пока не умеет делать такое действие, пожалуйста повторите ввод:");
            userInput.next();
            action = getAction();
        }
        return action;
    }

    public static String userAnimalGender() {
        String gender;
        if (userInput.hasNext("М") || userInput.hasNext("Ж")) {
            gender = userInput.next();
        } else {
            System.err.println("Такого пола не существует, повторите ввод:");
            userInput.next();
            gender = userAnimalGender();
        }
        return gender;
    }
}
