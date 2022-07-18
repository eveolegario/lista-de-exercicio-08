package exercicio2;

import java.util.Scanner;

public class MainCandidatos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Candidatos candidato = new Candidatos();
        boolean c = true;

        while(c == true){
            System.out.println("Qual seu desejo? Segue as opções: ");
            System.out.println("Digite 1 - adicionar candidato");
            System.out.println("Digite 2 - exibir candidatos");
            System.out.println("Digite 3 - excluir candidato");
            System.out.println("Digite 4 - sair");

            int escolhaDoUser = input.nextInt();

            switch (escolhaDoUser){

                case 1:
                    candidato.adicionarCandidatos();
                    break;

                case 2:
                    candidato.listarCandidatos();
                    break;

                case 3:
                    candidato.excluirCandidatos();
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
