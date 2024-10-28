package Bayron_L12Activty;

public class Dragon {
    private String type;
    private String skill1Name;
    private String skill2Name;
    private int skill1Damage;
    private int skill2Damage;
    private int health;

    public Dragon(String type, String skill1Name, int skill1Damage, String skill2Name, int skill2Damage, int health) {
        this.type = type;
        this.skill1Name = skill1Name;
        this.skill1Damage = skill1Damage;
        this.skill2Name = skill2Name;
        this.skill2Damage = skill2Damage;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public String getSkill1Name() {
        return skill1Name;
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public int getSkill1Damage() {
        return skill1Damage;
    }

    public int getSkill2Damage() {
        return skill2Damage;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void displayHealth() {
        System.out.println(type + " Dragon's Health: " + health);
    }
    
    public void displayTurn() {
    	System.out.println(type + " dragon's turn");
    }
    
}