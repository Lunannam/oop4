package oop4;

public class HerShield implements Shield {


    @Override
    public Integer protection() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format(" %d", protection());
    }
}
