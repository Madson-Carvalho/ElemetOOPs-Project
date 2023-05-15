package Tournament;

import Creatures.*;
import Menus.ChoiceCreaturesMenu;
import Menus.HomeMenu;
import Menus.Menu;
import Menus.TournamentMenu;

public class Tournament {
    private Menu homeMenu = new HomeMenu();
    private Menu choiceCreaturesMenu = new ChoiceCreaturesMenu();
    private Menu tournamentMenu = new TournamentMenu();
    private Battle battle = new Battle();
    private GameFlow gameFlow = new GameFlow();

    private Creature choosedCreature;

    public Creature getChoosedCreature() {
        return choosedCreature;
    }

    private void setChoosedCreature(Creature choosedCreature) {
        this.choosedCreature = choosedCreature;
    }

    private void definePlayerCreature(int selectedCreature) {
        switch (selectedCreature) {
            case 1:
                choosedCreature = new StoneDev();
                break;
            case 2:
                choosedCreature = new WaveNerd();
                break;
            case 3:
                choosedCreature = new BurnCoder();
                break;
            case 4:
                choosedCreature = new BreezeHacker();
                break;
        }
    }

    public void startGame() {
        homeMenu.displayMenu();

        switch (homeMenu.getOption()) {
            case 1:
                choiceCreaturesMenu.displayMenu();
                break;
            case 2:
                homeMenu.exitProgram(this);
        }

        switch (choiceCreaturesMenu.getOption()) {
            case 5:
                choiceCreaturesMenu.exitProgram(this);
                break;
            default:
                this.definePlayerCreature(choiceCreaturesMenu.getOption());
                tournamentMenu.displayMenu();
        }

        switch (tournamentMenu.getOption()) {
            case 1:
                gameFlow.defineUnchosenCreatures(choosedCreature);
                battle.gameBattle(gameFlow.getUnchosenCreatures(), getChoosedCreature(), this);
                break;
            case 2:
                tournamentMenu.exitProgram(this);
        }
    }

}
