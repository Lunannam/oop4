package oop4;

public class ArchShield implements Shield {


    @Override
    public Integer protection() {
        return 6;
    }
    @Override
    public String toString() {
        return String.format(" %d", protection());
    }
}
