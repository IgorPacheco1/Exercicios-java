package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int number) {
        int cont = 0;
        while (cont<=10){
            int result = number * cont;
            System.out.println(number + " X " + cont + " = " + result);
            cont++;
        }
    }
}
