import br.com.zazao.exerciciosjava.models.*;


public class Main {
    public static void main(String[] args) {

        ConversorMoeda c = new ConversorMoeda();
        c.converterDolarParaReal(50);
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(5,3);
        sala.calcularPerimetro(7,3);

    }
}