package org.example.Collections.Lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {

        List<String> contas = new ArrayList();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca");


        System.out.println("Contas 1: " + contas.get(0));
        System.out.println("Contas 2 " + contas.get(1));
        System.out.println("Contas 3: " + contas.get(2));
        System.out.println("Contas 4: " + contas.get(3));

    }
}
