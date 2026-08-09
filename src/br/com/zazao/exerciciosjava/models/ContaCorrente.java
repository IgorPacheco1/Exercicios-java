package br.com.zazao.exerciciosjava.models;

public class ContaCorrente extends ContaBancaria{

    private void cobrarTarifaMensal(){
        double taxa = 4.99;
        sacar(taxa);
    }
}
