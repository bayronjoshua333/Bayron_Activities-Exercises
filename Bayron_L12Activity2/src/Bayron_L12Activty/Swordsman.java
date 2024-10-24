package Bayron_L12Activty;

public class Swordsman extends DnDCharacters {

	public Swordsman(String Character, int Health, int Damage) {
		super(Character, 100, 25);
	}
	
	@Override
	public void attack(DnDCharacters opponent) {
		System.out.println(this.characterName + "attacks "+ opponent.characterName + "with a sword!");
		opponent.receiveDamage(this.damage);
	}
}
