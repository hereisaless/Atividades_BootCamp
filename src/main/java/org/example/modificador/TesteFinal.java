package org.example.modificador;

public class TesteFinal {
    final static Conta contaFinal = new Conta(500.00);

    public static void main(String[] args) {
        contaFinal.setSaldo(1000.00);
        System.out.println(contaFinal.getSaldo());
    }
}