package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.Calculavel;

public class ProdutoFisico implements Calculavel {

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    private double valorProduto;

    @Override
    public void calcularPrecoFinal(double descontos) {
        double precoFinal = getValorProduto() - descontos;
        System.out.println("Preço antingo: " + getValorProduto() + " Preço com desconto " + precoFinal);
    }
}
