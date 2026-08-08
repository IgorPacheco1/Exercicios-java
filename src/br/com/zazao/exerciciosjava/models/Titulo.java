package br.com.zazao.exerciciosjava.models;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinuitos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinuitos() {
        return duracaoEmMinuitos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinuitos(int duracaoEmMinuitos) {
        this.duracaoEmMinuitos = duracaoEmMinuitos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    private int totalDeAvaliacoes;



    public void exibeFichaTecnica(){
        System.out.println("==================================");
        System.out.println("FICHA TÉCNICA");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração " + duracaoEmMinuitos + " Minutos");
        System.out.println("Numero de avaliações: " + totalDeAvaliacoes);
        System.out.println("Avaliação média: " + pegaMedia());
        System.out.println("==================================");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
