package org.example.agendaContatos;

import javax.management.AttributeList;
import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) {

       ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva",  "(11) 9999-0000"));
        contatos.add(new Contato("Maria Silva",  "(11) 9999-0000"));
        contatos.add(new Contato("Pedro Silva",  "(11) 9999-0000"));
        contatos.add(new Contato("Maria Silva",  "(11) 9999-0000"));

        System.out.println("Lista de contatos");

        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());

        }
    }
}
