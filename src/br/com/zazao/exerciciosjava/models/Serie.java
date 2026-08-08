package br.com.zazao.exerciciosjava.models;

public class Serie extends Titulo{
    private int numeroDeEpsodio;
    private int numeroDeTemporadas;
    private int minutosPorEpisodio;

    public int getNumeroDeEpsodio() {
        return numeroDeEpsodio;
    }

    public void setNumeroDeEpsodio(int numeroDeEpsodio) {
        this.numeroDeEpsodio = numeroDeEpsodio;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return numeroDeTemporadas * numeroDeEpsodio * minutosPorEpisodio;
    }
}
