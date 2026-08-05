//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.nome="Duna";
        filme1.anoDeLancamento=2023;
        filme1.duracaoEmMinuitos=166;
        filme1.incluidoNoPlano=true;

        filme1.exibeFichaTecnica();

    }
}