package Bayron_L12Activty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your dragons: (Fire, Air, Wind, Stone)");

        // Select Dragon 1
        System.out.println("Choose Dragon 1: ");
        String dragon1Type = scanner.next();
        Dragon dragon1 = createDragon(dragon1Type);

        // Select Dragon 2
        System.out.println("Choose Dragon 2: ");
        String dragon2Type = scanner.next();
        Dragon dragon2 = createDragon(dragon2Type);

        // Start the game
        Game game = new Game(dragon1, dragon2);
        game.startBattle();
    }

    // Create a dragon based on type
    public static Dragon createDragon(String type) {
        switch (type.toLowerCase()) {
            case "fire":
                return new Dragon("Fire", "Ember", 10, "Punch", 5, 100);
            case "air":
                return new Dragon("Air", "Gust", 12, "Kick", 8, 100);
            case "wind":
                return new Dragon("Wind", "Breeze", 8, "Slam", 6, 100);
            case "stone":
                return new Dragon("Stone", "Rock Throw", 15, "Smack", 7, 100);
            default:
                System.out.println("Unknown dragon type, defaulting to Fire.");
                return new Dragon("Fire", "Ember", 10, "Punch", 5, 100);
        }
    }
}
