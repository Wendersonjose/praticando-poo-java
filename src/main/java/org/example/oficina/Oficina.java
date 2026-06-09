package org.example.oficina;

public class Oficina {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo("Gol","ABC-1234", 2020);

        System.out.println("Veiculo cadastrado ");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano: " + carro.getAno());
    }
}
