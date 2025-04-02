package org.example.Interfaces;

public class ContaPoupanca implements  Conta{
    private Double saldo = 100.0;

    @Override
    public void depositar(Double valor){
        this.saldo += valor;
    }
    @Override
    public void sacar(Double valor){
        this.saldo -= valor;
    }
    public Double getSaldo(){
        return this.saldo;
    }
}
