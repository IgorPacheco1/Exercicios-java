package br.com.zazao.exerciciosjava.models;

public class Produto {

    private String nome;
    private double preco;

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

    public double aplicarDesconto(double desconto){
        double valorDesconto = (desconto / 100) * getPreco();
        double valorFinal = getPreco() - valorDesconto;

        return setPreco(valorFinal);
    }
}
