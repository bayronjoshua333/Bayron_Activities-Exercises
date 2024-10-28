package Bayron_L12Activty;

public class Catalyst extends DnDCharacters {

	public Catalyst(String Character) {
		super(Character, 100, 15);
	}
	
	@Override
	public void attack(DnDCharacters opponent) {
		System.out.println(this.characterName + " attacks "+ opponent.characterName + " with magic!");
		opponent.receiveDamage(this.damage);
	}
}