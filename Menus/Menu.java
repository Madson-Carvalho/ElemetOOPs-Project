package Menus;

import java.util.Scanner;

public abstract class Menu {
    private int option;
    private Scanner read = new Scanner(System.in);

    public Menu() {
        setOption(option);
        setRead(read);
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void exitProgram() {
        System.out.println("Encerrando programa...");
        System.exit(0);
    }

    public abstract void displayMenu();

}
