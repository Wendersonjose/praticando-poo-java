package estudos.polimorfismoHeranca.exemplosHeranca;



public class Principal {
    public static void main(String[] args) {
        Employees gerente = new Gerente("Mario",15000);

        gerente.reajustarSalario(2);
        ((Gerente)gerente).setBonus(1000);
        gerente.exibirInformacoes();
        ((Gerente) gerente).aprovarProjeto("uso de Ia nos codigos java");


        Employees desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend java");

        desenvolvedor.reajustarSalario();
        desenvolvedor.exibirInformacoes();



    }
}
