package org.example.Optional;

import org.example.Collections.Set.Conta;

import java.util.Optional;

public class OpitionalTest {
    public static void main(String[] args) {
        Optional<Conta> optionalConta = obtemContaSemErro();

        if (optionalConta.isPresent()) {

            System.out.println("Saldo: " + optionalConta.get().getSaldo());
        } else {
            System.out.println("Conta nao encontrada! ");
        }
    }

    public static Conta obtemConta() {
        return null;
    }

    public static Optional<Conta> obtemContaSemErro() {
        return Optional.of(Conta.builder()
                .numeroConta(1L)
                .saldo(250.55)
                .build());
    }
}