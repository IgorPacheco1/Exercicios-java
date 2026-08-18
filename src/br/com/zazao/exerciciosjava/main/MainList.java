package br.com.zazao.exerciciosjava.main;
import br.com.zazao.exerciciosjava.models.Animal;
import br.com.zazao.exerciciosjava.models.Cachorro;
import br.com.zazao.exerciciosjava.models.Produto;
import br.com.zazao.exerciciosjava.models.Titulo;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("teste1");
//        list.add("teste2");
//        list.add("teste3");
//
//        for (String elemento : list){
//            System.out.println(elemento);
//        }
//
//        list.forEach( s -> System.out.println(s));
//
//        Animal animal = new Cachorro();
//
//        if (animal instanceof Cachorro) {
//            Cachorro dog = (Cachorro) animal;
//
//        }
//
//        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
//
//        Produto produto1 = new Produto(5.99,"Feijão", 5);
//        Produto produto2 = new Produto(80,"picanha",1);
//        Produto produto3 = new Produto(1.20,"maravilha",10);
//
//        listaDeProdutos.add(produto1);
//        listaDeProdutos.add(produto2);
//        listaDeProdutos.add(produto3);
//
//        double cont =0;
//        for (Produto produto : listaDeProdutos){
//            cont += produto.getPreco();
//
//        }
//        double media = cont / listaDeProdutos.size();
//        System.out.println(media);

        List<Integer> lista = new ArrayList<>();
        lista.add(27);
        lista.add(13);
        lista.add(66);
        lista.add(103);
        lista.add(14);
        Collections.sort(lista);
        System.out.println(lista);
        List<Titulo> listaDeTitulos = new ArrayList<>();
        Titulo item1 = new Titulo("Duna");
        Titulo item2 = new Titulo("Mafia 3");
        Titulo item3 = new Titulo("Free fire o filme");

        listaDeTitulos.add(item1);
        listaDeTitulos.add(item2);
        listaDeTitulos.add(item3);
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
    }

}
