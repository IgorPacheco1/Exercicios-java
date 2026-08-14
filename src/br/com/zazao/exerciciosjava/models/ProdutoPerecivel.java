package br.com.zazao.exerciciosjava.models;

public class ProdutoPerecivel extends Produto{

    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public ProdutoPerecivel(double preco, String nome, int quantidade, String dataDeValidade) {
        super(preco, nome, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Preço: R$" + getPreco() + " Quantidade: " + getQuantidade() + " Data de validae: " + getDataDeValidade();
    }
}
