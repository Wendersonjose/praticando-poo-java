package org.example.biblioteca;

public class Catalago {
    public static void main(String[] args) {
        Livros livro1 = new Livros();

        livro1.titulo = "O Guia do Mochileiro das Galáxias";
        livro1.autor = "Douglas Adams";
        livro1.paginas = 208;


        livro1.informacoes();

    }
}
