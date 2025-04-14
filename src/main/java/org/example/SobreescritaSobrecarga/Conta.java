package org.example.SobreescritaSobrecarga;

import lombok.Getter;

@Getter
public class Conta {
    protected Double saldo;
    private Double taxaOperacao;

    public Conta(Double saldo){
        this.saldo=saldo;
        this.taxaOperacao = 0.45;
    }

    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }
}
