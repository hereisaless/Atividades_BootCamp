package org.example.abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca();
        cp.imprimirExtrato();
    }
}
