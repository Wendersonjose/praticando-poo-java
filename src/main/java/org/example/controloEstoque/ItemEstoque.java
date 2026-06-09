package org.example.controloEstoque;

public class ItemEstoque {

    String nome;
    int quantidade;

    void item(){
        System.out.printf("Nome do produto: %s\n", nome);
        System.out.printf("Quantidade do produto: %d\n", quantidade);

    }

    void vender(int quantidadeVendida){
        if(quantidadeVendida <= quantidade){
            quantidade -= quantidadeVendida;
            System.out.printf("Venda realizada. Estoque restante %s\n", quantidade);
        }else {
            System.out.printf("Estoque insuficiente. Estoque Atual %s\n", quantidade);
        }
    }

    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}
