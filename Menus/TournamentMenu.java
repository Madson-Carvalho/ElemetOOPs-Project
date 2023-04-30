package Menus;

import java.util.Scanner;

public class TournamentMenu extends Menu {
    private int option;
    Scanner read = new Scanner(System.in);

    public TournamentMenu() {
        setOption(option);
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    @Override
    public void displayMenu() {
        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Iniciar Torneio \n 2 - Sair do programa \n");
            setOption(read.nextInt());
        } while (getOption() > 2 || getOption() < 1);

        switch (getOption()) {
            case 1:
                System.out.println("asd");
                break;
            case 2:
                this.exitProgram();
                break;
        }
    }
}
