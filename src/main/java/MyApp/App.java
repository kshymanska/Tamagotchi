package MyApp;

import java.util.Scanner;

public class App {

    static Animal userAnimal; // User's animal, which will be used for all actions automatically
    static String userAnimalString; // Used only to save the user's choice from console and create a needed animal object
    static Scanner userInput = new Scanner(System.in);

    // START OF MAIN METHOD
    public static void main(String[] args) {

        // Step 1 - Choose an animal
        System.out.println("Choose a pet (" + getTypesList() + "):");
        createAnimal(userAnimal());

        // Step 2 - Choose a name
        System.out.println("Give your pet a name:");
        userAnimal.setName(userInput.next());

        // Step 3 - Animal is created + info messages for user (energy, isHungry)
        System.out.println("Your pet is a " + userAnimalString.toLowerCase() + " and it's name is " + userAnimal.getName());
        System.out.println("It has " + userAnimal.energy + "% energy and " + userAnimal.isHungryStatus());
        System.out.println();

        userAnimal.feedCheck();
    }
    // END OF MAIN METHOD

    // PERSONAL METHODS
    // Get user animal from console
    public static String userAnimal() {
        if(userInput.hasNext("Cat")
            || userInput.hasNext("Dog")
            || userInput.hasNext("Mouse")
            || userInput.hasNext("Rabbit")){
            userAnimalString = userInput.next();
        } else {
            System.err.println("We don't have such an animal, please choose from the list:");
            userInput.next();
            userAnimalString = userAnimal();
        }
        return userAnimalString;
    }

    // Create a needed object of animal according to the user's input animal
    public static void createAnimal(String animal) {
        if (animal.equals("Cat")) {
            userAnimal = new Cat();
        } else if (animal.equals("Dog")) {
            userAnimal = new Dog();
        } else if (animal.equals("Mouse")) {
            userAnimal = new Mouse();
        } else if (animal.equals("Rabbit")) {
            userAnimal = new Rabbit();
        }
    }

    // Getting list of animals types (received from enum "Types")
    public static String getTypesList() {
        String types = Type.CAT.name().toLowerCase() + ", " +
            Type.DOG.name().toLowerCase() + ", " +
            Type.MOUSE.name().toLowerCase() + ", " +
            Type.RABBIT.name().toLowerCase();
        return types;
    }

    // Get the user's answer from the console (Yes/No)
    public static String getAnswer() {
        String answer;
    if (userInput.hasNext("Y")
            || userInput.hasNext("N")) {
            answer = userInput.next();
        } else {
            System.err.println("We don't understand you. Please answer yes (Y) or no (N):");
            userInput.next();
            answer = getAnswer();
        }
        return answer;
    }

    // Get user's choice about actions
    public static String getAction() {
        String action = "unknown";
        if (userAnimal.getAge() < 7) {
            System.out.println("Which action should we do? (Eat, sleep, walk, play, voice):");
            if (userInput.hasNext("Eat")
                    || userInput.hasNext("Sleep")
                    || userInput.hasNext("Walk")
                    || userInput.hasNext("Play")
                    || userInput.hasNext("Voice")) {
                action = userInput.next();
            } else {
                System.err.println("Your pet can't do such an action, please try again:");
                userInput.next();
                action = getAction();
            }
        } else {
            userAnimal.animalDie();
        }
        return action;
    }

    // Perform user's choice action
    public static void performAction(String action) {
        if (action.equals("Eat")) {
            userAnimal.eat();
        } else if (action.equals("Sleep")) {
            userAnimal.sleep();
        } else if (action.equals("Play")) {
            userAnimal.play();
        } else if (action.equals("Voice")) {
            userAnimal.voice();
        } else if (action.equals("Walk")) {
            userAnimal.walk();
        }
    }
}
