package br.com.patrick.strategya.relatorio;

public class Informacoes {
    private String nome;
    private int idade;

    public Informacoes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
