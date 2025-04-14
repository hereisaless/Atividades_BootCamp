package org.example.Switch;

public class TesteSwitch {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

       // exibeTipoConta(contaCorrente);
       // exibeTipoConta(contaPoupanca);
        exibeTipoContaJava17(contaCorrente);

    }
    private static void exibeTipoConta(Conta conta) {
        switch (conta.getTipoConta()) {
            case "Conta Corrente":
                System.out.println("É uma Conta Corrente.");
                break;
            case "Conta Comum":
                System.out.println("É uma Conta comum.");
                break;
            case "Conta Poupanca":
                System.out.println("É uma Conta Poupanca.");
                break;
            default:
                System.out.println("Tipo de conta não identificado!");

        }
    }

    private static void exibeTipoContaJava17(Conta conta){
        String mensagem = switch (conta.getTipoConta()) {
            case "Conta Comum" -> "É uma Conta Comum.";
            case "Conta Corrente" -> "É uma Conta Corrente.";
            case "Conta Poupanca" -> "É uma Conta Poupanca.";
            default -> "Tipo de conta não identificado!";
        };
        System.out.println(mensagem);
    }
}
