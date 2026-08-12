package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.calculos.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double comprimento, double largura) {

        double area = comprimento * largura;
        System.out.println("A área calculada: " + area);
    }

    @Override
    public void calcularPerimetro(double comprimento, double largura) {

        double p = 2*(comprimento + largura);
        System.out.println("O perimetro calculado: " + p);
    }
}
