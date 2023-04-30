package Menus;

public abstract class Menu {

    public void exitProgram() {
        System.out.println("Encerrando programa...");
        System.exit(0);
    }

    public abstract void displayMenu();

}
