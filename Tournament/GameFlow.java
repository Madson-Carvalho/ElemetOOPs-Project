package Tournament;

import Creatures.*;

import java.util.ArrayList;

public class GameFlow {
    private Creature stoneDev = new StoneDev();
    private Creature waveNerd = new WaveNerd();
    private Creature burnCoder = new BurnCoder();
    private Creature breezeHacker = new BreezeHacker();

    private ArrayList<Creature> unchosenCreatures = new ArrayList<Creature>();

    public ArrayList<Creature> getUnchosenCreatures() {
        return unchosenCreatures;
    }

    public void defineUnchosenCreatures(Creature choosedCreature) {
        unchosenCreatures.add(stoneDev);
        unchosenCreatures.add(waveNerd);
        unchosenCreatures.add(burnCoder);
        unchosenCreatures.add(breezeHacker);

        for (int i = 0; i < unchosenCreatures.size(); i++) {
            if (unchosenCreatures.get(i).getCreatureName() == choosedCreature.getCreatureName()) {
                unchosenCreatures.remove(i);
            }
        }
    }

    public boolean verifyLifePoints(Creature enemy) {
        return enemy.getLifePoints() < 1;
    }

    public boolean verifySpeed(Creature enemy, Creature playerCreature) {
        return playerCreature.getSpeed() > enemy.getSpeed();
    }

    public void playerAttack(int option, Creature oponent, Creature choosedCreature) {
        switch (option) {
            case 1:
                choosedCreature.physicalAttack(oponent);
                break;
            case 2:
                choosedCreature.elementalAttack(oponent);
                break;
        }
    }

    public void oponentAttack(int option, Creature oponent, Creature choosedCreature) {
        switch (option) {
            case 1:
                oponent.physicalAttack(choosedCreature);
                break;
            case 2:
                oponent.elementalAttack(choosedCreature);
                break;
        }
    }
}
