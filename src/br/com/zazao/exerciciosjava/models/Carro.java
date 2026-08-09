package br.com.zazao.exerciciosjava.models;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double maiorPreco(double getPreco1,double getPreco2, double getPreco3 ){

        if (getPreco1>getPreco2 && getPreco1>getPreco3){
            return getPreco1;
        } else if (getPreco2>getPreco1 && getPreco2> getPreco3) {
            return getPreco2;
        }else return getPreco3;
    }

    public double menorPreco(double getPreco1,double getPreco2, double getPreco3){

        if (getPreco1<getPreco2 && getPreco1<getPreco3){
            return getPreco1;
        } else if (getPreco2<getPreco1 && getPreco2<getPreco3) {
            return getPreco2;
        }else return getPreco3;
    }

    public void exibeDados(Carro carro){
        System.out.println("Nome do modelo: " + getNomeModelo());
        System.out.println("Preco do ano 1: " + getPrecoAno1());
        System.out.println("Preco do ano 2: " + getPrecoAno2());
        System.out.println("Preco do ano 3: " + getPrecoAno3());
        System.out.println("Maior preço: " + maiorPreco(getPrecoAno1(),getPrecoAno2(),getPrecoAno3()));
        System.out.println("Menor preço: " + menorPreco(getPrecoAno1(),getPrecoAno2(),getPrecoAno3()));
    }
}
