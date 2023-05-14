package Menus;

public class HomeMenu extends Menu {

  @Override
  public void displayMenu() {
    do {
      System.out.println("---------------------------------------------------");
      System.out.println("|                  ElementOOPs                    |");
      System.out.println("---------------------------------------------------");
      System.out.println("|          1 - Iniciar um novo jogo               |");
      System.out.println("|          2 - Sair do programa                   |");
      System.out.println("---------------------------------------------------");
      setOption(getRead().nextInt());
    } while (getOption() < 1 || getOption() > 2);

  }

}