package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private String nome;
    private List<String> ingredientes = new ArrayList<>();
    private List<Cardapio> listaDePratos = new ArrayList<>();

    public Cardapio(String nome, List<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionar(){
        this.listaDePratos.add(new Cardapio(nome, ingredientes));
    }
    public void listar(){
        this.listaDePratos.forEach(cardapio -> {
            System.out.println("Nome do prato: " + cardapio.getNome() + "Ingredientes: " + cardapio.getIngredientes().toString());
        });
    }
    public void excluir() {
        this.listaDePratos.removeIf(cardapio -> nome.equalsIgnoreCase(cardapio.getNome()));
    }
}
