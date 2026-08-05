//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica1 = new Musica();
        Aluno aluno1 = new Aluno();

        pessoa1.saudacao();
        System.out.println("-----------------------------");
        double resultado = calculadora1.multiplica(25);
        System.out.println(resultado);
        System.out.println("-----------------------------");
        musica1.titulo = "zazao promoter";
        musica1.artista = "zazao";
        musica1.anoDeLancamento = 2026;
        musica1.avalia(5);
        musica1.avalia(4.4);
        musica1.avalia(4.3);
        musica1.exibirFicha();
        System.out.println("-----------------------------");
        aluno1.nome = "IGOR";
        aluno1.idade = 22;
        aluno1.exibirDados();





    }
}