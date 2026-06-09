package estudos.polimorfismoHeranca.exemplosHeranca;

public abstract class Employees {
    protected String nome;
    protected double salario;


    public Employees(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.printf("\nFuncionario %s - Salário %.2f\n",
                nome,salario);
    }

    public void reajustarSalario(double percentual) {

            salario += salario * (percentual / 100);

            System.out.printf("\nNovo salario de %s é %.2f ", nome, salario);
        }

        public void reajustarSalario(){
        salario += 500;
            System.out.printf("\nSalario com dissido de %s é %.2f\n", nome, salario);
        }

        public abstract void calcularPLR();


}
