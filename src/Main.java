import br.com.zazao.exerciciosjava.models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica1 = new Musica();
        Aluno aluno1 = new Aluno("igor",15,25,10);
        IdadePessoa idade = new IdadePessoa();
        Produto produto1 = new Produto();
        Livro livro =  new Livro("CR7","O prime supremo");

        livro.exibirDetalhes();










    }
}