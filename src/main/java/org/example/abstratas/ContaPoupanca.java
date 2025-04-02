package org.example.abstratas;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato da Conta Poupança");
    }
}
