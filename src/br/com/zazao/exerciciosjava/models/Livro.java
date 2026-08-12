package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.Calculavel;

public class Livro implements Calculavel {

    private String autor;
    private String titulo;
    private double valor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Livro(String autor,String titulo,double valor){
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.println("DADOS DO LIVRO");
        System.out.println("");
        System.out.println("Autor " + autor);
        System.out.println("Titulo " + titulo);
    }

    @Override
    public void calcularPrecoFinal(double valorDesconto) {
        double precoFinal = getValor() - valorDesconto;
        System.out.println("Preço antingo: " + getValor() + " Preço com desconto " + precoFinal);

    }
}
