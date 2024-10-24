package Bayron_L12Activty;

public class Archer extends DnDCharacters {

	public Archer(String Character, int Health, int Damage) {
		super(Character, 100, 20);
	}
	
	@Override
	public void attack(DnDCharacters opponent) {
		System.out.println(this.characterName + "attacks "+ opponent.characterName + "with arrows!");
		opponent.receiveDamage(this.damage);
	}
}