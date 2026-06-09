package org.example.bancoDigital;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    void depositar(double valor){
        if ( valor >= 0){
            this.saldo += valor;
        }else {
            System.out.println("Valor Inválido");
        }
    }

    void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }else  {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual de %s: %.2f\n", titular, saldo);
    }
}
