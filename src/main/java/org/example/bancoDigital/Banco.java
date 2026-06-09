package org.example.bancoDigital;

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.exibirSaldo();
        conta.sacar(500.00);
        conta.exibirSaldo();
        conta.sacar(1000.00);
        conta.exibirSaldo();
    }
}
