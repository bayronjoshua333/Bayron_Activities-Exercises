package Bayron_L12Activty;

public class Dragon {
    private String type;
    private String skill1Name;
    private String skill2Name;
    private String healName;
    private String buffName;
    private int skill1Damage;
    private int skill2Damage;
    private int healAmount;
    private int buffAmount;
    private int health;

    public Dragon(String type, String skill1Name, int skill1Damage, String skill2Name, int skill2Damage, String healName, int healAmount, String buffName, int buffAmount, int health) {
        this.type = type;
        this.skill1Name = skill1Name;
        this.skill1Damage = skill1Damage;
        this.skill2Name = skill2Name;
        this.skill2Damage = skill2Damage;
        this.healName = healName;
        this.healAmount = healAmount;
        this.buffName = buffName;
        this.buffAmount = buffAmount;
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

    public String getHealName() {
        return healName;
    }

    public String getBuffName() {
        return buffName;
    }

    public int getSkill1Damage() {
        return skill1Damage;
    }

    public int getSkill2Damage() {
        return skill2Damage;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public int getBuffAmount() {
        return buffAmount;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill1Damage(int skill1Damage) {
        this.skill1Damage = skill1Damage;
    }

    public void setSkill2Damage(int skill2Damage) {
        this.skill2Damage = skill2Damage;
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
        System.out.println();
        System.out.println(type + " dragon's turn");
    }
}
