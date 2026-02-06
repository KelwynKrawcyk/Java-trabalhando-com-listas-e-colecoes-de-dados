package br.com.alura.screenmatch.modelos;

import java.util.Date;

public class produtoPerecivel extends Produto{
    private String dataDeValidade;

    public produtoPerecivel(String nome, Double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }
}
