package Menus;

public class HomeMenu extends Menu {

  @Override
  public void displayMenu() {
    do {
      System.out.println("1 - Iniciar um novo jogo \n2 - Sair do programa");
      setOption(getRead().nextInt());
    } while (getOption() < 1 || getOption() > 2);

  }

}