package Bayron_L12Activty;

public class DnDGame {
    public static void main(String[] args) {
        DnDCharacters swordsman = new Swordsman("Swordsman");
        DnDCharacters archer = new Archer("Archer");
        DnDCharacters catalyst = new Catalyst("Catalyst");

        swordsman.attack(archer);
        archer.attack(swordsman);
        catalyst.attack(swordsman);

        System.out.println(swordsman);
        System.out.println(archer);
        System.out.println(catalyst);

        while (swordsman.isAlive() && archer.isAlive()) {
            swordsman.attack(archer);
            if (!archer.isAlive()) {
                System.out.println(archer.characterName + " is defeated.");
                break;
            }
            archer.attack(swordsman);
            if (!swordsman.isAlive()) {
                System.out.println(swordsman.characterName + " is defeated.");
            }
        }
    }
}
