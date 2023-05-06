package Menus;

import java.util.Scanner;

public class NewGameMenu extends Menu {

    public void chooseCreature() {
        System.out.println("Digite o nome da criatura escolhida:");
    }

    @Override
    public void displayMenu() {

        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Escolher criatura \n 2 - Sair do programa \n");
            setOption(getRead().nextInt());
        } while (getOption() > 2 || getOption() < 1);

    }

}
