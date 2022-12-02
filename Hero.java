package oop4;

public class Hero extends Warrior {
    public Hero(String name, int health, Weapon weapon, HerShield shield) {
        super(name, health, weapon, shield);
    }
    @Override
    public String toString() {
        return String.format("Hero %s ", super.toString());
    }
}
