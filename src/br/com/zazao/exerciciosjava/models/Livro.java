package br.com.zazao.exerciciosjava.models;

public class Livro {

    private String autor;
    private String titulo;

    public Livro(String autor,String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("DADOS DO LIVRO");
        System.out.println("");
        System.out.println("Autor " + autor);
        System.out.println("Titulo " + titulo);
    }
}
