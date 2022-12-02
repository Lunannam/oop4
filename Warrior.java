package oop4;

public class Warrior {
    private String name;
    private Integer health;
    private Weapon weapon;
    private Shield shield;


    public Warrior(String name, Integer health, Weapon weapon, Shield shield) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.shield = shield;

    }


    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
    public void setShield(Shield shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", weapon, name, health, shield);
    }


}
