package org.example.estoque;

public class Estoque {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos();


        produto1.nome = "Mouse Gamer";
        produto1.preco = 1500;
        produto1.quantidade = 100;

        produto1.Informacoes();
    }
}
