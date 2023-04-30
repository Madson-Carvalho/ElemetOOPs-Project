package Menus;

import java.util.Scanner;

public class HomeMenu extends Menu {

  private int option;
  Scanner sc = new Scanner(System.in);

  public HomeMenu() {
    setOption(option);
  }

  public void setOption(int option) {
    this.option = option;
  }

  public int getOption() {
    return this.option;
  }

  @Override
  public void displayMenu() {
    do {
      System.out.println("1 - Deseja iniciar um novo jogo? \n2 - Deseja sair do jogo?");
      setOption(sc.nextInt());
    } while (getOption() < 1 || getOption() > 2);

    switch (getOption()) {
      case 1:
        System.out.println("Iniciar novo jogo");
        break;
      case 2:
        exitProgram();
    }
  }

}