package exercicio1;

import java.util.Scanner;

public class MainProdutos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produtos produto = new Produtos();
        boolean c = true;
        int x = 0;

        while(c == true){
            System.out.println("Qual seu desejo? Segue as opções: ");
            System.out.println("Digite 1 - Adicionar produto");
            System.out.println("Digite 2 - Exibir lista de cadastro");
            System.out.println("Digite 3 - Excluir produto");
            System.out.println("Digite 4 - Sair");

            int escolhaDoUser = input.nextInt();

            switch (escolhaDoUser){

                case 1:
                    produto.adicionarProdutos();
                    break;

                case 2:
                    produto.listarProdutos();
                    break;

                case 3:
                    produto.excluirProdutos();
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
