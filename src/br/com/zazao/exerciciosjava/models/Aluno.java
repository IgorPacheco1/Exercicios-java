package br.com.zazao.exerciciosjava.models;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;

    // é assim que se cria um construtor, achei interessante dps aprofundar mais(aprender destruidores)
    public Aluno(String nome,double nota1,double nota2,double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void calculaMedia(){
        double somaNotas = getNota1() + getNota2() + getNota3();
        System.out.println("O aluno " + getNome() + " ficou com a média de " + somaNotas/3);
    }


}
