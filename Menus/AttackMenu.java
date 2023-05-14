package Menus;

public class AttackMenu extends Menu{

  @Override
  public void displayMenu(){
    do {
      System.out.println("\n---------------------------------------------------");
      System.out.println("|                  Ataque                         |");
      System.out.println("---------------------------------------------------");
      System.out.println("|          Escolha uma das opções abaixo:        |");
      System.out.println("|          1 - realizar um ataque físico          |");
      System.out.println("|          2 - realizar um ataque elemental       |");
      System.out.println("|          3 - Sair do programa                   |");
      System.out.println("---------------------------------------------------");
      setOption(getRead().nextInt());
    } while (getOption() < 1 || getOption() > 3);

  }

}
