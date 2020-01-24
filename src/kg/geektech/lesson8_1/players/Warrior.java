package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

            Random r = new Random();
            int crit = r.nextInt(2) + 2;
            if (getHealth() > 0 && boss.getHealth() > 0) {
                if (getAbilityType() != AbilityType.CRITICAL_DAMAGE){
                    setDamage(getDamage()*crit);
                }
                if (getHealth()<0){
                    setHealth(0);
                }

                    System.out.println("Critical damage " + getDamage());
                System.out.println("__________ __________");

            }
    }
}
