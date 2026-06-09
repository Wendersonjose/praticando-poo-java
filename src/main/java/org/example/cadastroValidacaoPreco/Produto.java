package org.example.cadastroValidacaoPreco;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double valor) {
        if (valor >= 0 ){
            preco = valor;
        }else{
            System.out.println("Preço inválido");
        }

    }
}
