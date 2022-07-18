package exercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Produtos {

    private String nome;
    private double preco;

    private Set<Produtos> listaDeProdutos = new HashSet<>();

    public Produtos() {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void adicionarProdutos() {

        Scanner input = new Scanner(System.in);
        System.out.println("Você quer cadastrar quantos produtos? ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++){

            System.out.println("Nome do produto: ");
            String nome = input.next();
            System.out.println("Preço: ");
            double preco = input.nextDouble();

            Produtos produto = new Produtos();
            this.listaDeProdutos.add(produto);
            System.out.println("Produto cadastrado! ");
        }
    }
    public void listarProdutos() {

        for (Produtos produto : listaDeProdutos){
            System.out.println("Nome: " + produto.getNome() + "Preço " + produto.getPreco());
        }
    }
    public void excluirProdutos() {

        for (Produtos produto : listaDeProdutos){
            this.listaDeProdutos.remove(produto);
        }
    }
}
