package org.example.controleSenha;

public class Autenticacao {
    public static void main(String[] args) {
        Usuario user = new Usuario("123456");
        user.setSenha("1234567", "abc123");
    }
}
