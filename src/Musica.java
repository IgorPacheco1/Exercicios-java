public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;


    void exibirFicha(){
        System.out.println("==========================");
        System.out.println("FICHA TECNICA");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacaoMedia());
        System.out.println("Quantidades de avaliações: " + numAvaliacoes);
        System.out.println("==========================");
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double avaliacaoMedia(){
        double media = avaliacao / numAvaliacoes;
        return media;
    }
}
