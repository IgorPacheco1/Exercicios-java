package br.com.zazao.exerciciosjava.main;

import br.com.zazao.exerciciosjava.models.Animal;
import br.com.zazao.exerciciosjava.models.Cachorro;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("teste1");
        list.add("teste2");
        list.add("teste3");

        for (String elemento : list){
            System.out.println(elemento);
        }

        list.forEach( s -> System.out.println(s));

        Cachorro dog = new Cachorro();
        Animal animal = (Animal) dog;
    }

}
