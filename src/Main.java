import br.com.zazao.exerciciosjava.models.*;


public class Main {
    public static void main(String[] args) {

        ConversorMoeda c = new ConversorMoeda();
        c.converterDolarParaReal(50);
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(5,3);
        sala.calcularPerimetro(7,3);
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(30);
        temperatura.fahrenheitParaCelsius(10);
        Livro livro = new Livro("dom pedro", "Brasil",50);
        livro.calcularPrecoFinal(20);

    }
}