package oop4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Komandir", 150, new Staff(), new HerShield() );
        Team<Archer > red = new Team<>(hero1 ) ;
        red.Add(new Archer ("Boec1", 50,new LongBowl(),new ArchShield(), 30));
        red.Add(new Archer ("Boec2", 70,new Bowl(), new ArchShield(), 36));
        Hero hero2 = new Hero("Komandir2", 150, new Staff(), new HerShield() );
        Team<Warrior  > blue = new Team<>(hero2 ) ;
        blue.Add(new Archer ("Boec3", 50,new Bowl(), new ArchShield(), 30));
        blue.Add(new Mage ("Mage1", 90,new Staff(), new MagShield(),30, 20));

            System.out.println(blue);
            System.out.println(blue.getTeamHealthPoints() );
            System.out.println();
            System.out.println(red);
            System.out.println(red.getTeamHealthPoints());
    }
}
