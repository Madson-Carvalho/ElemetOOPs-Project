package Menus;

public class NextBattleMenu extends Menu{

    @Override
    public void displayMenu() {
        do {
            System.out.println("1 - iniciar a próxima batalha \n 2 - Sair do programa");
            setOption(getRead().nextInt());
        } while (getOption() < 1 || getOption() > 2);

    }
}
