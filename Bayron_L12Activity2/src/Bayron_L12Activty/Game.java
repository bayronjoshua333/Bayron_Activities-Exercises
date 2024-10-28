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
            System.out.println("1: " + dragon1.getSkill1Name() + " 2: " + dragon1.getSkill2Name());
            int dragon1SkillChoice = scanner.nextInt();
            if (dragon1SkillChoice == 1) {
                System.out.println(dragon1.getType()+ " dragon uses " + dragon1.getSkill1Name());
                dragon2.reduceHealth(dragon1.getSkill1Damage());
            } else {
                System.out.println(dragon1.getType()+ " dragon uses " + dragon1.getSkill2Name());
                dragon2.reduceHealth(dragon1.getSkill2Damage());
            }

            dragon2.displayHealth();

            if (dragon2.getHealth() == 0) {
                System.out.println(dragon1.getType()+" dragon wins the game!");
                break;
            }

            dragon2.displayTurn();
            System.out.println("1: " + dragon2.getSkill1Name() + " 2: " + dragon2.getSkill2Name());
            int dragon2SkillChoice = scanner.nextInt();
            if (dragon2SkillChoice == 1) {
                System.out.println(dragon2.getType()+ " dragon uses " + dragon2.getSkill1Name());
                dragon1.reduceHealth(dragon2.getSkill1Damage());
            } else {
                System.out.println(dragon2.getType()+ " dragon uses " + dragon2.getSkill2Name());
                dragon1.reduceHealth(dragon2.getSkill2Damage());
            }

            dragon1.displayHealth();

            if (dragon1.getHealth() == 0) {

                System.out.println(dragon2.getType()+" dragon wins the game!");
                break;
            }
        }
    }
}