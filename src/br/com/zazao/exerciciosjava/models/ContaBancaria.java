package br.com.zazao.exerciciosjava.models;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor>saldo){
            System.out.println("Saldo insuficiente para realizar operação");
        }else saldo -= valor;
    }

    public void consultaSaldo(){
        System.out.println(saldo);
    }



}
