package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.Vendavel;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double setPreco(double preco) {
        this.preco = preco;
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double aplicarDesconto(double desconto){
        double valorDesconto = (desconto / 100) * getPreco();
        double valorFinal = getPreco() - valorDesconto;

        return setPreco(valorFinal);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Preço: R$" + getPreco() + " Quantidade: " + getQuantidade();
    }
}

