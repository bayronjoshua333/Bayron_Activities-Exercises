package Bayron_L12Activty;

// Abstract class for DnD characters
abstract class DnDCharacter {
    protected String characterName;
    protected int health;
    protected int damage;

    // Constructor
    public DnDCharacter(String characterName, int health, int damage) {
        this.characterName = characterName;
        this.health = health;
        this.damage = damage;
    }

    // Abstract method for attacking
    public abstract void attack(DnDCharacter opponent);

    // Method to receive damage
    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.characterName + " received " + damage + " damage.");
    }

    // Method to check if the character is still alive
    public boolean isAlive() {
        return this.health > 0;
    }

    // toString method to display character info
    @Override
    public String toString() {
        return "Character: " + this.characterName + ", Health: " + this.health + ", Damage: " + this.damage;
    }
}

// Subclass Swordsman
class SwordsMan extends DnDCharacter {
    public SwordsMan(String characterName) {
        super(characterName, 100, 25); // Swordsman health 100, damage 25
    }

    @Override
    public void attack(DnDCharacter opponent) {
        System.out.println(this.characterName + " attacks " + opponent.characterName + " with a sword!");
        opponent.receiveDamage(this.damage);
    }
}

// Subclass Catalyst
class Catalyst extends DnDCharacter {
    public Catalyst(String characterName) {
        super(characterName, 100, 15); // Catalyst health 100, damage 15
    }

    @Override
    public void attack(DnDCharacter opponent) {
        System.out.println(this.characterName + " attacks " + opponent.characterName + " with magic!");
        opponent.receiveDamage(this.damage);
    }
}

// Subclass Archer
class Archer extends DnDCharacter {
    public Archer(String characterName) {
        super(characterName, 100, 20); // Archer health 100, damage 20
    }

    @Override
    public void attack(DnDCharacter opponent) {
        System.out.println(this.characterName + " attacks " + opponent.characterName + " with arrows!");
        opponent.receiveDamage(this.damage);
    }
}

// Main class to simulate the game
public class DnDGame {
    public static void main(String[] args) {
        // Create characters
        DnDCharacter swordsman = new SwordsMan("Swordsman");
        DnDCharacter archer = new Archer("Archer");
        DnDCharacter catalyst = new Catalyst("Catalyst");

        // Characters attacking each other
        swordsman.attack(archer);
        archer.attack(swordsman);
        catalyst.attack(swordsman);

        // Display character status
        System.out.println(swordsman);
        System.out.println(archer);
        System.out.println(catalyst);

        // Continue until one of the characters is defeated
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
