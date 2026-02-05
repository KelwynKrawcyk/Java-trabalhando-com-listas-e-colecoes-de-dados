package br.com.alura.screenmatch.modelos;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    };

    @Override
    public String toString() {
        return "Nome: "  + nome + ", Idade: " + idade;
    }
}
