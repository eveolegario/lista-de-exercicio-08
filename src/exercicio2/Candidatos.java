package exercicio2;

import exercicio1.Produtos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Candidatos {

    private String numeroMatricula;
    private double nota;

    private Set<Candidatos> listaDeCandidatos = new HashSet<>();

    public Candidatos() {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void adicionarCandidatos() {

        Scanner input = new Scanner(System.in);
        System.out.println("Você quer cadastrar quantos candidatos? ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++){

            System.out.println("Número de matrícula: ");
            String numero = input.next();
            System.out.println("Nota: ");
            double nota = input.nextDouble();

            Candidatos candidatos = new Candidatos();
            this.listaDeCandidatos.add(candidatos);
            System.out.println("Produto cadastrado! ");
        }
    }
    public void listarCandidatos() {

        for (Candidatos candidatos : listaDeCandidatos){
            System.out.println("Número de matrícula: " + candidatos.getNumeroMatricula() + "Nota " + candidatos.getNota());
        }
    }
    public void excluirCandidatos() {

        for (Candidatos candidatos : listaDeCandidatos){
            this.listaDeCandidatos.remove(candidatos);
        }
    }
}
