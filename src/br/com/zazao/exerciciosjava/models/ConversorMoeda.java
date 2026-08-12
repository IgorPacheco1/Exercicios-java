package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.ConversaoFinananceira;

public class ConversorMoeda implements ConversaoFinananceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorConvertido = valorDolar * 5.17;
        System.out.println("Valor convertido: " + valorConvertido);

    }
}
