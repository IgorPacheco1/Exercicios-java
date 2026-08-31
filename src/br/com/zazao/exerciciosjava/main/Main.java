package br.com.zazao.exerciciosjava.main;

import br.com.zazao.exerciciosjava.records.LivroRecord;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {

//        ConversorMoeda c = new ConversorMoeda();
//        c.converterDolarParaReal(50);
//        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
//        sala.calcularArea(5,3);
//        sala.calcularPerimetro(7,3);
//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//        tabuada.mostrarTabuada(5);
//        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
//        temperatura.celsiusParaFahrenheit(30);
//        temperatura.fahrenheitParaCelsius(10);
//        Livro livro = new Livro("dom pedro", "Brasil",50);
//        livro.calcularPrecoFinal(20);


//        Pessoa manuel = new Pessoa();
//        manuel.setNome("Manuel");
//        manuel.setIdade(57);
//
//        Pessoa yasmin = new Pessoa();
//        yasmin.setNome("Yasmin");
//        yasmin.setIdade(21);
//
//        Pessoa paulo = new Pessoa();
//        paulo.setNome("Paulo");
//        paulo.setIdade(20);
//
//        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
//
//        listaDePessoas.add(manuel);
//        listaDePessoas.add(yasmin);
//        listaDePessoas.add(paulo);
//        System.out.println(listaDePessoas.size());
//        System.out.println(listaDePessoas.get(1));
//        System.out.println("");
//        listaDePessoas.forEach(pessoa -> System.out.println("Nome:" + pessoa.getNome() + " Idade: " + pessoa.getIdade()));

//
//        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
//
//        Produto produto1 = new Produto(5.99,"Biscoito", 10);
//        Produto produto2 = new Produto(8.99,"chocolate", 1);
//        Produto produto3 = new Produto(0.25,"bala", 30);
//
//        listaDeProdutos.add(produto1);
//        listaDeProdutos.add(produto2);
//        listaDeProdutos.add(produto3);
//        System.out.println(listaDeProdutos.size());
//        System.out.println(listaDeProdutos.get(2));
//        System.out.println(listaDeProdutos);
//
//        ProdutoPerecivel produto4 = new ProdutoPerecivel(15.99,"Arroz",15,"01/01/2028");
//
//        System.out.println(produto4);


//        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
//
//        Gson gson = new GsonBuilder().setLenient().create();
//        PessoaRecord pessoa = gson.fromJson(jsonPessoa,PessoaRecord.class);
//        System.out.println(pessoa);

        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Gson gson = new Gson();
        LivroRecord livro = gson.fromJson(jsonLivro, LivroRecord.class);
        System.out.println(livro);



    }
}