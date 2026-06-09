package org.example.funcionarios;

public class Funcionario {
   private String nome;
   private String cargo;
   private double salario;
   private int controleReajuste = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo %s - Salário %.2f",
                nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        if (controleReajuste >= 1) {
            System.out.println("Não pode fazer reajuste");
        }else {
        controleReajuste ++;

        salario += salario * (percentual / 100);

        System.out.printf("Novo salario de %s é %.2f ", nome, salario);
    }
    }

}
