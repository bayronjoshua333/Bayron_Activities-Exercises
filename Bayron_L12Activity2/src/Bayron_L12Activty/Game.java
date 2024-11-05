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
            dragon1.displayTurn();
            System.out.println("1: " + dragon1.getSkill1Name() + " 2: " + dragon1.getSkill2Name() + " 3: " + dragon1.getHealName() + " 4: " + dragon1.getBuffName());
            int dragon1SkillChoice = scanner.nextInt();

            handleSkillChoice(dragon1SkillChoice, dragon1, dragon2);

            dragon2.displayHealth();
            if (dragon2.getHealth() == 0) {
                System.out.println(dragon1.getType() + " dragon wins the game!");
                break;
            }

            dragon2.displayTurn();
            System.out.println("1: " + dragon2.getSkill1Name() + " 2: " + dragon2.getSkill2Name() + " 3: " + dragon2.getHealName() + " 4: " + dragon2.getBuffName());
            int dragon2SkillChoice = scanner.nextInt();

            handleSkillChoice(dragon2SkillChoice, dragon2, dragon1);

            dragon1.displayHealth();
            if (dragon1.getHealth() == 0) {
                System.out.println(dragon2.getType() + " dragon wins the game!");
                break;
            }
        }
    }

    public void handleSkillChoice(int choice, Dragon attacker, Dragon defender) {
        switch (choice) {
            case 1:
                System.out.println(attacker.getType() + " dragon uses " + attacker.getSkill1Name());
                defender.reduceHealth(attacker.getSkill1Damage());
                break;
            case 2:
                System.out.println(attacker.getType() + " dragon uses " + attacker.getSkill2Name());
                defender.reduceHealth(attacker.getSkill2Damage());
                break;
            case 3:
                restoreHealth(attacker);
                break;
            case 4:
                buffSkill(attacker);
                break;
            default:
                System.out.println("Invalid move.");
                break;
        }
    }

    public void restoreHealth(Dragon dragon) {
        System.out.println(dragon.getType() + " dragon restores " + dragon.getHealAmount() + " health points!");
        dragon.setHealth(dragon.getHealth() + dragon.getHealAmount());
        if (dragon.getHealth() > 100) {
            dragon.setHealth(100);
        }
    }

    public void buffSkill(Dragon dragon) {
        System.out.println(dragon.getType() + " dragon buffs its skills! Damage increased by " + dragon.getBuffAmount() + ".");
        dragon.setSkill1Damage(dragon.getSkill1Damage() + dragon.getBuffAmount());
        dragon.setSkill2Damage(dragon.getSkill2Damage() + dragon.getBuffAmount());
    }
}
