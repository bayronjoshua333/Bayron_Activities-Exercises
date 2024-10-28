package Bayron_L12Activty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your dragons: (Fire, Air, Wind, Stone)");

        System.out.print("Choose Dragon 1: ");
        String dragon1Type = scanner.nextLine();
        Dragon dragon1 = createDragon(dragon1Type);

        System.out.print("Choose Dragon 2: ");
        String dragon2Type = scanner.nextLine();
        Dragon dragon2 = createDragon(dragon2Type);

  
        Game game = new Game(dragon1, dragon2);
        game.startBattle();
    }

 
    public static Dragon createDragon(String type) {
        switch (type.toLowerCase()) {
            case "fire":
                return new Dragon("Fire", "Ember", 27, "Punch", 23, 100);
            case "air":
                return new Dragon("Air", "Gust", 27, "Kick", 23, 100);
            case "wind":
                return new Dragon("Water", "Water bomb", 25, "Slam", 28, 100);
            case "stone":
                return new Dragon("Stone", "Rock Throw", 28, "Smack", 22, 100);
            default:
                System.out.println("You're lucky you have Rare Dragon.");
                return new Dragon("Rare", "Ember", 99, "Punch", 1, 100);
        }
    }
}