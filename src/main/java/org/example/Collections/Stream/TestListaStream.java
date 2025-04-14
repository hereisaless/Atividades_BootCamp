package org.example.Collections.Stream;

import java.util.ArrayList;
import java.util.List;

public class TestListaStream {
    public static void main(String[] args) {

        List<String> contas = new ArrayList();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca");

        contas.stream()
                .filter(conta -> filterListas(conta))
                .forEach(conta -> System.out.println("Conta: " + conta));

        long total = contas.parallelStream()
                .filter(conta -> filterListas(conta))
                .count();
        System.out.println("Total de Poupanca: " + total);

        long totalContas = 0;
        for(int index = 0; index < contas.size(); index++){
            String conta = contas.get(index);
            if (conta.contains("Conta Poupanca")) {
                totalContas = totalContas + 1;
            }
        }
        System.out.println("Total de Poupanca: " + totalContas);
    }

    public static Boolean filterListas(String conta){

        return conta.contains("Conta Poupanca");
    }
}
