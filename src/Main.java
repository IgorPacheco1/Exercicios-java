//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica1 = new Musica();
        Aluno aluno1 = new Aluno();


        filme1.setNome("Senhor dos aneis");
        filme1.setAnoDeLancamento(2001);
        filme1.setDuracaoEmMinuitos(180);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(4.2);
        filme1.avalia(3.9);
        filme1.avalia(3.5);
        filme1.exibeFichaTecnica();




    }
}