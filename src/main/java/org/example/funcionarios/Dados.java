package org.example.funcionarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dados {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", 5000);

        funcionario1.setCargo("Desenvolvedor");

        System.out.println("Funcionario tem o cargo: " + funcionario1.getCargo());

        System.out.println("Funcionario tem o nome: " + funcionario1.getNome());

        System.out.println("Funcionario tem o salario: " + funcionario1.getSalario());


        funcionario1.reajustarSalario(5);

        funcionario1.reajustarSalario(10);

        System.out.println("");

        funcionario1.exibirInformacoes();

    }
}