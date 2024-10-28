package Bayron_L12Activty;

import java.util.Scanner;

public class Game {
    private Dragon dragon1;
    private Dragon dragon2;

    public Game(Dragon dragon1, Dragon dragon2) {
        this.dragon1 = dragon1;
        this.dragon2 = dragon2;
    }

    public void battle() {
        Scanner scanner = new Scanner(System.in);

        // Choose skill for Dragon 1
        System.out.println("Choose Skill for Dragon 1: (1 for Skill1, 2 for Skill2)");
        int dragon1SkillChoice = scanner.nextInt();
        int dragon1Skill = (dragon1SkillChoice == 1) ? dragon1.getSkill1() : dragon1.getSkill2();

        // Choose skill for Dragon 2
        System.out.println("Choose Skill for Dragon 2: (1 for Skill1, 2 for Skill2)");
        int dragon2SkillChoice = scanner.nextInt();
        int dragon2Skill = (dragon2SkillChoice == 1) ? dragon2.getSkill1() : dragon2.getSkill2();

        // Apply Dragon 1's skill
        applySkill(dragon1, dragon2, dragon1Skill);

        // Apply Dragon 2's skill if it survives
        if (dragon2.getHealth() > 0) {
            applySkill(dragon2, dragon1, dragon2Skill);
        }

        // Determine the outcome
        if (dragon1.getHealth() > 0 && dragon2.getHealth() == 0) {
            System.out.println("Dragon 1 Wins the Game!");
        } else if (dragon2.getHealth() > 0 && dragon1.getHealth() == 0) {
            System.out.println("Dragon 2 Wins the Game!");
        } else {
            System.out.println("Both Dragons Survived!");
        }

        // Display health of both dragons after the battle
        dragon1.displayHealth();
        dragon2.displayHealth();
    }

    private void applySkill(Dragon attacker, Dragon defender, int skill) {
        System.out.println(attacker.getType() + " Dragon uses skill with power " + skill);
        defender.reduceHealth(skill);
    }
}
