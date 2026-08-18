package br.com.zazao.exerciciosjava.models;

public class Filme extends Titulo {
   private String diretor;

    public Filme(String nome) {
        super(nome);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
