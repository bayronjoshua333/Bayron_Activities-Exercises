package Bayron_L12Activty;

public class Dragon {
    private String type;
    private int skill1;
    private int skill2;
    private int health;

    public Dragon(String type, int skill1, int skill2, int health) {
        this.type = type;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public int getSkill1() {
        return skill1;
    }

    public int getSkill2() {
        return skill2;
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
}
