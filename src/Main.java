import br.com.zazao.exerciciosjava.models.Carro;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Carro carro1 = new Carro();
        carro1.setAnoModelo(2012);
        carro1.setNomeDoModelo("Corolla XLi 1.8 (Flex)");
        carro1.setPrecoMedioPorAno(58100);

        Carro carro2 = new Carro();
        carro2.setAnoModelo(2013);
        carro2.setNomeDoModelo("Corolla XLi 1.8 (Flex)");
        carro2.setPrecoMedioPorAno(63884);

        Carro carro3 = new Carro();
        carro3.setAnoModelo(2014);
        carro3.setNomeDoModelo("Corolla XLi 1.8 (Flex)");
        carro3.setPrecoMedioPorAno(65482);

        carro1.exibirDados();

    }
}