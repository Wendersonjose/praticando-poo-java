package org.example.identificandoEstudante;

public class Aluno {
    private String nome;
    private String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar(){
        System.out.println("Aluno: " + nome + " - tipo: " + tipo);
    }
}
