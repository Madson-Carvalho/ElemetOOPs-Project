package Creatures;

import java.util.Random;

public class BurnCoder extends Creature {

    private Random rand = new Random();

    public BurnCoder() {
        setPower(rand.nextInt((30 - 10) + 1) + 10);
        setAttack(rand.nextInt((15 - 5) + 1) + 5);
        setDefense(rand.nextInt((15 - 5) + 1) + 5);
        setSpeed(rand.nextInt((10 - 1) + 1) + 1);
        setLifePoints(rand.nextInt((400 - 200) + 1) + 200);
        setCreatureName(CreatureName.BURNCODER);
    }

    @Override
    public void elementalAttack(Creature oponent) {
        System.out.println("\n" + getCreatureName());
        System.out.println("Ataque elemental");
        System.out.println("Elemento Fogo... Hálito de Fogo.");

        if (oponent.getCreatureName() == CreatureName.BURNCODER) {
            int damage = (int) ((getPower() * getAttack()) / (oponent.getDefense() * 0.5));
            oponent.receiveDamage(damage);
            showStatusAfterAttack(damage, oponent);
        } else if (oponent.getCreatureName() == CreatureName.WAVENERD) {
            int damage = ((getPower() * getAttack()) / (oponent.getDefense() * 1));
            oponent.receiveDamage(damage);
            showStatusAfterAttack(damage, oponent);
        } else if (oponent.getCreatureName() == CreatureName.STONEDEV) {
            int damage = ((getPower() * getAttack()) / (oponent.getDefense() * 1));
            oponent.receiveDamage(damage);
            showStatusAfterAttack(damage, oponent);
        } else if (oponent.getCreatureName() == CreatureName.BREEZEHACKER) {
            int damage = ((getPower() * getAttack()) / (oponent.getDefense() * 2));
            oponent.receiveDamage(damage);
            showStatusAfterAttack(damage, oponent);
        }
    }

}