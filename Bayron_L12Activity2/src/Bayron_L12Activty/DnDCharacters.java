package Bayron_L12Activty;

public abstract class DnDCharacters {
	protected String characterName;
	protected int health;
	protected int damage;
	
	public DnDCharacters(String Character, int Health, int Damage) {
		this.characterName = Character;
		this.health = Health;
		this.damage = Damage;
	}
	
	public abstract void attack(DnDCharacters opponent);
	
	public void receiveDamage(int damage) {
		this.health -= damage;
		System.out.println(this.characterName + " received " + damage + " damage.");
	}
	
	public boolean isAlive() {
		return this.health > 0;
	}
	
	@Override
	public String toString() {
		return "Character: " + this.characterName + ", Health: " + this.health;
	}
}
