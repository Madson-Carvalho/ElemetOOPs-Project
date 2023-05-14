package Tournament;

import Creatures.Creature;
import Menus.AttackMenu;
import Menus.Menu;
import Menus.NextBattleMenu;

import java.util.ArrayList;
import java.util.Random;

public class Battle {
    private Menu attackMenu = new AttackMenu();
    private Menu nextBattleMenu = new NextBattleMenu();
    private Random rand = new Random();
    private GameFlow gameFlow = new GameFlow();
    private boolean nextBattle = true;

    public void gameBattle(ArrayList<Creature> unchosenCreatures, Creature choosedCreature) {
        for (int i = 0; i < unchosenCreatures.size(); i++) {
            if (gameFlow.verifySpeed(unchosenCreatures.get(i), choosedCreature)) {
                do {
                    attackMenu.displayMenu();
                    switch (attackMenu.getOption()) {
                        case 3:
                            attackMenu.exitProgram();
                            break;
                        default:
                            gameFlow.playerAttack(attackMenu.getOption(), unchosenCreatures.get(i), choosedCreature);
                    }

                    if (gameFlow.verifyLifePoints(unchosenCreatures.get(i))) {
                        System.out.println("Parabéns você foi o campeão da batalha :)");
                        if (unchosenCreatures.size() - 1 == i) {
                            System.out.println("Você foi o grande campeão do torneio ElementOOPs");
                        }
                        nextBattleMenu.displayMenu();
                        break;
                    }

                    gameFlow.oponentAttack(rand.nextInt((2 - 1) + 1) + 1, unchosenCreatures.get(i), choosedCreature);

                    if (gameFlow.verifyLifePoints(choosedCreature)) {
                        System.out.println("\nInfelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.nextBattle = false;
                        break;
                    }

                } while (unchosenCreatures.get(i).getLifePoints() > 0 || choosedCreature.getLifePoints() > 0);
            } else {
                do {
                    gameFlow.oponentAttack(rand.nextInt((2 - 1) + 1) + 1, unchosenCreatures.get(i), choosedCreature);

                    if (gameFlow.verifyLifePoints(choosedCreature)) {
                        System.out.println("\nInfelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.nextBattle = false;
                        break;
                    }

                    attackMenu.displayMenu();
                    switch (attackMenu.getOption()) {
                        case 3:
                            attackMenu.exitProgram();
                            break;
                        default:
                            gameFlow.playerAttack(attackMenu.getOption(), unchosenCreatures.get(i), choosedCreature);
                    }

                    if (gameFlow.verifyLifePoints(unchosenCreatures.get(i))) {
                        System.out.println("Parabéns você foi o campeão da batalha :)");
                        if (unchosenCreatures.size() - 1 == i) {
                            System.out.println("Você foi o grande campeão do torneio ElementOOPs");
                        }
                        nextBattleMenu.displayMenu();
                        break;
                    }

                } while (unchosenCreatures.get(i).getLifePoints() > 0 || choosedCreature.getLifePoints() > 0);
            }

            if (!nextBattle) {
                break;
            }

            if (nextBattleMenu.getOption() == 2) {
                nextBattleMenu.exitProgram();
                break;
            }
        }
    }
}
