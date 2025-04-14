package org.example.SobreescritaSobrecarga;

public class TesteSobreescritaSobrecarga {
    public static void main(String[] args) {
        ContaPoupanca contapoupanca = new ContaPoupanca(6000.00);
        contapoupanca.depositar(500.00);

        ContaCorrente contaCorrenteSemTaxa = new ContaCorrente(9000.00);
        contaCorrenteSemTaxa.sacar(1000.00);

        ContaCorrente contaCorrenteComTaxa = new ContaCorrente(9000.00);
        contaCorrenteComTaxa.sacar(1000.00,0.50);

        System.out.println("Saldo da Conta Poupanca: " + contapoupanca.getSaldo());
        System.out.println("Saldo da Conta Corrente sem taxa: " + contaCorrenteSemTaxa.getSaldo());
        System.out.println("Saldo da Conta Corrente com taxa: " + contaCorrenteComTaxa.getSaldo());

    }
}
