package Menus;

public class AttackMenu extends Menu{

  @Override
  public void displayMenu(){
    do {
      System.out.println("Escolha uma das opções abaixo: \n 1 - realizar um ataque físico \n2 - realizar um ataque elemental \n3 - Sair do programa");
      setOption(getRead().nextInt());
    } while (getOption() < 1 || getOption() > 3);

  }

}
