package oop4;

class Mage extends Warrior {
    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }

    private Integer range;
    private Integer mana;

    public Mage(String name, Integer health, Staff  weapon, MagShield shield, Integer range, Integer mana) {
        super(name, health, weapon, shield);

        this.range = range;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage %s %d", super.toString(), range, mana);
    }
}
