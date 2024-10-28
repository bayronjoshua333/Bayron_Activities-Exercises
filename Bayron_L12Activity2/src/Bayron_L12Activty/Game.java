package Bayron_L12Activty;

import java.util.Scanner;

public class Game {
    private Dragon dragon1;
    private Dragon dragon2;

    public Game(Dragon dragon1, Dragon dragon2) {
        this.dragon1 = dragon1;
        this.dragon2 = dragon2;
    }

    public void startBattle() {
        Scanner scanner = new Scanner(System.in);

        while (dragon1.getHealth() > 0 && dragon2.getHealth() > 0) {
            // Dragon 1's turn
            System.out.println("Dragon 1's turn");
            System.out.println("1: " + dragon1.getSkill1Name() + " 2: " + dragon1.getSkill2Name());
            int dragon1SkillChoice = scanner.nextInt();
            if (dragon1SkillChoice == 1) {
                System.out.println("Dragon 1 uses " + dragon1.getSkill1Name());
                dragon2.reduceHealth(dragon1.getSkill1Damage());
            } else {
                System.out.println("Dragon 1 uses " + dragon1.getSkill2Name());
                dragon2.reduceHealth(dragon1.getSkill2Damage());
            }

            // Display Dragon 2's health after Dragon 1's attack
            dragon2.displayHealth();

            // Check if Dragon 2 has died
            if (dragon2.getHealth() == 0) {
                System.out.println("Dragon 1 wins the game!");
                break;
            }

            // Dragon 2's turn
            System.out.println("Dragon 2's turn");
            System.out.println("1: " + dragon2.getSkill1Name() + " 2: " + dragon2.getSkill2Name());
            int dragon2SkillChoice = scanner.nextInt();
            if (dragon2SkillChoice == 1) {
                System.out.println("Dragon 2 uses " + dragon2.getSkill1Name());
                dragon1.reduceHealth(dragon2.getSkill1Damage());
            } else {
                System.out.println("Dragon 2 uses " + dragon2.getSkill2Name());
                dragon1.reduceHealth(dragon2.getSkill2Damage());
            }

            // Display Dragon 1's health after Dragon 2's attack
            dragon1.displayHealth();

            // Check if Dragon 1 has died
            if (dragon1.getHealth() == 0) {
                System.out.println("Dragon 2 wins the game!");
                break;
            }
        }
    }
}

