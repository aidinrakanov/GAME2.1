package kg.geektech.lesson8_1.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, AbilityType.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(getHealth()<0 && boss.getHealth()<0)
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbilityType() != AbilityType.HEAL) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
            if (getHealth()<0){
                setHealth(0);
            }
        }
    }
}
