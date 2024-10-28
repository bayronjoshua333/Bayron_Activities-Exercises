package Bayron_L12Activty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select Dragon 1
        System.out.println("Select CharDragon1 (Fire, Air, Water, Earth): ");
        String dragon1Type = scanner.next();
        System.out.println("Enter Skill 1 for Dragon 1: ");
        int dragon1Skill1 = scanner.nextInt();
        System.out.println("Enter Skill 2 for Dragon 1: ");
        int dragon1Skill2 = scanner.nextInt();
        Dragon dragon1 = new Dragon(dragon1Type, dragon1Skill1, dragon1Skill2, 100); // Assuming health starts at 100

        // Select Dragon 2
        System.out.println("Select CharDragon2 (Fire, Air, Water, Earth): ");
        String dragon2Type = scanner.next();
        System.out.println("Enter Skill 1 for Dragon 2: ");
        int dragon2Skill1 = scanner.nextInt();
        System.out.println("Enter Skill 2 for Dragon 2: ");
        int dragon2Skill2 = scanner.nextInt();
        Dragon dragon2 = new Dragon(dragon2Type, dragon2Skill1, dragon2Skill2, 100);

        // Start the game
        Game game = new Game(dragon1, dragon2);
        game.battle();
    }
}
