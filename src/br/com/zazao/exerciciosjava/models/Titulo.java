package br.com.zazao.exerciciosjava.models;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
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

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
        System.out.println("Duração " + duracaoEmMinutos + " Minutos");
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

    @Override
    public int compareTo(Titulo outronome) {
        return this.getNome().compareTo(outronome.getNome());
    }
}
