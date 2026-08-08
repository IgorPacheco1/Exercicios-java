package br.com.zazao.exerciciosjava.calculos;

import br.com.zazao.exerciciosjava.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
