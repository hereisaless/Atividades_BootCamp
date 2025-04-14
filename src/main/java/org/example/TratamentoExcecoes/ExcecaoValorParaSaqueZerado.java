package org.example.TratamentoExcecoes;

public class ExcecaoValorParaSaqueZerado extends Exception{
    public String getMessage(){
        return "Valor para saque não pode ser Zero";
    }
}
