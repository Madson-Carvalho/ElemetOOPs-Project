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

        for (int i = 0; i < unchosenCreatures.size(); i ++) {
            if (unchosenCreatures.get(i).getClass().getSimpleName().equals(choosedCreature.getClass().getSimpleName())) {
                unchosenCreatures.remove(i);
            }
        }
    }

    public boolean verifyLifePoints(int creatureLife) {
        return creatureLife < 1;
    }
}
