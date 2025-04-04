package org.example.ExemploEqualsEIgual;

public class TesteEquals {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String nome4 = "gustavo";

        System.out.println("(nome1 == nome2): " + (nome1 == nome2));
        System.out.println("(nome1 == nome3): " + (nome1 == nome3));
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2));
        System.out.println("nome1.equals(nome3): " + nome1.equals(nome3));
        System.out.println("(nome1 == nome4): " + (nome1 == nome4));
        System.out.println("nome1.equalsIgnoreCase(nome4): " + nome1.equalsIgnoreCase(nome4));
    }
}
