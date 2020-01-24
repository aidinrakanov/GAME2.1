package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Tank extends Hero {
    public Tank(int health, int damage) {
        super(health, damage, AbilityType.DEFENSE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random l = new Random();
        int divide = l.nextInt(4) + 3;
        if(getHealth()>0 && boss.getHealth()>0){
            for (int i = 0; i <heroes.length ; i++) {
                setHealth(getHealth() -  boss.getDamage() * 6 );
                if(getHealth()<0){
                   setHealth(0);
                }
            }
        }


    }
}
