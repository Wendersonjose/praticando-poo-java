package org.example.biblioteca;

public class Livros {
    String titulo;
    String autor;
    int paginas;

    void informacoes(){
        System.out.printf("\"%s\" de %s com %d paginas",titulo,autor,paginas);

    }
}
