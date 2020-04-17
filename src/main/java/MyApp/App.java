package MyApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Animal.animalType = setAnimal();

    }

    // Считываем пользовательское животное с консоли
    public static String setAnimal() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Выберите питомца (Кот, Собака, Свинка, Кролик):");
        String animalType;
        if(userInput.hasNext("Кот") || userInput.hasNext("Собака") || userInput.hasNext("Свинка") || userInput.hasNext("Кролик")){
            animalType = userInput.next();
        } else {
            System.err.println("У нас пока нет такого животного, пожалуйства выберите животное из списка:");
            userInput.next();
            animalType = setAnimal();
        }
        userInput.close();
        return animalType;
    }

    // Выбираем действие
    public static String chooseAction() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Выберите действие:");
        String action;
        if (userInput.hasNext("Кушать") || userInput.hasNext("Спать") || userInput.hasNext("Гулять") || userInput.hasNext("Голос")) {
            action = userInput.next();
        } else {
            System.err.println(Animal.animalType + " пока не умеет делаьть такое действие. Пожалуйста, выбери из списка:");
            Animal.allActions();
            userInput.next();
            action = chooseAction();
        }
        userInput.close();
        return action;
    }

    // Создаем обьект нужного класса исходя из пользовательского выбора
//    public static void initAnimal() {
//        String animalType = Animal.animalType;
//        switch (animalType) {
//            case "Кот":
//                Cat cat = new Cat();
//                break;
//            case "Собака":
//                Dog dog = new Dog();
//                break;
//            case "Свинка":
//                Pig pig = new Pig();
//                break;
//            case "Кролик":
//                Rabbit rabbit = new Rabbit();
//                break;
//        }
//    }
}
