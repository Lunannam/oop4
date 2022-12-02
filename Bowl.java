package oop4;

public class Bowl implements Weapon {

    @Override
    public Integer damage() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format(" %d", damage());
    }
}
