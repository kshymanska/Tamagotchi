package MyApp;

import java.util.Scanner;

public class App {

    static Animal userAnimal; // User's animal, which will be used for all actions automatically
    static Scanner userInput = new Scanner(System.in);

    // START OF MAIN METHOD
    public static void main(String[] args) {

        // Step 1 - Choose an animal
        System.out.println("Choose a pet (" + getTypesList() + "):");
        createAnimal(getUserAnimal());

        // Step 2 - Choose a name
        System.out.println("Give your pet a name:");
        userAnimal.setName(userInput.next());

        // Step 3 - Animal is created + info messages for user
        System.out.println("Your pet is a " + userAnimal.getUserAnimalType() + " and it's name is " + userAnimal.getName());
        System.out.println(userAnimal.getName() + " has " + userAnimal.energy + "% energy.");
        System.out.println();

        userAnimal.feedCheck();
    }
    // END OF MAIN METHOD

    // PERSONAL METHODS
    // Get user animal from console
    public static String getUserAnimal() {
        String userAnimal;
        if(userInput.hasNext("cat")
                || userInput.hasNext("Cat")
                || userInput.hasNext("dog")
                || userInput.hasNext("Dog")
                || userInput.hasNext("mouse")
                || userInput.hasNext("Mouse")
                || userInput.hasNext("rabbit")
                || userInput.hasNext("Rabbit")){
            userAnimal = userInput.next();
        } else {
            System.err.println("We don't have such an animal, please choose from the list:");
            userInput.next();
            userAnimal = getUserAnimal();
        }
        return userAnimal;
    }

    // Create a needed object of animal according to the user's input animal
    public static void createAnimal(String animal) {
        if (animal.equals("cat") || animal.equals("Cat")) {
            userAnimal = new Cat(Type.CAT.name().toLowerCase());
        } else if (animal.equals("dog") || animal.equals("Dog")) {
            userAnimal = new Dog(Type.DOG.name().toLowerCase());
        } else if (animal.equals("mouse") || animal.equals("Mouse")) {
            userAnimal = new Mouse(Type.MOUSE.name().toLowerCase());
        } else if (animal.equals("rabbit") || animal.equals("Rabbit")) {
            userAnimal = new Rabbit(Type.RABBIT.name().toLowerCase());
        }
    }

    // Getting list of animals types (received from enum "Types")
    public static String getTypesList() {
        return Type.CAT.name().toLowerCase() + ", " +
            Type.DOG.name().toLowerCase() + ", " +
            Type.MOUSE.name().toLowerCase() + ", " +
            Type.RABBIT.name().toLowerCase();
    }

    // Get the user's answer from the console (Yes/No)
    public static String getAnswer() {
        String answer;
        if (userInput.hasNext("Y") || userInput.hasNext("y")) {
            answer = userInput.next();
        } else if (userInput.hasNext("N") || userInput.hasNext("n")) {
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
            System.out.println("Which action should we do? (eat - e, sleep - s, walk - w, play - p, voice - v):");
            if (userInput.hasNext("e")
                    || userInput.hasNext("E")
                    || userInput.hasNext("eat")
                    || userInput.hasNext("Eat")) {
                action = userInput.next();
            } else if (userInput.hasNext("s")
                    || userInput.hasNext("S")
                    || userInput.hasNext("sleep")
                    || userInput.hasNext("Sleep")) {
                action = userInput.next();
            } else if (userInput.hasNext("w")
                    || userInput.hasNext("W")
                    || userInput.hasNext("walk")
                    || userInput.hasNext("Walk")) {
                action = userInput.next();
            } else if (userInput.hasNext("p")
                    || userInput.hasNext("P")
                    || userInput.hasNext("play")
                    || userInput.hasNext("Play")) {
                action = userInput.next();
            } else if (userInput.hasNext("v")
                    || userInput.hasNext("V")
                    || userInput.hasNext("voice")
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
        if (action.equals("e")
            || action.equals("E")
            || action.equals("eat")
            || action.equals("Eat")) {
            userAnimal.eat();
        } else if (action.equals("s")
            || action.equals("S")
            || action.equals("sleep")
            || action.equals("Sleep")) {
            userAnimal.sleep();
        } else if (action.equals("p")
            || action.equals("P")
            || action.equals("play")
            || action.equals("Play")) {
            userAnimal.play();
        } else if (action.equals("v")
            || action.equals("V")
            || action.equals("voice")
            || action.equals("Voice")) {
            userAnimal.voice();
        } else if (action.equals("w")
            || action.equals("W")
            || action.equals("walk")
            || action.equals("Walk")) {
            userAnimal.walk();
        }
    }
}
