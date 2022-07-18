package exercicio3;

import java.util.Scanner;

public class MainCardapio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        boolean c = true;

        while(c == true){
            System.out.println("Qual seu desejo? Segue as opções: ");
            System.out.println("Digite 1 - adicionar prato");
            System.out.println("Digite 2 - exibir pratos");
            System.out.println("Digite 3 - excluir prato");
            System.out.println("Digite 4 - sair");

            int escolhaDoUser = input.nextInt();

            switch (escolhaDoUser){

                case 1:
                    cardapio.adicionar();
                    break;

                case 2:
                    cardapio.listar();
                    break;

                case 3:
                    cardapio.excluir();
                    break;

                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}
