package oop4;

public class MagShield implements Shield {


    @Override
    public Integer protection() {
        return 8;
    }
    @Override
    public String toString() {
        return String.format(" %d", protection());
    }
}

