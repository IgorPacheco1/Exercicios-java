import br.com.zazao.exerciciosjava.models.Cachorro;
import br.com.zazao.exerciciosjava.models.Carro;
import br.com.zazao.exerciciosjava.models.Gato;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro dog =  new Cachorro();
        Gato gat = new Gato();
        dog.emitirSom();
        gat.emitirSom();

    }
}