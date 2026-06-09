package estudos.polimorfismoHeranca.exemplosHeranca;


public class Gerente extends Employees implements Aprovador{

    private double bonus;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nGerente: %s - salário %.2f - bônus: %.2f\n",
                nome, salario, bonus);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do desenvolvedor");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\n Gerente %s aprovou o projeto %s", nome,nomeProjeto);
    }
}
