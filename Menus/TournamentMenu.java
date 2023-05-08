package Menus;

import java.util.Scanner;

public class TournamentMenu extends Menu {

    @Override
    public void displayMenu() {
        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Iniciar Torneio \n 2 - Sair do programa \n");
            setOption(getRead().nextInt());
        } while (getOption() > 2 || getOption() < 1);

    }
}
