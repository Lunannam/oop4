package oop4;

public class Archer extends Warrior {
    private Integer range;
    public Integer getRange() {
        return range;
    }


    public Archer(String name, int health, Bowl weapon, ArchShield shield, Integer range) {
        super(name, health, weapon, shield);
        this.range = range;

    }

    @Override
    public String toString() {
        return String.format("Archer %s %d", super.toString(), range);
    }
}
