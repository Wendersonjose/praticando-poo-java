package org.example.estoque;

public class Produtos {
    String nome;
    double preco;
    int quantidade;

    public void Informacoes() {
        System.out.printf(
                "Produto: %s\n" +
                "Preco : R$ %.2f\n" +
                        "Quantidade: %s ", nome, preco,quantidade );
    }
}
