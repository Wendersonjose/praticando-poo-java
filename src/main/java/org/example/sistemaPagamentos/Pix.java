package org.example.sistemaPagamentos;

public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento()
    {
        System.out.printf("\n Pagamento via Pix de R$%.2f confirmado",valor);
    }

    }

