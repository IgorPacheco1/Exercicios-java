package br.com.zazao.exerciciosjava.models;

public class Carro {
    private String nomeDoModelo;
    private double precoMedioPorAno;
    private int anoModelo;

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public double getPrecoMedioPorAno() {
        return precoMedioPorAno;
    }

    public void setPrecoMedioPorAno(double precoMedioPorAno) {
        this.precoMedioPorAno = precoMedioPorAno;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void exibirDados(){
        double maior=0,menor=0;
        System.out.println("Nome do modelo: " + getNomeDoModelo());
        System.out.println("Ano de lançamento: " + getAnoModelo());
        System.out.println("Preço medio: " + getPrecoMedioPorAno());
        System.out.println("Maior preço " + maior);
    }
}
