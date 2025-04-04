package org.example.Lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaGustavo = new Pessoa();

        pessoaGustavo.setId(1L);
        pessoaGustavo.setNome("Gustavo");
        pessoaGustavo.setIdade(25);

        System.out.println("ID: " + pessoaGustavo.getId());
        System.out.println("Nome: " + pessoaGustavo.getNome());
        System.out.println("Idade: " + pessoaGustavo.getIdade());

    }
}
