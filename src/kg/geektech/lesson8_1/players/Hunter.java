package kg.geektech.lesson8_1.players;


public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (getHealth() > 0 && boss.getHealth() > 0) {
            setDamage(getDamage() + boss.getDamage());

        }
        if (getHealth()<0){
            setHealth(0);
        }
    }
}
