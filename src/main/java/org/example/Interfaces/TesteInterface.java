package org.example.Interfaces;

public class TesteInterface {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.0);
        contaCorrente.getSaldo();
        System.out.println("Saldo após depósito na Conta Corrente: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1000.0);
        System.out.println("Saldo após saque na Conta Corrente: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.0);
        contaPoupanca.getSaldo();
        System.out.println("Saldo após depósito na Conta Poupanca: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(800.0);
        System.out.println("Saldo após saque na Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
