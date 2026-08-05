public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinuitos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;



    void exibeFichaTecnica(){
        System.out.println("==================================");
        System.out.println("FICHA TÉCNICA");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinuitos + " Minutos");
        System.out.println("Numero de avaliações: " + totalDeAvaliacoes);
        System.out.println("Avaliação média: " + pegaMedia());
        System.out.println("==================================");
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
