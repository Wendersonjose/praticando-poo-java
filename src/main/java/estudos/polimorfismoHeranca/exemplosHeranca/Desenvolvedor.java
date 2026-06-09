package estudos.polimorfismoHeranca.exemplosHeranca;


public class Desenvolvedor extends Employees {
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor: %s - salário: %.2f - stack: %s",
                nome, salario, stack);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do desenvolvedor");
    }
}
