package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int extra = r.nextInt(20) + 1;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + extra);
            System.out.println(heroes[i].getClass().getSimpleName() + " extra damage " + (heroes[i].getDamage() + extra));
            if (getHealth()<0){
                setHealth(0);
            }
        }
    }
}
