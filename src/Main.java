import br.com.zazao.exerciciosjava.calculos.CalculadoraDeTempo;
import br.com.zazao.exerciciosjava.models.Serie;
import br.com.zazao.exerciciosjava.models.Filme;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Filme filme1 = new Filme();
        filme1.setNome("Minions");
        filme1.setAnoDeLancamento(2016);
        filme1.setDuracaoEmMinutos(120);
        filme1.setIncluidoNoPlano(true);

        Filme filme2 = new Filme();
        filme2.setNome("mafia holandesa");
        filme2.setAnoDeLancamento(2016);
        filme2.setDuracaoEmMinutos(120);
        filme2.setIncluidoNoPlano(true);

        Serie serie1 = new Serie();
        serie1.setNumeroDeEpsodio(180);
        serie1.setMinutosPorEpisodio(24);
        serie1.setNome("hunterxhunter");
        serie1.setIncluidoNoPlano(true);
        serie1.setNumeroDeTemporadas(3);

        CalculadoraDeTempo calcTempo = new CalculadoraDeTempo();

        calcTempo.inclui(filme1);
        calcTempo.inclui(filme2);
        calcTempo.inclui(serie1);

        System.out.println("Tempo total para assisitir " + calcTempo.getTempoTotal());


    }
}