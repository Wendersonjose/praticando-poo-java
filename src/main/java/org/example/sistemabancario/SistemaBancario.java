package org.example.sistemabancario;

public class SistemaBancario {
    public static void main(String[] args) {

        OperacaoBancaria deposito = new Deposito(200.00);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();

    }
}
