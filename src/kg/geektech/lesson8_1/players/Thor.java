package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, AbilityType.STUN);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(getHealth()<0 && boss.getHealth()<0) {
            Random k = new Random();
            int stun = k.nextInt(10);
            if (stun > 5) {
                boss.setDamage(0);
            }
        }
    }
}
