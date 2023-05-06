package Menus;

public class ChoiceCreaturesMenu extends Menu {

    @Override
    public void displayMenu() {

        do {
            System.out.println("Escolha uma das opções abaixo: \n 1 - Criatura StoneDev (terra) \n 2 - Criatura  WaveNerd (água) \n 3 - Criatura BurnCoder (fogo) \n 4 - BreezeHacker (ar) \n 5 - Sair do programa \n");
            setOption(getRead().nextInt());
        } while (getOption() > 5 || getOption() < 1);

    }

}
