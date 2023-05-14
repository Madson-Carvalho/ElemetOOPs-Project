package Menus;

public class ChoiceCreaturesMenu extends Menu {

    @Override
    public void displayMenu() {

        do {
            System.out.println("\n---------------------------------------------------");
            System.out.println("|               Escolha de criatura               |");
            System.out.println("---------------------------------------------------");
            System.out.println("| Escolha uma das opções abaixo:                  |");
            System.out.println("|  1 - Criatura StoneDev (terra)                  |");
            System.out.println("|  2 - Criatura  WaveNerd (água)                  |");
            System.out.println("|  3 - Criatura BurnCoder (fogo)                  |");
            System.out.println("|  4 - Criatura BreezeHacker (ar)                 |");
            System.out.println("|  5 - Sair do programa                           |");
            System.out.println("---------------------------------------------------");
            setOption(getRead().nextInt());
        } while (getOption() > 5 || getOption() < 1);

    }

}
