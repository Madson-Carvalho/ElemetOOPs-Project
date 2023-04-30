package Menus;

public abstract class Menu {
  private int option;

  public int getOption(){
    return this.option;
  }

  public void setOption(int option) {
    this.option = option;
  }

  public void exitProgram() {
    System.out.println("Sair do programa...");
    System.exit(0);
  }

  public abstract void displayMenu();

}
