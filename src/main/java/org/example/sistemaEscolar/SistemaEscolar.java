package org.example.sistemaEscolar;

public class SistemaEscolar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 16,8.5);
        Aluno aluno2 = new Aluno("Maria", 17,8.5);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "Historia");

        aluno1.exibirDados();
        aluno2.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();
    }
}
