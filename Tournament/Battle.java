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
            if (verifySpeed(unchosenCreatures.get(i).getSpeed(), choosedCreature.getSpeed())) {
                do {
                    attackMenu.displayMenu();
                    switch (attackMenu.getOption()) {
                        case 3:
                            attackMenu.exitProgram();
                            break;
                        default:
                            playerAttack(attackMenu.getOption(), unchosenCreatures.get(i), choosedCreature);
                    }

                    if (gameFlow.verifyLifePoints(unchosenCreatures.get(i).getLifePoints())) {
                        System.out.println("Parabéns você foi o campeão da batalha :)");
                        nextBattleMenu.displayMenu();
                        break;
                    }

                    oponentAttack(rand.nextInt((2 - 1) + 1) + 1, unchosenCreatures.get(i), choosedCreature);

                    if (gameFlow.verifyLifePoints(choosedCreature.getLifePoints())) {
                        System.out.println("Infelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.nextBattle = false;
                        break;
                    }

                } while (unchosenCreatures.get(i).getLifePoints() > 0 || choosedCreature.getLifePoints() > 0);
            } else {
                do {
                    oponentAttack(rand.nextInt((2 - 1) + 1) + 1, unchosenCreatures.get(i), choosedCreature);

                    if (gameFlow.verifyLifePoints(choosedCreature.getLifePoints())) {
                        System.out.println("Infelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.nextBattle = false;
                        break;
                    }

                    attackMenu.displayMenu();
                    switch (attackMenu.getOption()) {
                        case 3:
                            attackMenu.exitProgram();
                            break;
                        default:
                            playerAttack(attackMenu.getOption(), unchosenCreatures.get(i), choosedCreature);
                    }

                    if (gameFlow.verifyLifePoints(unchosenCreatures.get(i).getLifePoints())) {
                        System.out.println("Parabéns você foi o campeão da batalha :)");
                        if (unchosenCreatures.size() -1 == i) {
                            System.out.println("Você foi o grande campeão do torneio");
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
// DEVE VERIFICAR SE O JOGADOR VENCEU AS TRÊS; FAZER O MÉTODO DE CONFIRMAR PRA SAIR DO JOGO; LEVAR A CLASSE BATTLE PARA TOURNAMENT; TESTAR PRA VER SE ESTÁ DE ACORDO COM AS ESPECIFICAÇÕES.
    public boolean verifySpeed(int unchosenCreatureSpeed, int choosedCreatureSpeed) {
        return choosedCreatureSpeed > unchosenCreatureSpeed;
    }

    private void playerAttack(int option, Creature oponent, Creature choosedCreature) {
        switch (option) {
            case 1:
                oponent.setLifePoints(oponent.getLifePoints() - choosedCreature.physicalAttack(oponent.getDefense()));
                break;
            case 2:
                oponent.setLifePoints(oponent.getLifePoints() - choosedCreature.elementalAttack(oponent.getDefense(), oponent.getClass().getSimpleName()));
                break;
        }
    }

    private void oponentAttack(int option, Creature oponent, Creature choosedCreature) {
        switch (option) {
            case 1:
                choosedCreature.setLifePoints(choosedCreature.getLifePoints() - oponent.physicalAttack(choosedCreature.getDefense()));
                break;
            case 2:
                choosedCreature.setLifePoints(choosedCreature.getLifePoints() - oponent.elementalAttack(choosedCreature.getDefense(), choosedCreature.getClass().getSimpleName()));
                break;
        }
    }
}
