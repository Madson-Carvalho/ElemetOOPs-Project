package Menus;

import java.util.Scanner;

public class NewGameMenu extends Menu {
    private int options;
    private Scanner input = new Scanner(System.in);

    public int getOptions() {
        return options;
    }

    public void setOptions(int options) {
        this.options = options;
    }

    public void chooseCreature() {
        System.out.println("Digite o nome da criatura escolhida:");
    }

    @Override
    public void displayMenu() {

        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Novo jogo \n 2 - Sair do programa \n");
            setOptions(input.nextInt());
        } while (getOptions() > 2 || getOptions() < 1);

        switch (getOptions()) {
            case 1:
                this.chooseCreature();
                break;
            case 2:
                exitProgram();
                break;
        }

    }

}
