package Creatures;

import java.util.Random;

public class BreezeHacker extends Creature {
    private Random rand = new Random();

    public BreezeHacker() {
        setPower(rand.nextInt((30 - 10) + 1) + 10);
        setAttack(rand.nextInt((15 - 5) + 1) + 5);
        setDefense(rand.nextInt((15 - 5) + 1) + 5);
        setSpeed(rand.nextInt((10 - 1) + 1) + 1);
        setLifePoints(rand.nextInt((400 - 200) + 1) + 200);
    }

    @Override
    public int elementalAttack(int defense, String creatureType) {
        System.out.println("Elemento ar... Aerocinese.");

        if (creatureType.equals("StoneDev")) {
            return ((getPower() * getAttack()) / (defense * 2));
        } else if (creatureType.equals("WaveNerd")) {
            return ((getPower() * getAttack()) / (defense * 1));
        } else if (creatureType.equals("BurnCoder")) {
            return ((getPower() * getAttack()) / (defense * 1));
        } else if (creatureType.equals("BreezeHacker")) {
            return (int) ((getPower() * getAttack()) / (defense * 0.5));
        } else {
            return 0;
        }
    }
}