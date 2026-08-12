package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double valor) {
        double convertido = (valor * 9/5) + 32;
        System.out.println("A Conversão feita é: " + valor + " Celsius " + "são equivalentes a " + convertido + " Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double valor) {
        double convertido = (valor - 32) * 5/9;

        System.out.println("A Conversão feita é: " + valor + " Fahrenheit " + "são equivalentes a " + convertido + " Celsius");
    }
}
